package maulik.composestarwars.di.network

import maulik.composestarwars.model.StarWarsApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface StarWarsApiService {
    @GET("people")
    suspend fun getStarWarsCharacter(
        @Query("page")
        pageNo: Int
    ): StarWarsApiResponse
}