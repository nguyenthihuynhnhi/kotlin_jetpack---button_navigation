package com.example.button_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.button_navigation.ui.component.Screen1
import com.example.button_navigation.ui.component.Screen2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //Tạo 1 controller để quản lý điều hướng
            val navController = rememberNavController()

            // Thiết lập NavHost để quản lý các composable (màn hình)
            NavHost(navController = navController, startDestination = "main_screen") {
                composable("main_screen") { MainScreen(navController) }
                composable("screen1") { Screen1(navController) }
                composable("screen2") { Screen2(navController) }
            }
        }
    }
}