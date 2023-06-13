package com.example.countlories.data.remote.response

import com.google.gson.annotations.SerializedName

data class ResponseLogin(

	@field:SerializedName("idUser")
	val idUser: Int,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: String,

	@field:SerializedName("token")
	val token: String
)
