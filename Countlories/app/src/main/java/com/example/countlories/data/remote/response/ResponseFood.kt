package com.example.countlories.data.remote.response

import com.google.gson.annotations.SerializedName

data class ResponseFood(

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

	@field:SerializedName("desc_food")
	val descFood: String,

	@field:SerializedName("protein")
	val protein: Int,

	@field:SerializedName("fat")
	val fat: Int,

	@field:SerializedName("calories")
	val calories: Int,

	@field:SerializedName("food_id")
	val foodId: Int
)
