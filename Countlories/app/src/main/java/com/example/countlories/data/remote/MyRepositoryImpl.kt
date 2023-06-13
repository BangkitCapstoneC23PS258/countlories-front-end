package com.example.countlories.data.remote

import com.example.countlories.data.remote.response.ResponseFood
import com.example.countlories.data.remote.response.ResponseImageFood
import com.example.countlories.data.remote.response.ResponseLogin
import com.example.countlories.data.remote.retrofit.ApiService
import com.example.countlories.data.remote.retrofit.ApiServiceML
import com.example.countlories.domain.MyRepository
import okhttp3.MultipartBody

class MyRepositoryImpl(
    private val ApiService: ApiService,
    private val ApiServiceML: ApiServiceML
): MyRepository {
    override suspend fun login(email: String, pass: String): ResponseLogin? {
        val response = ApiService.loginUser(email,pass)
        return if (response.isSuccessful) response.body() else null
    }

    override suspend fun getFoodName(file: MultipartBody.Part): ResponseImageFood? {
        val response = ApiServiceML.getFoodName(file)
        return if (response.isSuccessful) response.body() else null
    }

    override suspend fun getFoodByName(name: String): ResponseFood? {
        val response = ApiService.getFoodByName(name)
        return if (response.isSuccessful) response.body() else null
    }

}