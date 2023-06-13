package com.example.countlories.data.remote.retrofit

import com.example.countlories.data.remote.response.ResponseFood
import com.example.countlories.data.remote.response.ResponseLogin
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @FormUrlEncoded
    @POST("login")
    suspend fun loginUser(
        @Field("email") email: String,
        @Field("password") password: String,
    ):Response<ResponseLogin>

    @GET("getfoodname/{name}")
    suspend fun getFoodByName(
        @Path("name") foodName: String
    ): Response<ResponseFood>


}