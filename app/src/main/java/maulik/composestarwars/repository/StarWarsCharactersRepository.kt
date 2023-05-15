package maulik.composestarwars.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import maulik.composestarwars.network.model.StarWarsCharacter

interface StarWarsCharactersRepository {
    fun getCharacters(): Flow<PagingData<StarWarsCharacter>>
}