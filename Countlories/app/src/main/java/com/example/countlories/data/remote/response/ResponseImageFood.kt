package com.example.countlories.data.remote.response

import com.google.gson.annotations.SerializedName

data class ResponseImageFood(

	@field:SerializedName("payload")
	val payload: Payload,

	@field:SerializedName("status")
	val status: Int
)

data class Payload(

	@field:SerializedName("food_name")
	val foodName: String
)
