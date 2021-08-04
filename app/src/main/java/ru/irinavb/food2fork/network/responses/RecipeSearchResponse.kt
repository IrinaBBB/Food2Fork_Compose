package ru.irinavb.food2fork.network.responses

import com.google.gson.annotations.SerializedName
import ru.irinavb.food2fork.network.model.RecipeNetworkEntity

class RecipeSearchResponse(

    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeNetworkEntity>
)
