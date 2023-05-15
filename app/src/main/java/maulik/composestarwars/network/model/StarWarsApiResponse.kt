package maulik.composestarwars.network.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class StarWarsApiResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("results")
    val characters: List<StarWarsCharacter>
)
@Keep
data class StarWarsCharacter(
    @SerializedName("name")
    val name: String
)
