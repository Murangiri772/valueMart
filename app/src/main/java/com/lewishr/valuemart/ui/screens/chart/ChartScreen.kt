package com.lewishr.valuemart.ui.screens.chart


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.valuemart.R
import com.lewishr.valuemart.ui.theme.newbrown
import com.lewishr.valuemart.ui.theme.newred
import com.lewishr.valuemart.ui.theme.newwite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChartScreen(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Chart") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")

                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = newbrown,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },




        //Contents
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .paint(painter = painterResource(R.drawable.img_15), contentScale = ContentScale.FillBounds),
                verticalArrangement = Arrangement.Bottom
            ) {
                Row (
                    modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
                    verticalAlignment = Alignment.Bottom
                ){
                    Column (
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Bottom
                    ){
                        var messenger by remember { mutableStateOf("") }
                        Spacer(modifier = Modifier.height(20.dp))
                        //messenger
                        OutlinedTextField(
                            value = messenger,
                            onValueChange = {messenger = it},
                            modifier = Modifier.fillMaxWidth()
                                .padding(start = 20.dp, end = 20.dp),
                            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "", tint = newred) },
                            trailingIcon = { Icon(imageVector = Icons.Default.Send, contentDescription = "Send to :tel = 0723704577", tint = newred) },
                            label = {Text(text = "Text here.....")},
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = newbrown,
                                focusedBorderColor = newred,
                                focusedLabelColor = newred,
                                unfocusedContainerColor = Color.White
                            ),

                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)


                        )









                    }


                }















            }
        }
    )
    //End of Scaffold



}




@Preview(showBackground = true)
@Composable
fun ChartScreenPreview(){
    ChartScreen(rememberNavController())

}
