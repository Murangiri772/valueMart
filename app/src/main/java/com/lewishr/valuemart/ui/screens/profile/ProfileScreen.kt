package com.lewishr.valuemart.ui.screens.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.valuemart.R
import com.lewishr.valuemart.ui.theme.newbrown


@Composable
fun AboutScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().paint(painter = painterResource(R.drawable.img_15), contentScale = ContentScale.FillBounds)
    ){

        Box (
            modifier = Modifier.fillMaxWidth()
        ){
            Card (
                modifier = Modifier.fillMaxWidth().clip(shape = CircleShape).padding(start = 50.dp, end = 50.dp)
            ){
                Column (modifier = Modifier.fillMaxWidth().clip(shape = CircleShape).background(newbrown)){
                    Image(
                        painter = painterResource(R.drawable.img_7),
                        contentDescription = "",
                        modifier = Modifier.fillMaxWidth().height(200.dp).clip(shape = CircleShape),
                        contentScale = ContentScale.FillWidth)
                }

            }
            Card (modifier = Modifier.fillMaxWidth()){
                Column (
                    modifier = Modifier.fillMaxWidth()
                ){

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
