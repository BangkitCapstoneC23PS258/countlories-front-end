package com.example.countlories.ui.auth

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.countlories.domain.MyRepository
import com.example.countlories.helper.LoginPreferences
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val repo: dagger.Lazy<MyRepository>,
    private val loginPref: LoginPreferences
): ViewModel(){
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    private val _loginProc = MutableLiveData<Int>()
    val loginProc: LiveData<Int> = _loginProc

    fun login(email: String, pass: String){
        _isLoading.value = true
        viewModelScope.launch {
            try {
                val loginRes = repo.get().login(email,pass)
                if (loginRes?.status == "success"){
                    loginPref.setToken(loginRes.token)
                    loginPref.setUserId(loginRes.idUser.toString())
                    loginPref.setIsLogin(true)
                    _loginProc.value = 1
                }
                else
                    _loginProc.value = 2
            } catch (e: Exception){
                Log.d(TAG, "login fail: $e")
            } finally {
                _isLoading.value = false
            }
        }
    }

    fun setLoginDone(){
        _loginProc.value = 3
    }

    companion object{
        private const val TAG = "Auth Viewmodel"
    }
}