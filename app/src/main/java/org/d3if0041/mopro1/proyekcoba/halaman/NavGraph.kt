package org.d3if0041.mopro1.proyekcoba.halaman

import LoginScreen
import MainScreen
import OpenScreen
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.d3if0041.mopro1.proyekcoba.ui.screen.AddScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.AwalScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.ChartScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.EntriScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.ImageryScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.InfoScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.JalanScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.Tips.Jogging.JoggingScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.LainScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.MuscleScreen
import org.d3if0041.mopro1.proyekcoba.view.NoteViewModel
import org.d3if0041.mopro1.proyekcoba.ui.screen.PasswordScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.RegisterScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.Tips.Butterfly.ButterflyScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.Tips.DeepBreathRelaxation.DeepScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.YogaScreen
import org.d3if0041.mopro1.proyekcoba.ui.screen.TipsScreen

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    val noteViewModel: NoteViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Screen.Awal.route
    ) {
        composable(route = Screen.Awal.route) {
            AwalScreen(navController)
        }
        composable(route = Screen.Open.route) {
            OpenScreen(navController)
        }
        composable(route = Screen.Home.route) {
            MainScreen(navController, noteViewModel)
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
            EntriScreen(navController, noteViewModel)
        }
        composable(route = Screen.Add.route) {
            AddScreen(navController, noteViewModel)
        }
        composable(route = Screen.Tips.route) {
            TipsScreen(navController)
        }
        composable(route = Screen.Jogging.route) {
            JoggingScreen(navController)
        }

        composable(route = Screen.Butterfly.route) {
            ButterflyScreen(navController)
        }
        composable(route = Screen.Deep.route) {
            DeepScreen(navController)
        }
        composable(route = Screen.Imagery.route) {
            ImageryScreen(navController)
        }
        composable(route = Screen.Jalan.route) {
            JalanScreen(navController)
        }
        composable(route = Screen.Yoga.route) {
            YogaScreen(navController)
        }
        composable(route = Screen.Muscle.route) {
            MuscleScreen(navController)
        }
        composable(
            route = "${Screen.Entri.route}/{noteId}",
            arguments = listOf(navArgument("noteId") { type = NavType.IntType })
        ) { backStackEntry ->
            val noteId = backStackEntry.arguments?.getInt("noteId")
            EntriScreen(navController, noteViewModel, noteId)
        }
    }
}

