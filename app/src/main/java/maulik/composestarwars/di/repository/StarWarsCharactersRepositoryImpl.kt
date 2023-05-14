package maulik.composestarwars.di.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import maulik.composestarwars.di.network.StarWarsApiService
import javax.inject.Inject

class StarWarsCharactersRepositoryImpl @Inject constructor(
    private val starWarsApiService: StarWarsApiService
) : StarWarsCharactersRepository {

    override fun getCharacters() = Pager(
        config = PagingConfig(10, prefetchDistance = 2, initialLoadSize = 1),
        pagingSourceFactory = {
            StarWarsCharactersPagingSource(starWarsApiService)
        }
    ).flow

}