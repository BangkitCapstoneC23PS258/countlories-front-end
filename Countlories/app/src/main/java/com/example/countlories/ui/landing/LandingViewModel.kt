package com.example.countlories.ui.landing

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.countlories.data.remote.response.Output
import com.example.countlories.domain.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import javax.inject.Inject

@HiltViewModel
class LandingViewModel @Inject constructor(
    private val repo: dagger.Lazy<MyRepository>
):ViewModel() {
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    private val _foodName = MutableLiveData<String>()
    val foodName: LiveData<String> = _foodName

    private val _listFood = MutableLiveData<List<Output>>()
    val listFood: LiveData<List<Output>> = _listFood

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

//    fun getFoodByName(name: String){
//        _isLoading.value = true
//        viewModelScope.launch {
//            try {
//                val temp = repo.get().getFoodByName(name)
//                _listFood.value = temp.output
//            }
//        }
//    }

    companion object{
        const val TAG = "Landing View Model"
    }
}