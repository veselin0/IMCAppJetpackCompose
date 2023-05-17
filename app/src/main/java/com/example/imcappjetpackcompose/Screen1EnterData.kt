package com.example.imcappjetpackcompose

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun Screen1EnterData() {

    val context = LocalContext.current

    var backgroundColorMale by remember { mutableStateOf(Color.DarkGray) }
    var backgroundColorFemale by remember { mutableStateOf(Color.LightGray) }

    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(24.dp), horizontalArrangement = Arrangement.Center

        ) {
            Box(
                modifier = Modifier
//                    .weight(1f)
                    .width(155.dp)
                    .height(155.dp)
                    .padding(20.dp)
                    .background(backgroundColorMale, RoundedCornerShape(16.dp))
                    .clickable {
                        backgroundColorMale =
                            if (backgroundColorMale == Color.DarkGray) {
                                Color.LightGray
                            } else {
                                Color.DarkGray
                            }
                        backgroundColorFemale = if (backgroundColorFemale == Color.LightGray) {
                            Color.DarkGray
                        } else {
                            Color.LightGray
                        }
                    }, contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_male_24),
                        contentDescription = "male icon",
                        tint = Color.White,
                        modifier = Modifier
                            .width(60.dp)
                            .height(60.dp)
                    )
                    Text(text = "Hombre", color = Color.White)
                }

            }

            Box(
                modifier = Modifier
//                    .weight(1f)
                    .width(155.dp)
                    .height(155.dp)
                    .padding(20.dp)
                    .background(backgroundColorFemale, RoundedCornerShape(16.dp))
                    .clickable {
                        backgroundColorFemale =
                            if (backgroundColorFemale == Color.LightGray && backgroundColorMale == Color.DarkGray) {
                                Color.DarkGray
                            } else {
                                Color.LightGray
                            }
                        backgroundColorMale = if (backgroundColorMale == Color.LightGray) {
                            Color.DarkGray
                        } else {
                            Color.LightGray
                        }
                    }, contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_female_24),
                        contentDescription = "female icon",
                        tint = Color.White,
                        modifier = Modifier
                            .width(60.dp)
                            .height(60.dp)
                    )
                    Text(text = "Mujer", color = Color.White)
                }

            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(24.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                var sliderValue by remember {
                    mutableStateOf(100f) // pass the initial value
                }
                Text(text = "Height", fontSize = 24.sp, color = Color.White)
                Text(text = "${sliderValue.toInt()} cm", fontSize = 24.sp, color = Color.White)


                Slider(
                    value = sliderValue,
                    onValueChange = { sliderValue_ ->
                        sliderValue = sliderValue_
                    },
                    onValueChangeFinished = {
                        // this is called when the user completed selecting the value
                        Log.d("MainActivity", "sliderValue = $sliderValue")
                    },
                    valueRange = 100f..250f
                )
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(24.dp)
        ) {
            Box(
                modifier = Modifier
//                    .weight(1f)
                    .width(155.dp)
                    .height(155.dp)
                    .padding(20.dp)
                    .background(Color.LightGray, RoundedCornerShape(16.dp)),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    var weightValue by remember {
                        mutableStateOf(70f) // pass the initial value
                    }
                    Text(text = "Weight", fontSize = 24.sp, color = Color.White)
                    Text(text = "${weightValue.toInt()} kg", fontSize = 24.sp, color = Color.White)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        horizontalArrangement = Arrangement.Center,
//                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            Modifier
                                .weight(1f)
                                .padding(end = 4.dp)
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.baseline_add_24),
                                tint = Color.White,
                                contentDescription = "Icon sign plus",
                                modifier = Modifier
                                    .width(60.dp)
                                    .height(60.dp)
                            )
                        }
                        Button(
                            onClick = { /*TODO*/ },
                            Modifier
                                .weight(1f)
                                .padding(start = 4.dp)
                        ) {

                        }
                    }
                }
//                    Icon(
//                        painter = painterResource(R.drawable.baseline_male_24),
//                        contentDescription = "male icon",
//                        tint = Color.White,
//                        modifier = Modifier
//                            .width(60.dp)
//                            .height(60.dp)
//                    )
//                    Text(text = "Hombre", color = Color.White)
            }

        }

        Box(
            modifier = Modifier
//                    .weight(1f)
                .width(155.dp)
                .height(155.dp)
                .padding(20.dp)
                .background(backgroundColorFemale, RoundedCornerShape(16.dp))
                .clickable {
                    backgroundColorFemale =
                        if (backgroundColorFemale == Color.LightGray && backgroundColorMale == Color.DarkGray) {
                            Color.DarkGray
                        } else {
                            Color.LightGray
                        }
                    backgroundColorMale = if (backgroundColorMale == Color.LightGray) {
                        Color.DarkGray
                    } else {
                        Color.LightGray
                    }
                }, contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    painter = painterResource(R.drawable.baseline_female_24),
                    contentDescription = "female icon",
                    tint = Color.White,
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp)
                )
                Text(text = "Mujer", color = Color.White)
            }

        }
//            Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                var weightValue by remember {
//                    mutableStateOf(70f) // pass the initial value
//                }
//                Text(text = "Weight", fontSize = 24.sp, color = Color.White)
//                Text(text = "${weightValue.toInt()} kg", fontSize = 24.sp, color = Color.White)
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(8.dp),
//                    horizontalArrangement = Arrangement.Center,
//                    //verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(end = 8.dp)) {
//                        Icon(
//                            painter = painterResource(R.drawable.baseline_add_24),
//                            contentDescription = "Add sign"
//                        )
//                    }
//                    Button(onClick = { /*TODO*/ }) {
//                        Icon(
//                            painter = painterResource(R.drawable.baseline_remove_24),
//                            contentDescription = "Subtract sign"
//                        )
//                    }
//                }
//            }
//            Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                var weightValue by remember {
//                    mutableStateOf(70f) // pass the initial value
//                }
//                Text(text = "Weight", fontSize = 24.sp, color = Color.White)
//                Text(text = "${weightValue.toInt()} kg", fontSize = 24.sp, color = Color.White)
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(8.dp),
//                    horizontalArrangement = Arrangement.Center,
//                    //verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(end = 8.dp)) {
//                        Icon(
//                            painter = painterResource(R.drawable.baseline_add_24),
//                            contentDescription = "Add sign"
//                        )
//                    }
//                    Button(onClick = { /*TODO*/ }) {
//                        Icon(
//                            painter = painterResource(R.drawable.baseline_remove_24),
//                            contentDescription = "Subtract sign"
//                        )
//                    }
//                }
//
//            }
    }

    @Composable
    fun MySpacer(size: Int) {
        Spacer(modifier = Modifier.height(size.dp))
    }
}
