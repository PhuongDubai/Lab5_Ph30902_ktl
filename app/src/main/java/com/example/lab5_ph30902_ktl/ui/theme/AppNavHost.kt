package com.example.lab5_ph30902_ktl.ui.theme

import androidx.compose.runtime.Composable

import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.lab5_ph30902_ktl.CategoryApp
import com.example.lab5_ph30902_ktl.LightSwitch
import com.example.lab5_ph30902_ktl.LoginApp
import com.example.lab5_ph30902_ktl.LoginScreen
import com.example.lab5_ph30902_ktl.baitap

enum class ROUTE_NAME {
    main,
    bai1,
    bai2,
    bai3,
}

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = ROUTE_NAME.main.name) {
        composable(ROUTE_NAME.main.name) { baitap(navController) }
        composable(ROUTE_NAME.bai1.name) { LoginApp(navController) }
        composable(ROUTE_NAME.bai2.name) { LightSwitch(navController) }
        composable(ROUTE_NAME.bai3.name) { CategoryApp(navController) }
    }
}