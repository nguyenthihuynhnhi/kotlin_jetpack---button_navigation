package com.example.button_navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(), //full cột
        horizontalAlignment = Alignment.CenterHorizontally, // căn giữa ngang
        verticalArrangement = Arrangement.Center //căn giữa dọc
        //=> nằm giữa
    )
    {
        Text(text = "Main Screen - màn hình chính")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate("screen1") }) {
            Text(text = "Go to screen 1 - Đi tới màn hình 1")
        }
    }
}