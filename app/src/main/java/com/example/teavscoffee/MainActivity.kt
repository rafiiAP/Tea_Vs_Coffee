package com.example.teavscoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.teavscoffee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   // private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        //drawerLayout = binding.drawerLayout
        val navCtrl = this.findNavController(R.id.navHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navCtrl /*drawerLayout*/)

        NavigationUI.setupWithNavController(binding.bottomNav, navCtrl)

        //NavigationUI.setupWithNavController(binding.navView, navCtrl)

        //yang dikasih komen itu drawer layout
    }

    override fun onSupportNavigateUp(): Boolean {
        val navCtrl = this.findNavController(R.id.navHostFragment)
        return navCtrl.navigateUp()

        //return NavigationUI.navigateUp(navCtrl drawerLayout) ini return buat drawer layout
    }
}