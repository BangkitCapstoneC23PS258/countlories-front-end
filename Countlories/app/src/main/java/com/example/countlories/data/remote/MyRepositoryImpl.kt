package com.example.countlories.data.remote

import android.util.Log
import com.example.countlories.data.remote.response.*
import com.example.countlories.data.remote.retrofit.ApiService
import com.example.countlories.data.remote.retrofit.ApiServiceML
import com.example.countlories.domain.MyRepository
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.json.JSONObject

class MyRepositoryImpl(
    private val ApiService: ApiService,
    private val ApiServiceML: ApiServiceML
): MyRepository {

    override suspend fun register(username: String, email: String, pass: String): ResponseRegister? {
        val body = mapOf(
            "username" to username,
            "email" to email,
            "password" to pass
        )
        val response = ApiService.RegisterUser(body)
        return if (response.isSuccessful) response.body() else null
    }

    override suspend fun login(email: String, pass: String): ResponseLogin? {
        val body = mapOf(
            "email" to email,
            "password" to pass
        )
        val response = ApiService.loginUser(body)
        return if (response.isSuccessful) response.body() else null
    }

    override suspend fun getFoodName(file: MultipartBody.Part): ResponseImageFood? {
        val response = ApiServiceML.getFoodName(file)
        return if (response.isSuccessful) response.body() else null
    }

    override suspend fun getFoodByName(name: String): List<OutputItem>? {
        val response = ApiService.getFoodByName(name)
        return if (response.isSuccessful) response.body()?.output else null
    }

    override suspend fun getAllFood(): List<OutputItem>? {
        val response = ApiService.getAllFood()
        return if (response.isSuccessful) response.body()?.output else null
    }

    override suspend fun addToTracker(userId: String, foodId: String): ResponseRegister? {
        val body = mapOf(
            "user_id" to userId,
            "food_id" to foodId
        )
        val response = ApiService.addToTrack(body)
        return if (response.isSuccessful) response.body() else null
    }

    override suspend fun isFavorite(token: String, userId: String, foodId: String
    ): ResponseCheckFavorite? {
        val response = ApiService.isFavorite(token, userId, foodId)
        return if (response.isSuccessful) response.body() else null
    }

    override suspend fun addToFavorite(userId: String, foodId: String): ResponseRegister? {
        val body = mapOf(
            "user_id" to userId,
            "food_id" to foodId
        )
        val response = ApiService.addToFavorite(body)
        return if (response.isSuccessful) response.body() else null
    }

    override suspend fun removeFromFavorite(userId: String, foodId: String): ResponseRegister? {
        val response = ApiService.removeFromFavorite(userId,foodId)
        return if (response.isSuccessful) response.body() else null
    }

}