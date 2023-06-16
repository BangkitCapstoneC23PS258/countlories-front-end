package com.example.countlories.ui.landing

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.countlories.data.remote.response.OutputItem
import com.example.countlories.domain.MyRepository
import com.example.countlories.helper.LoginPreferences
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import javax.inject.Inject

@HiltViewModel
class LandingViewModel @Inject constructor(
    private val repo: dagger.Lazy<MyRepository>,
    private val loginPref: LoginPreferences
):ViewModel() {
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    private val _isFavorite = MutableLiveData<Boolean>()
    val isFavorite: LiveData<Boolean> = _isFavorite

    private val _foodName = MutableLiveData<String>()
    val foodName: LiveData<String> = _foodName

    private val _listFood = MutableLiveData<List<OutputItem>>()
    val listFood: LiveData<List<OutputItem>> = _listFood

    private val _addedToTrack = MutableLiveData<Int>()
    val addedToTrack: LiveData<Int> = _addedToTrack


    fun getNameFromImage(file: MultipartBody.Part){
        _isLoading.value = true
        viewModelScope.launch {
            try {
                val temp = repo.get().getFoodName(file)
                _foodName.value = temp?.payload?.foodName
            } catch (e: Exception){
                Log.d(TAG, "Get nama makanan fail: $e")
            }
        }
    }

    fun getAllFood(){
        _isLoading.value = true
        viewModelScope.launch {
            try {
                _listFood.value = repo.get().getAllFood()
            } catch (e: Exception){
                Log.d(TAG, "Get makanan by name fail: $e")
            } finally {
                _isLoading.value = false
            }
        }
    }

    fun getFoodByName(name: String){
        _isLoading.value = true
        viewModelScope.launch {
            try {
                _listFood.value = repo.get().getFoodByName(name)
            } catch (e: Exception){
                Log.d(TAG, "Get makanan by name fail: $e")
            } finally {
                _isLoading.value = false
            }
        }
    }

    fun addToTracker(foodId: String){
        _isLoading.value = true
        viewModelScope.launch {
            try {
                val userId = loginPref.getUserId()
                val addRes = repo.get().addToTracker(userId!!, foodId)
                if (addRes?.status == "success")
                    _addedToTrack.value = 1
                else
                    _addedToTrack.value = 2
            } catch (e: Exception){
                Log.d(TAG, "Get makanan by name fail: $e")
            } finally {
                _isLoading.value = false
            }
        }
    }

    fun setAddToTrackerDone(){
        _addedToTrack.value = 3
    }

    fun isFavoriteFood(foodId: String){
        _isLoading.value = true
        viewModelScope.launch {
            try {
                val userId = loginPref.getUserId()
                val token = loginPref.getToken()
                val addRes = repo.get().isFavorite(token!!,userId!!, foodId)
                if (addRes?.status == "success")
                    _isFavorite.value = true
                else
                    _isFavorite.value = false
            } catch (e: Exception){
                Log.d(TAG, "Get is favorite fail: $e")
            } finally {
                _isLoading.value = false
            }
        }
    }

    fun setFavorite(foodId: String){
        _isLoading.value = true
        viewModelScope.launch {
            try {
                val favBefore = isFavorite.value!!
                val userId = loginPref.getUserId()
                if (!isFavorite.value!!){
                    repo.get().addToFavorite(userId!!, foodId)
                    _isFavorite.value = !favBefore
                }else{
                    repo.get().removeFromFavorite(userId!!, foodId)
                    _isFavorite.value = !favBefore
                }
            } catch (e: Exception){
                Log.d(TAG, "Get makanan by name fail: $e")
            } finally {
                _isLoading.value = false
            }
        }
    }

    companion object{
        const val TAG = "Landing View Model"
    }
}