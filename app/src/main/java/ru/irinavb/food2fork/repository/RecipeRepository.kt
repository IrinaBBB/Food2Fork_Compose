package ru.irinavb.food2fork.repository

import ru.irinavb.food2fork.domain.model.Recipe

interface RecipeRepository {

    suspend fun search(token: String, page: Int, query: String): List<Recipe>

    suspend fun get(token: String, id: Int): Recipe
}
