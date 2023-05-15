package maulik.composestarwars.di.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import maulik.composestarwars.repository.StarWarsCharactersRepository
import maulik.composestarwars.repository.StarWarsCharactersRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindsStarWarsPagingRepository(impl: StarWarsCharactersRepositoryImpl): StarWarsCharactersRepository

}