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
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.ui.Alignment

import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



            @Composable
            fun ProfileScreen(navController: NavController) {
                // Define brown colors
                val backgroundBrown = Color(0xFF6D4C41)
                val cardBrown = Color(0xFFA1887F)
                val textBrownDark = Color(0xFF4E342E)
                val textBrownLight = Color(0xFFD7CCC8)
                val buttonBrown = Color(0xFF5D4037)

                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(backgroundBrown)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Spacer(modifier = Modifier.height(40.dp))

                        // Profile Image
                        // Replace with your image resource
                        Image(
                            painter = painterResource(id = android.R.drawable.sym_def_app_icon),
                            contentDescription = "Profile Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape)
                                .background(cardBrown)
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        // User Name
                        Text(
                            text = "John Doe",
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            color = textBrownLight
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        // User Bio
                        Text(
                            text = "Android Developer | Jetpack Compose Enthusiast | Coffee Lover",
                            fontSize = 16.sp,
                            color = textBrownLight,
                            modifier = Modifier.padding(horizontal = 32.dp),
                            maxLines = 3
                        )

                        Spacer(modifier = Modifier.height(32.dp))

                        // Profile Details Card
                        Card(
                            shape = RoundedCornerShape(12.dp),


                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp)
                        ) {
                            Column(modifier = Modifier.padding(20.dp)) {
                                ProfileDetailItem(label = "Email", value = "john.doe@example.com", labelColor = textBrownDark, valueColor = textBrownLight)
                                Divider(modifier = Modifier.padding(vertical = 8.dp), color = textBrownDark.copy(alpha = 0.5f))
                                ProfileDetailItem(label = "Phone", value = "+1 234 567 890", labelColor = textBrownDark, valueColor = textBrownLight)
                                Divider(modifier = Modifier.padding(vertical = 8.dp), color = textBrownDark.copy(alpha = 0.5f))
                                ProfileDetailItem(label = "Location", value = "San Francisco, CA", labelColor = textBrownDark, valueColor = textBrownLight)
                            }
                        }

                        Spacer(modifier = Modifier.height(40.dp))

                        // Edit Profile Button
                        Button(
                            onClick = { /* TODO: Navigate to Edit Profile */ },

                            modifier = Modifier
                                .fillMaxWidth(0.6f)
                                .height(50.dp).background(newbrown),
                            shape = RoundedCornerShape(25.dp)
                        ) {
                            Text(text = "Edit Profile", fontSize = 16.sp, color = textBrownLight)
                        }
                    }
                }
            }

    @Composable
    fun ProfileDetailItem(label: String, value: String, labelColor: Color, valueColor: Color) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = label, fontSize = 16.sp, color = labelColor)
            Text(text = value, fontSize = 16.sp, color = valueColor, fontWeight = FontWeight.Medium)
        }
    }












@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(){
    ProfileScreen(rememberNavController())

}
