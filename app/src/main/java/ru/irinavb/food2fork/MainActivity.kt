package ru.irinavb.food2fork

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ru.irinavb.food2fork.domain.model.Recipe
import ru.irinavb.food2fork.network.model.RecipeNetworkMapper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

@Preview
@Composable
fun SquareComposablePreview() {
}



