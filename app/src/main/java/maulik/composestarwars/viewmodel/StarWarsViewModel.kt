package maulik.composestarwars.viewmodel

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import maulik.composestarwars.di.repository.StarWarsCharactersRepository
import maulik.composestarwars.model.StarWarsCharacter
import javax.inject.Inject

@HiltViewModel
class StarWarsViewModel @Inject constructor(
    private val repository: StarWarsCharactersRepository
): ViewModel() {

    fun getCharacters(): Flow<PagingData<StarWarsCharacter>> = repository.getCharacters()

}