package ru.irinavb.food2fork.network

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import ru.irinavb.food2fork.network.model.RecipeDto
import ru.irinavb.food2fork.network.responses.RecipeSearchResponse

interface RecipeService {

    @GET("search")
    suspend fun search(
        @Header("Authorization") token: String,
        @Query("page") page: Int,
        @Query("query") query: String
    ): RecipeSearchResponse

    @GET("get")
    suspend fun get(
        @Header("Authorization") token: String,
        @Query ("id") id: Int
    ): RecipeDto
}