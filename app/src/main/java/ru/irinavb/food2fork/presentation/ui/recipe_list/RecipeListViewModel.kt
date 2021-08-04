package ru.irinavb.food2fork.presentation.ui.recipe_list

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeListViewModel
@Inject constructor(
     private val randomString: String
): ViewModel() {

    init {
        Log.d("VIEWMODEL:",  "on Create!!!!!!!!!!!!!!!!!!!!!!!!$randomString")
    }

}