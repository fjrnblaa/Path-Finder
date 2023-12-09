package com.example.finalproject2.screens

import android.view.Surface
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.finalproject2.CourseCard
import com.example.finalproject2.DataCardComponent
import com.example.finalproject2.Greetings
import com.example.finalproject2.IMCardComponent
import com.example.finalproject2.InternCard
import com.example.finalproject2.MyBodyText
import com.example.finalproject2.MyTopBar
import com.example.finalproject2.SubHeading

@Composable
fun HomePage(navController: NavController) {
    Surface (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
        ){
        Column (
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ){
            MyTopBar(
                onClick = {
                    //ProfilePage
                }
            )
            Spacer(modifier = Modifier.padding(top = 24.dp))
            Greetings(greeting = "Hello, Jasmine! \uD83D\uDC4B")
            Spacer(modifier = Modifier.padding(top = 8.dp))
            MyBodyText(value = "What do you want to explore today?")
            Spacer(modifier = Modifier.padding(bottom = 24.dp))

            SubHeading(value = "Related Stream")
            Spacer(modifier = Modifier.padding(bottom = 16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                DataCardComponent(
                    onClick1 = {
                        navController.navigate("datascience")
                    }
                )
                IMCardComponent(
                    onClick1 = {
                        navController.navigate("interactivemedia")
                    }
                )
            }

            Spacer(modifier = Modifier.padding(bottom = 24.dp))
            SubHeading(value = "Course For You")
            Spacer(modifier = Modifier.padding(bottom = 16.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CourseCard(
                    onClick = {
                        navController.navigate("course")
                    }
                )
                CourseCard(
                    onClick = {
                        navController.navigate("course")
                    }
                )
                CourseCard(
                    onClick = {
                        navController.navigate("course")
                    }
                )
                CourseCard(
                    onClick = {
                        navController.navigate("course")
                    }
                )
            }

            Spacer(modifier = Modifier.padding(bottom = 24.dp))
            SubHeading(value = "Internship Opportunity")
            Spacer(modifier = Modifier.padding(bottom = 16.dp))

           Row(
               modifier = Modifier
                   .fillMaxWidth()
                   .horizontalScroll(rememberScrollState())
                   .padding(start = 16.dp)
           ){
               InternCard(
                   onClick = {
                       //Internship page
                       navController.navigate("internship")
                   }
               )

               InternCard(
                   onClick = {
                       //Internship page
                       navController.navigate("internship")
                   }
               )

               InternCard(
                   onClick = {
                       //Internship page
                       navController.navigate("internship")
                   }
               )

               InternCard(
                   onClick = {
                       //Internship page
                       navController.navigate("internship")
                   }
               )
           }



        }
    }
}

@Preview
@Composable
fun HomePageView() {

    HomePage(rememberNavController())

}

