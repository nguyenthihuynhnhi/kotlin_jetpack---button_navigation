package com.example.button_navigation.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
fun Screen1(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Back 1 level")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Screen 1 - màn hình 1")

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { navController.navigate("main_screen") }) {
                Text(text = "Cancel")
            }

            Button(onClick = { navController.navigate("screen2") }) {
                Text(text = "Next")
            }
        }
    }
}