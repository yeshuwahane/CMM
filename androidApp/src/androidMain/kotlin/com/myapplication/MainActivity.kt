package com.myapplication

import MainView
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.annotation.RequiresExtension
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.lifecycleScope
import data.remote.api.Api
import data.remote.dto.JokeDto
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    val mainScope = MainScope()
    var jokeDto:JokeDto? = null
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainScope.launch {
            kotlin.runCatching {
                jokeDto = Api().getRandomJoke()
            }.onSuccess {
                setContent {
                    jokeDto?.let { it1 -> MainView(it1) }
                }
            }.onFailure {
                Log.d("alien","Error")
            }
        }

    }
}



