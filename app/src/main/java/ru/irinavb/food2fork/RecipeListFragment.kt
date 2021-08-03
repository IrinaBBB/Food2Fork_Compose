package ru.irinavb.food2fork

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.Fragment

class RecipeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
        view.findViewById<ComposeView>(R.id.compose_view).setContent {
            Column(
                modifier = Modifier
                    .border(BorderStroke(2.dp, Blue))
                    .padding(16.dp)
            ) {
                Text(text = "THIS IS A COMPOSABLE")
                Spacer(modifier = Modifier.padding(10.dp))
                CircularProgressIndicator()
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = "Neat")
                Spacer(modifier = Modifier.padding(10.dp))
                
                val customView = HorizontalDottedProgress(context = requireContext())
                AndroidView(factory = {customView})
            }
        }
        return view
    }
}