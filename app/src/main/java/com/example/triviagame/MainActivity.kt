package com.example.triviagame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.triviagame.viewmodel.GameViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel : GameViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = Navigation.findNavController(this, R.id.game_navigation)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }
}