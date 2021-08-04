package ru.irinavb.food2fork.network.responses

import com.google.gson.annotations.SerializedName
import ru.irinavb.food2fork.network.model.RecipeDto

data class RecipeSearchResponse(

    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeDto>
)
