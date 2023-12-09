package com.example.finalproject2.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.finalproject2.CheckBoxComponent
import com.example.finalproject2.HeadingText
import com.example.finalproject2.ButtonComponent
import com.example.finalproject2.MyTextField
import com.example.finalproject2.NormalText
import com.example.finalproject2.PasswordTextField


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpPage(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            NormalText(value = "Hey there,")
            HeadingText(value = "Create an Account")
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(labelValue = "First Name", logo = Icons.Rounded.Person)
            MyTextField(labelValue = "Last Name", logo = Icons.Rounded.Person)
            MyTextField(labelValue = "Email", logo = Icons.Rounded.Email)
            PasswordTextField(labelValue = "Password",logo = Icons.Rounded.Lock)
            CheckBoxComponent(value = "By continuing you agree the terms and condition in PathFinder")
            Spacer(
                modifier = Modifier.height(30.dp)
            )
            ButtonComponent(
                value = "SIGN UP",
                onClick = {
                    navController.navigate("home")
                }
            )
        }
    }
}

@Preview
@Composable
fun SignUpScreenPreview() {
    SignUpPage(rememberNavController())
}
