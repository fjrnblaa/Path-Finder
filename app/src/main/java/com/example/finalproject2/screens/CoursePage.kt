package com.example.finalproject2.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.finalproject2.MyTopBar2
import com.example.finalproject2.R

@Composable
fun CoursePage(navController : NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            MyTopBar2(
                onClick1 = {
                    navController.navigate("home")},
                onClick2 = {
                    //profilepage
                }
            )
            Column (
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.revou),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(38.dp)
                )
            }

            Column(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 24.dp)
            ) {
                Text(
                    text = "Data Science",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Revou",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )

                Text(
                    text = "di Kota Tangerang Selatan",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light
                )

                Card(
                    modifier = Modifier
                        .padding(top=12.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(4.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(18.dp, 20.dp)
                    ) {
                        Text(
                            text = "Description",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                        )
                        Text(
                            text = "Revou's Data Science course is designed to equip participants with comprehensive knowledge and practical skills in the field of data science. This course covers a wide range of topics, including data analysis, machine learning, and data visualization. Participants will engage in hands-on projects, working with real-world datasets to develop a strong understanding of data science concepts and methodologies. The curriculum is crafted to cater to both beginners and those with some prior experience in the field, fostering a supportive learning environment. By the end of the course, participants will be well-prepared to apply data science techniques to solve complex problems and make data-driven decisions.",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Justify
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(top = 12.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(4.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(18.dp, 20.dp)
                    ) {
                        Text(
                            text = "Criteria",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                        )
                        Text(
                            text = "1. Enthusiastic learners with a curiosity for data science.\n" +
                                    "2. Basic proficiency in programming (preferably in Python).\n" +
                                    "3. No prior experience in data science is required, but a foundational understanding of mathematics and statistics is beneficial.\n" +
                                    "4. Individuals seeking to enhance their skills in data analysis, machine learning, and data visualization for professional growth.",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Justify
                        )
                    }
                }


            }
        }

    }

}

@Preview
@Composable
fun CoursePagePreview() {
    InternshipPage(rememberNavController())
}