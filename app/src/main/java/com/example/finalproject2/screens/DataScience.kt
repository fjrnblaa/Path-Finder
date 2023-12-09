package com.example.finalproject2.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.finalproject2.DataDetailStreamRoadmap
import com.example.finalproject2.DetailStream
import com.example.finalproject2.HeadingText
import com.example.finalproject2.MyTopBar2
import com.example.finalproject2.R


@Composable
fun DataScience(navController : NavController) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            MyTopBar2(
                onClick1 = {
                    navController.navigate("home")},
                onClick2 = {
                    //profilepage
                }
            )
            Image(
                painter = painterResource(id = R.drawable.data),
                contentDescription = "Deskripsi gambar",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            // Judul
            Spacer(modifier = Modifier.size(10.dp))
            HeadingText(value = "Data Science")

            Spacer(modifier = Modifier.size(10.dp))

            DetailStream(
                value = "Data Science adalah stream yang bertujuan untuk meningkatkan kompetensi mahasiswa dalam bidang Sains Data. " +
                        "Data Science mengulas topik penting terkait dengan Sains Data, seperti pengantar konsep Sains Data dan statistika inferensial, berbagai metode pengolahan data ilmiah termasuk deep learning." +
                        "Selin itu, materi yang diajarkan juga mencakup presentasi data melalui visualisasi dan manajemen pengetahuan",)

            Spacer(modifier = Modifier.size(10.dp))
            DataDetailStreamRoadmap()
        }
    }
}

@Preview
@Composable
fun DataPreview() {
    DataScience(rememberNavController())
}