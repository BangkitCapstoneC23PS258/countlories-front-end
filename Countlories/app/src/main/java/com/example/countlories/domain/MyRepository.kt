package com.example.countlories.domain

import com.example.countlories.data.remote.response.ResponseFood
import com.example.countlories.data.remote.response.ResponseImageFood
import com.example.countlories.data.remote.response.ResponseLogin
import okhttp3.MultipartBody

interface MyRepository {
    suspend fun login(email: String, pass: String): ResponseLogin?
    suspend fun getFoodName(file: MultipartBody.Part):ResponseImageFood?
    suspend fun getFoodByName(name: String):ResponseFood?
}