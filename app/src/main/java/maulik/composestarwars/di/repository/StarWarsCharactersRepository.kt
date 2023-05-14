package maulik.composestarwars.di.repository

import androidx.paging.Pager
import androidx.paging.PagingData
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow
import maulik.composestarwars.model.StarWarsCharacter

interface StarWarsCharactersRepository {
    fun getCharacters(): Flow<PagingData<StarWarsCharacter>>
}