package ru.irinavb.food2fork.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.irinavb.food2fork.network.RecipeService
import ru.irinavb.food2fork.network.model.RecipeDtoMapper
import ru.irinavb.food2fork.repository.RecipeRepository
import ru.irinavb.food2fork.repository.RecipeRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryObject {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeService,
        recipeDtoMapper: RecipeDtoMapper
    ): RecipeRepository {
        return RecipeRepositoryImpl(recipeService, recipeDtoMapper)
    }
}