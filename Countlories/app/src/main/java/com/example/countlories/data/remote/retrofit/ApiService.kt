package com.example.countlories.data.remote.retrofit

import com.example.countlories.data.remote.response.ResponseCheckFavorite
import com.example.countlories.data.remote.response.ResponseFood
import com.example.countlories.data.remote.response.ResponseLogin
import com.example.countlories.data.remote.response.ResponseRegister
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @POST("login")
    @JvmSuppressWildcards
    suspend fun loginUser(
        @Body body: Map<String, Any>
    ):Response<ResponseLogin>

    @POST("register")
    @JvmSuppressWildcards
    suspend fun RegisterUser(
        @Body body: Map<String, Any>
    ):Response<ResponseRegister>

    @GET("getfoodname/{name}")
    suspend fun getFoodByName(
        @Path("name") foodName: String
    ): Response<ResponseFood>

    @GET("getfood")
    suspend fun getAllFood(): Response<ResponseFood>

    @POST("posttracker")
    @JvmSuppressWildcards
    suspend fun addToTrack(
        @Body body: Map<String, Any>
    ):Response<ResponseRegister>

    @GET("getfavid/{userId}/{foodId}")
    suspend fun isFavorite(
        @Header("Authorization") token: String,
        @Path("userId") userId: String,
        @Path("foodId") foodId: String,
    ): Response<ResponseCheckFavorite>

    @POST("postfav")
    @JvmSuppressWildcards
    suspend fun addToFavorite(
        @Body body: Map<String, Any>
    ):Response<ResponseRegister>

    @DELETE("deletefav/{userId}/{foodId}")
    suspend fun removeFromFavorite(
        @Path("userId") userId: String,
        @Path("foodId") foodId: String,
    ): Response<ResponseRegister>
}