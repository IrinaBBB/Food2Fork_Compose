package ru.irinavb.food2fork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.irinavb.food2fork.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(
                modifier = Modifier
                    .background(BackgroundColor)
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.burger),
                        contentDescription = "image of a burger",
                        modifier = Modifier.height(300.dp),
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        modifier = Modifier.padding(24.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ) {
                            Text(
                                text = "Burger",
                                style = TextStyle(
                                    fontSize = 42.sp,
                                    color = MainHeaderColor,
                                ),
                                modifier = Modifier.alignByBaseline()
                            )
                            Text(
                                text = "$5.99",
                                style = TextStyle(
                                    fontSize = 25.sp,
                                    color = SecondaryHeaderColor
                                ),
                                modifier = Modifier
                                    .alignByBaseline()
                                    .paddingFromBaseline(0.dp, 4.dp)
                            )
                        }
                        Spacer(modifier = Modifier.padding(top = 10.dp))
                        Text(
                            text = "800 calories",
                            style = TextStyle(
                                fontSize = 32.sp,
                                color = HeaderColor
                            ),
                        )
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(0.dp, 20.dp)) {
                                Text(text = "ORDER NOW")
                            }
                        }
                    }
                }
            }
        }
    }
}



