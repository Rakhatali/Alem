package com.example.alem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.example.alem.databinding.ActivityMainBinding
import com.example.alem.utils.Constants
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Constants.MAIN = this
    }

    override fun onStart() {
        super.onStart()
        navController = Navigation.findNavController(Constants.MAIN, R.id.nav_host_fragment)
        binding.bottomNavigation.setupWithNavController(navController)
    }



}