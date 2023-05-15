package maulik.composestarwars.network.model

import com.google.gson.annotations.SerializedName

data class StarWarsApiResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("results")
    val characters: List<StarWarsCharacter>
)

data class StarWarsCharacter(
    @SerializedName("name")
    val name: String
)
