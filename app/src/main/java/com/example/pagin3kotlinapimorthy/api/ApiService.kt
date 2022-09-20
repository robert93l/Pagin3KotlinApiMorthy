package com.example.pagin3kotlinapimorthy.api

import com.example.pagin3kotlinapimorthy.models.ResponseApi
import com.example.pagin3kotlinapimorthy.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getAllCharacters(
        @Query("page") page: Int
    ): Response<ResponseApi>
}