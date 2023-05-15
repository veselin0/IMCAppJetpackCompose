package com.example.imcappjetpackcompose

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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


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
                    .background(backgroundColorMale)
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
                    .background(backgroundColorFemale)
                    .clickable {
                        backgroundColorFemale =
                            if (backgroundColorFemale == Color.LightGray && backgroundColorMale == Color.DarkGray) {
                                Color.DarkGray
                            } else {
                                Color.LightGray
                            }
                        backgroundColorMale = if (backgroundColorMale == Color.LightGray) {
                            Color.DarkGray
                        }else{
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
    }
}

@Composable
fun MySpacer(size: Int) {
    Spacer(modifier = Modifier.height(size.dp))
}