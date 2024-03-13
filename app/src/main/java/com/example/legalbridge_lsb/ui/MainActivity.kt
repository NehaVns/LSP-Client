package com.example.legalbridge_lsb.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.legalbridge_lsb.R
import com.example.legalbridge_lsb.databinding.ActivityMainBinding
import com.example.legalbridge_lsb.ui.account_details.UserAccountDetails
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent = Intent(this@MainActivity, UserAccountDetails::class.java)
        startActivity(intent)

////        val navView: BottomNavigationView = binding.navView
//
//        val navController = findNavController(R.id.nav_host_fragment_activity_main)
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        //        val appBarConfiguration = AppBarConfiguration(
//        //            setOf(
//        //                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
//        //            )
//        //        )
//        //        setupActionBarWithNavController(navController, appBarConfiguration)
//
//
//
//        navView.setupWithNavController(navController)
    }
}