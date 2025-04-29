package com.lewishr.valuemart.ui.screens.receipt

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.valuemart.R
import com.lewishr.valuemart.ui.theme.newbrown
import com.lewishr.valuemart.ui.theme.newgrey

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReceiptScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
            .paint(painter = painterResource(R.drawable.img_14), contentScale = ContentScale.FillBounds)
            ,
        verticalArrangement = Arrangement.Bottom


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



@Preview(showBackground = true)
@Composable
fun ReceiptScreenPreview(){
    ReceiptScreen(rememberNavController())

}
