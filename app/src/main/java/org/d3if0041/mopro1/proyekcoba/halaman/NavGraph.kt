package org.d3if0041.mopro1.proyekcoba.halaman

import LoginScreen
import OpenScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.d3if0041.mopro1.proyekcoba.ui.screen.AwalScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.InfoScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.LainScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.MainScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.RegisterScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Awal.route // Mulai dari halaman awal
    ) {
        composable(route = Screen.Awal.route) {
            AwalScreen(navController)
        }
        composable(route = Screen.Open.route) {
            OpenScreen(navController)
        }
        composable(route = Screen.Home.route) {
            MainScreen(navController)
        }
        composable(route = Screen.Login.route) {
            LoginScreen(navController)
        }
        composable(route = Screen.Register.route) {
            RegisterScreen(navController)
        }
        composable(route = Screen.Lain.route) {
            LainScreen(navController)
        }
        composable(route = Screen.Info.route) {
            InfoScreen(navController)
        }
    }
}