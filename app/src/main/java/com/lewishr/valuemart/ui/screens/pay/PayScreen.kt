package com.lewishr.valuemart.ui.screens.pay

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.valuemart.R
import com.lewishr.valuemart.ui.theme.newbrown


@Composable
fun AboutScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().padding(start = 20.dp, end = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box (modifier = Modifier.fillMaxWidth()
        ){

            Card(
                modifier = Modifier.fillMaxWidth().height(700.dp)
            ) {
                Column (
                    modifier = Modifier.fillMaxSize().background(newbrown)
                ){
                    Image(
                        painter = painterResource(R.drawable.img_16),
                        contentDescription = "",
                        modifier = Modifier.fillMaxWidth().height(300.dp),
                        contentScale = ContentScale.FillWidth)


                }
                Spacer(modifier = Modifier.height(10.dp))




            }

            Card (
                modifier = Modifier.fillMaxWidth()
            ){
                Column (
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Bottom
                ){
                    Button(
                        onClick = {

                        },
                        colors = ButtonDefaults.buttonColors(newbrown),
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp, bottom = 40.dp)





                    ) {
                        Text(text = "Pay Here",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp)


                    }
                }
            }

        }

    }






}







@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())

}
