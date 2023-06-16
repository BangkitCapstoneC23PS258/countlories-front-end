package com.example.countlories.domain

import com.example.countlories.data.remote.response.*
import okhttp3.MultipartBody

interface MyRepository {
    suspend fun register(username: String, email: String, pass: String): ResponseRegister?
    suspend fun login(email: String, pass: String): ResponseLogin?
    suspend fun getFoodName(file: MultipartBody.Part):ResponseImageFood?
    suspend fun getFoodByName(name: String):List<OutputItem>?
    suspend fun getAllFood():List<OutputItem>?
    suspend fun addToTracker(userId: String, foodId: String): ResponseRegister?
    suspend fun isFavorite(token: String, userId: String, foodId: String): ResponseCheckFavorite?
    suspend fun addToFavorite(userId: String, foodId: String): ResponseRegister?
    suspend fun removeFromFavorite(userId: String, foodId: String): ResponseRegister?

}