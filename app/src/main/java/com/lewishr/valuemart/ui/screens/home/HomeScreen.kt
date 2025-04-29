package com.lewishr.valuemart.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.valuemart.R
import com.lewishr.valuemart.ui.theme.newbrown
import com.lewishr.valuemart.ui.theme.newwite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){


    //Scaffold

                var selectedIndex by remember { mutableStateOf(0) }

                Scaffold(

                    //BottomBar
                    bottomBar = {
                        NavigationBar(
                            containerColor = newbrown
                        ){
                            NavigationBarItem(
                                icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                                label = { Text("Home") },
                                selected = selectedIndex == 0,
                                onClick = { selectedIndex = 0

                                }
                            )
                            NavigationBarItem(
                                icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                                label = { Text("Favorites") },
                                selected = selectedIndex == 1,
                                onClick = { selectedIndex = 1
                                    // navController.navigate(ROUT_HOME)
                                }
                            )
                            NavigationBarItem(
                                icon = { Icon(Icons.Default.LocationOn, contentDescription = "Profile") },
                                label = { Text("Locationt") },
                                selected = selectedIndex == 2,
                                onClick = { selectedIndex = 2
                                    //  navController.navigate(ROUT_HOME)
                                }
                            )
                            NavigationBarItem(
                                icon = { Icon(Icons.Default.Notifications, contentDescription = "Profile") },
                                label = { Text("History") },
                                selected = selectedIndex == 2,
                                onClick = { selectedIndex = 2
                                    //  navController.navigate(ROUT_HOME)
                                }
                            )
                            NavigationBarItem(
                                icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                                label = { Text("Profile") },
                                selected = selectedIndex == 2,
                                onClick = { selectedIndex = 2
                                    //  navController.navigate(ROUT_HOME)
                                }
                            )

                        }
                    },


                    //Contents
                    content = { paddingValues ->
                        Column(
                            modifier = Modifier
                                .padding(paddingValues)
                                .fillMaxSize()
                                .paint(painter = painterResource(R.drawable.img_15), contentScale = ContentScale.FillBounds)

                        ) {
                            Card (
                                modifier = Modifier.fillMaxWidth()
                            ){


                                Column (
                                    modifier = Modifier.fillMaxWidth()
                                ){
                                    Image(
                                        painter = painterResource(R.drawable.img_7),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxWidth().height(200.dp),
                                        contentScale = ContentScale.FillWidth)
                                }
                            }
                            Spacer(modifier = Modifier.height(10.dp))



                               Column (
                                   modifier = Modifier.fillMaxWidth()
                               ){
                                   Image(
                                       painter = painterResource(R.drawable.img_11),
                                       contentDescription = "",
                                       modifier = Modifier.fillMaxWidth().height(200.dp),
                                       contentScale = ContentScale.FillWidth)
                               }

                            Spacer(modifier = Modifier.height(10.dp))
                            Column (
                                modifier = Modifier.fillMaxWidth().padding(start = 10.dp)
                            ){
                                Text(text = "Recommended for you",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold)

                            }

                            Row (
                                modifier = Modifier.padding(20.dp).horizontalScroll(
                                    rememberScrollState()
                                )
                            ) {
                                //Card1
                                Card(
                                    modifier = Modifier.width(150.dp).height(180.dp)

                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxSize().background(newbrown),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center


                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.img_10),
                                            contentDescription = "",
                                            modifier = Modifier.fillMaxWidth().height(500.dp),
                                            contentScale = ContentScale.FillHeight)





                                    }

                                }
                                //card1
                                Spacer(modifier = Modifier.width(20.dp))
                                //Card2
                                Card(
                                    modifier = Modifier.width(150.dp).height(180.dp)

                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxSize().background(newbrown),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center


                                    ) {
                                       Column (
                                           modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp)
                                       ){
                                           Image(
                                               painter = painterResource(R.drawable.img_9),
                                               contentDescription = "",
                                               modifier = Modifier.fillMaxWidth().height(500.dp),
                                               contentScale = ContentScale.FillHeight)
                                       }




                                    }

                                }
                                //card2
                                Spacer(modifier = Modifier.width(20.dp))
                                //Card1
                                Card(
                                    modifier = Modifier.width(150.dp).height(180.dp)

                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxSize().background(newbrown),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center


                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.img_10),
                                            contentDescription = "",
                                            modifier = Modifier.fillMaxWidth().height(500.dp),
                                            contentScale = ContentScale.FillHeight)





                                    }

                                }
                                //card1
                                Spacer(modifier = Modifier.width(20.dp))
                                //Card1
                                Card(
                                    modifier = Modifier.width(150.dp).height(180.dp)

                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxSize().background(newbrown),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center


                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.img_10),
                                            contentDescription = "",
                                            modifier = Modifier.fillMaxWidth().height(500.dp),
                                            contentScale = ContentScale.FillHeight)





                                    }

                                }
                                //card1
                                Spacer(modifier = Modifier.width(20.dp))
                                //Card1
                                Card(
                                    modifier = Modifier.width(150.dp).height(180.dp)

                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxSize().background(newbrown),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center


                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.img_10),
                                            contentDescription = "",
                                            modifier = Modifier.fillMaxWidth().height(500.dp),
                                            contentScale = ContentScale.FillHeight)





                                    }

                                }
                                //card1
                                Spacer(modifier = Modifier.width(20.dp))


                            }
                            Spacer(modifier = Modifier.height(20.dp))

                            Button(
                                onClick = {

                                },
                                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)





                            ) {
                                Text(text = "Welcome to our HonestBakers Menu")


                            }















                        }
                    }
                )
                //End of Scaffold

            }







@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())

}