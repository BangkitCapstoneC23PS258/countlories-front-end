package com.example.countlories.data.remote.retrofit

import com.example.countlories.data.remote.response.ResponseImageFood
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiServiceML {
    @Multipart
    @POST("get_predict?")
    suspend fun getFoodName(
        @Part file: MultipartBody.Part,
    ): Response<ResponseImageFood>
}