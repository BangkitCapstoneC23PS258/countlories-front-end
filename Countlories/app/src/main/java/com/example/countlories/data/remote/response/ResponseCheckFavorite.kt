package com.example.countlories.data.remote.response

import com.google.gson.annotations.SerializedName

data class ResponseCheckFavorite(

	@field:SerializedName("idUser")
	val idUser: Int,

	@field:SerializedName("output")
	val output: Output,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: String
)

data class Output(

	@field:SerializedName("food_name")
	val foodName: String,

	@field:SerializedName("password")
	val password: String,

	@field:SerializedName("user_id")
	val userId: Int,

	@field:SerializedName("desc_food")
	val descFood: String,

	@field:SerializedName("protein")
	val protein: String,

	@field:SerializedName("fat")
	val fat: String,

	@field:SerializedName("calories")
	val calories: String,

	@field:SerializedName("food_id")
	val foodId: Int,

	@field:SerializedName("email")
	val email: String,

	@field:SerializedName("username")
	val username: String
)
