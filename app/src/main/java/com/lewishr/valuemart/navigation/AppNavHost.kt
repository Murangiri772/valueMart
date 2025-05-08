package com.lewishr.valuemart.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.lewishr.valuemart.data.UserDatabase
import com.lewishr.valuemart.repository.UserRepository
import com.lewishr.valuemart.ui.screens.Bakes.AddBakesScreen
import com.lewishr.valuemart.ui.screens.Bakes.BakesListScreen
import com.lewishr.valuemart.ui.screens.Bakes.EditBakesScreen
import com.lewishr.valuemart.ui.screens.Menu.MenuScreen
import com.lewishr.valuemart.ui.screens.auth.LoginScreen
import com.lewishr.valuemart.ui.screens.auth.RegisterScreen


import com.lewishr.valuemart.ui.screens.home.HomeScreen
import com.lewishr.valuemart.ui.screens.location.LocationScreen
import com.lewishr.valuemart.ui.screens.start.StartScreen
import com.lewishr.valuemart.viewmodel.AuthViewModel
import com.lewishr.valuemart.viewmodel.BakesViewModel


@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ADD_BAKES,
   bakesViewModel: BakesViewModel = viewModel()

    ) {
    var context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_MENU) {
            MenuScreen(navController)
        }

        composable(ROUT_LOCATION) {
            LocationScreen(navController)
        }



        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }


        // PRODUCTS
        composable(ROUT_ADD_BAKES) {
            AddBakesScreen(navController, bakesViewModel)
        }

        composable(ROUT_BAKES_LIST) {
            BakesListScreen(navController, bakesViewModel)
        }

        composable(
            route = ROUT_EDIT_BAKES,
            arguments = listOf(navArgument("bakesId") { type = NavType.IntType })
        ) { backStackEntry ->
            val bakesId = backStackEntry.arguments?.getInt("bakesId")
            if (bakesId != null) {
                EditBakesScreen(bakesId, navController, bakesViewModel)
            }
        }







    }
}
