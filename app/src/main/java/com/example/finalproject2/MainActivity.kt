package com.example.finalproject2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.finalproject2.screens.DataScience
import com.example.finalproject2.screens.InteractiveMedia
import com.example.finalproject2.screens.HomePage
import com.example.finalproject2.screens.InternshipPage
import com.example.finalproject2.screens.CoursePage
import com.example.finalproject2.screens.SignUpPage
import com.example.finalproject2.ui.theme.FinalProject2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinalProject2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            SignUpPage(navController)
        }
        composable("home") {
            HomePage(navController)
        }
        composable("profile") {

        }
        composable("interactivemedia") {
            InteractiveMedia(navController)

        }
        composable("datascience") {
            DataScience(navController)
        }
        composable("internship") {
            InternshipPage(navController)
        }
        composable("course") {
            CoursePage(navController)

        }
    }

}
