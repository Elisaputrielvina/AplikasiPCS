package com.example.aplikasipcs.api

import android.telecom.Call
import com.example.aplikasipcs.response.LoginResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiEndpoint {
    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email : String,
        @Field("password") password : String
    ) : retrofit2.Call <LoginResponse>
}