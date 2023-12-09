package com.example.finalproject2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.finalproject2.screens.InteractiveMedia
import kotlin.experimental.ExperimentalTypeInference

//KOMPONEN LOGIN PAGE
@Composable
fun NormalText(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 30.dp),
        style = TextStyle (
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal

        ),
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadingText(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth(),
        style = TextStyle (
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        ),
        textAlign = TextAlign.Center
    )
}

@Composable
fun SubHeading(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        style = TextStyle (
            fontSize = 17.sp,
            fontWeight = FontWeight.SemiBold
        )
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(labelValue: String, logo: ImageVector) {
    val textValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp)),
        label = {
            Text(text = labelValue)
        },
        value = textValue.value,
        keyboardOptions = KeyboardOptions.Default,
        onValueChange = {
            textValue.value = it
        },
        leadingIcon = {
            Icon(logo, contentDescription = "")

        }
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField(labelValue: String, logo: ImageVector) {
    val password = remember {
        mutableStateOf("")
    }

    val passwordVisible = remember {
        mutableStateOf(false)
    }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp)),
        label = {
            Text(text = labelValue)
        },
        value = password.value,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        onValueChange = {
            password.value = it
        },
        leadingIcon = {
            Icon(logo, contentDescription = "")
        },
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckBoxComponent(value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(56.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        val checkedState = remember {
            mutableStateOf<Boolean>(false)
        }
        Checkbox(checked = checkedState.value,
            onCheckedChange = {
                checkedState.value = !checkedState.value
            })
        Text(
            text = value,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ButtonComponent(value: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp),
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF117466)
        )
    ) {
        Text(
            text = value
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyLogoComponent() {
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "logo",
        modifier = Modifier
            .size(60.dp)
            .padding(bottom = 16.dp))
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(color = Color(0xFF117466))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.rocketwhite),
                contentDescription = "logoApp",
                modifier = Modifier
                    .size(24.dp)
            )
            IconButton(
                onClick = onClick,
                modifier = Modifier
                    .size(38.dp)
                    .clip(CircleShape)
            ) {
                Icon (
                    imageVector = Icons.Rounded.Person,
                    contentDescription = "Profile",
                    tint = Color.White
                )
            }

        }
    }
}

@Composable
fun MyTopBar2 (onClick1: () -> Unit, onClick2: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(color = Color(0xFF117466))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = onClick1,
                modifier = Modifier
                    .size(38.dp)
                    .clip(CircleShape)
            ) {
                Icon (
                    imageVector = Icons.Rounded.ArrowBack,
                    contentDescription = "Profile",
                    tint = Color.White
                )

            }
            IconButton(
                onClick = onClick2,
                modifier = Modifier
                    .size(38.dp)
                    .clip(CircleShape)
            ) {
                Icon (
                    imageVector = Icons.Rounded.Person,
                    contentDescription = "Profile",
                    tint = Color.White
                )
            }

        }
    }

}

//KOMPONEN UNTUK HOMEPAGE
@Composable
fun Greetings(greeting: String) {
    Text(
        text = greeting,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        style = TextStyle (
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    )
}

@Composable
fun MyBodyText(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        style = TextStyle (
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataCardComponent(onClick1: () -> Unit) {
    Card(
        modifier = Modifier
            .width(175.dp)
            .height(210.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
        ){
            Image(
                painter = painterResource(id = R.drawable.dc),
                contentDescription = "data science",
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "Data Science",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, top = 8.dp, end = 8.dp)
            )


            Button(
                onClick = onClick1,
                colors = ButtonDefaults.buttonColors(Color(0xFF117466)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 16.dp, bottom = 8.dp)
            ){
                Text(
                    text = "CHECK",
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Composable
fun IMCardComponent(onClick1: () -> Unit) {
    Card(
        modifier = Modifier
            .width(175.dp)
            .height(210.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
        ){
            Image(
                painter = painterResource(id = R.drawable.im),
                contentDescription = "interactive media",
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "Interactive Media",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, top = 8.dp, end = 8.dp)
            )


            Button(
                onClick = onClick1,
                colors = ButtonDefaults.buttonColors(Color(0xFF117466)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 16.dp, bottom = 8.dp)
            ){
                Text(
                    text = "CHECK",
                    fontSize = 14.sp
                )
            }
        }
    }
}

//KOMPONEN DATAPAGE
@Composable
fun DataDetailStreamRoadmap() {
    Card(
        modifier = Modifier
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
                text = "1. Data Werehouse",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
            )

            Image(
                painter = painterResource(id = R.drawable.wr),
                contentDescription = null
            )


        }

    }
    Spacer(modifier = Modifier.size(10.dp))
    Card(
        modifier = Modifier
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
                text = "2. Visualisasi Data",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
            )

            Image(
                painter = painterResource(id = R.drawable.dv),
                contentDescription = null
            )

        }
    }
}

@Composable
fun DetailStream(value: String){
    Card(
        modifier = Modifier
            .padding(top = 12.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ){
        Column(
            modifier = Modifier.padding(18.dp, 20.dp)
        ) {
            Text(text="Deskripsi Singkat",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black)
            Spacer(modifier = Modifier.size(5.dp))
            Text(text=value, textAlign = TextAlign.Justify)
        }

    }

}

//KOMPONEN INTERACTIVE MEDIA
@Composable
fun IMDetailStreamRoadmap() {
    Card(
        modifier = Modifier
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
                text = "1. Product Thinking",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
            )
            Image(
                painter = painterResource(id = R.drawable.pt),
                contentDescription = null
            )
        }

    }
    Spacer(modifier = Modifier.size(10.dp))
    Card(
        modifier = Modifier
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
                text = "2. Design Research",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium
            )

            Image(
                painter = painterResource(id = R.drawable.dr),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
            )


        }

    }
}


//KOMPONEN COURSE
@Composable
fun CourseCard(onClick:() -> Unit) {
    Card(
        modifier = Modifier
            .width(352.dp)
            .height(148.dp)
            .padding(bottom = 8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.revou),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(38.dp),
                )
                Spacer(modifier = Modifier.size(8.dp))
                Column(
                ) {
                    Text(
                        text = "Data Science",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Revou",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Rounded.CheckCircle,
                    contentDescription = "",
                    tint = Color.DarkGray,
                    modifier = Modifier
                        .size(18.dp),
                )
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = "4 Months", fontSize = 12.sp)

                Button(
                    onClick = onClick,
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .fillMaxWidth()
                        .heightIn(48.dp),
                    contentPadding = PaddingValues(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF117466)
                    )
                ) {
                    Text(
                        text = "REGISTER"
                    )
                }

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InternCard(onClick:()-> Unit) {
    Card(
        modifier = Modifier
            .width(175.dp)
            .height(220.dp)
            .padding(start = 16.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.traveloka),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(38.dp),
            )
            Column(){
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
                Row(
                    modifier = Modifier
                        .padding(top = 12.dp, bottom = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Rounded.DateRange,
                        contentDescription = "",
                        tint = Color.DarkGray,
                        modifier = Modifier
                            .size(18.dp),
                    )
                    Spacer(modifier = Modifier.size(4.dp))
                    Text(text = "4 Months", fontSize = 12.sp)

                }
                Row(
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Rounded.CheckCircle,
                        contentDescription = "",
                        tint = Color.DarkGray,
                        modifier = Modifier
                            .size(18.dp),
                    )
                    Spacer(modifier = Modifier.size(4.dp))
                    Text(text = "Paid", fontSize = 12.sp)

                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun InternCardPreview(){
    InternCard(
        onClick = {

        }
    )
}





