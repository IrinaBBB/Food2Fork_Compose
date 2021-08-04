package ru.irinavb.food2fork.domain.util

import ru.irinavb.food2fork.domain.model.Recipe
import ru.irinavb.food2fork.network.model.RecipeDto

interface DomainMapper<T, DomainModel> {

    fun mapToDomainModel(model: T): DomainModel
    fun mapFromDomainModel(domainModel: DomainModel): T
    fun toDomainList(initial: List<RecipeDto>): List<Recipe>
    fun fromDomainList(initial: List<Recipe>): List<RecipeDto>
}



