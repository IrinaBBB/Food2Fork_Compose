package ru.irinavb.food2fork.repository

import ru.irinavb.food2fork.domain.model.Recipe
import ru.irinavb.food2fork.domain.util.DomainMapper
import ru.irinavb.food2fork.network.RecipeService
import ru.irinavb.food2fork.network.model.RecipeDto

class RecipeRepositoryImpl(
    private val recipeService: RecipeService,
    private val mapper: DomainMapper<RecipeDto, Recipe>
) : RecipeRepository {

    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper.toDomainList(recipeService.search(token, page, query).recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token, id))
    }
}