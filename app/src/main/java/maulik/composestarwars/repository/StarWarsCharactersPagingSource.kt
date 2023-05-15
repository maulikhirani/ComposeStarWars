package maulik.composestarwars.repository

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import maulik.composestarwars.network.StarWarsApiService
import maulik.composestarwars.network.model.StarWarsCharacter

class StarWarsCharactersPagingSource constructor(
    private val starWarsApiService: StarWarsApiService
): PagingSource<Int, StarWarsCharacter>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, StarWarsCharacter> {
        val pageNo = params.key ?: 1
        try {
            val response = starWarsApiService.getStarWarsCharacter(pageNo)
            return LoadResult.Page(
                response.characters,
                prevKey = if (pageNo == 1) null else pageNo.minus(1),
                nextKey = if (response.characters.isEmpty()) null else pageNo.plus(1)
            )
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, StarWarsCharacter>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }
}