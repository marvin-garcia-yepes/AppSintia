package com.example.appsintia

import com.google.gson.annotations.SerializedName

data class TokenDto(
    @SerializedName("accessToken") val accessTokenVerify: String)
