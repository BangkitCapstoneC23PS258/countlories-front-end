package com.example.countlories.data.remote.response

import com.google.gson.annotations.SerializedName

data class ResponseFood(

	@field:SerializedName("output")
	val output: List<OutputItem>,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: String
)

data class OutputItem(

	@field:SerializedName("carb")
	val carb: String,

	@field:SerializedName("food_name")
	val foodName: String,

	@field:SerializedName("desc_food")
	val descFood: String,

	@field:SerializedName("protein")
	val protein: String,

	@field:SerializedName("fat")
	val fat: String,

	@field:SerializedName("food_photo")
	val foodPhoto: String,

	@field:SerializedName("calories")
	val calories: String,

	@field:SerializedName("food_id")
	val foodId: Int
)
