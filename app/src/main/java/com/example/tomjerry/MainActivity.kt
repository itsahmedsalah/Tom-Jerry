package com.example.tomjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tomjerry.jerrystore.JerryStoreScreen
import com.example.tomjerry.tomaccount.TomAccountScreen
import com.example.tomjerry.tomkitchen.TomKitchenScreen

import com.example.tomjerry.ui.theme.TomJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomJerryTheme {
                //JerryStoreScreen()
                //TomKitchenScreen()
                TomAccountScreen()
            }
        }
    }
}
