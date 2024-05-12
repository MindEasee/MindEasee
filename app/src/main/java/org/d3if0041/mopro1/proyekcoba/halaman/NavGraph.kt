package org.d3if0041.mopro1.proyekcoba.halaman

import LoginScreen
import OpenScreen
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.d3if0041.mopro1.proyekcoba.ui.screen.AddScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.AwalScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.ChartScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.EntriScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.InfoScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.JoggingScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.LainScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.MainScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.PasswordScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.RegisterScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.TipsScreen

@RequiresApi(Build.VERSION_CODES.O)
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
        composable(route = Screen.Chart.route) {
            ChartScreen(navController)
        }
        composable(route = Screen.Password.route) {
            PasswordScreen(navController)
        }
        composable(route = Screen.Entri.route) {
            EntriScreen(navController)
        }
        composable(route = Screen.Add.route) {
            AddScreen(navController)
        }
        composable(route = Screen.Tips.route) {
            TipsScreen(navController)
        }
        composable(route = Screen.Jogging.route) {
            JoggingScreen(navController)
        }
    }
}


