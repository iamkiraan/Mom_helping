package com.example.mom



import Show
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    lateinit var navController : NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController= rememberNavController()


            SetUpNavigation(navController = navController)
        }
    }
}

