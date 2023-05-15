package maulik.composestarwars.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import maulik.composestarwars.network.StarWarsApiService
import javax.inject.Inject

class StarWarsCharactersRepositoryImpl @Inject constructor(
    private val starWarsApiService: StarWarsApiService
) : StarWarsCharactersRepository {

    override fun getCharacters() = Pager(
        config = PagingConfig(10),
        pagingSourceFactory = {
            StarWarsCharactersPagingSource(starWarsApiService)
        }
    ).flow

}