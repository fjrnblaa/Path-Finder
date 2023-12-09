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
import com.example.finalproject2.DetailStream
import com.example.finalproject2.IMDetailStreamRoadmap
import com.example.finalproject2.HeadingText
import com.example.finalproject2.MyTopBar2
import com.example.finalproject2.R

@Composable
fun InteractiveMedia(navController : NavController) {
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
            Spacer(modifier = Modifier.size(10.dp))
            // Tempat untuk gambar
            Image(
                painter = painterResource(id = R.drawable.interactivemedia),
                contentDescription = "Deskripsi gambar",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            // Judul
            Spacer(modifier = Modifier.size(10.dp))
            HeadingText(value = "Interactive Media")

            Spacer(modifier = Modifier.size(10.dp))

            DetailStream(
                value = "Interactive media adalah stream yang memungkinkan pengguna untuk berinteraksi dengan konten yang disajikan. " +
                        "Interactive media biasanya menggunakan teknologi komputer untuk menyajikan konten yang dapat dimanipulasi oleh pengguna, seperti teks, gambar, video, audio, dan animasi")

            Spacer(modifier = Modifier.size(10.dp))

            IMDetailStreamRoadmap()

        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview(){
    InteractiveMedia(rememberNavController())
}