package ru.irinavb.food2fork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.irinavb.food2fork.ui.theme.Food2ForkTheme
import ru.irinavb.food2fork.ui.theme.Purple200
import ru.irinavb.food2fork.ui.theme.Purple700

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Hey look some text")
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Button(
                    onClick = {},
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        text = "A Button",
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .background(brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color.Yellow,
                                    Purple700
                                )))
                            .padding(8.dp)
                    )
                }
            }
        }
    }
}


