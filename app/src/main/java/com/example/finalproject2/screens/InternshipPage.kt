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
fun InternshipPage(navController : NavController) {
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
                    .padding(start = 16.dp, end = 16.dp, top = 24.dp, bottom = 8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.traveloka),
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
                    text = "Product Designer",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Traveloka",
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
                            text = "Interning with the certified Traveloka Internship Program is a career-based learning experience. Participants will have the opportunity to gain valuable insights and experiences by working on projects relevant to current business contexts (real-world problems), collaborating with diverse talents at Traveloka, exploring career alignment with personal interests and preferences, and the chance to join Traveloka upon completion of the program.",
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
                            text = "1. Demonstrates the ability to comprehend business and technical concepts.\n" +
                                    "2. Exhibits structured thinking and the ability to bring clarity to ambiguity.\n" +
                                    "3. Possesses confidence and demonstrates clear written and oral communication skills.\n" +
                                    "4. Shows a proactive drive to solve problems and generate ideas without hesitation.",
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
fun InternshipPagePreview() {
    InternshipPage(rememberNavController())
}