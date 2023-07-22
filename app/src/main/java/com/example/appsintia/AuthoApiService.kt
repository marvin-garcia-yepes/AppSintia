package com.example.appsintia

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthoApiService {
    @POST("auth")
    suspend fun getLogin(@Body loginDto: LoginDto) :
            Response<TokenDto>
}