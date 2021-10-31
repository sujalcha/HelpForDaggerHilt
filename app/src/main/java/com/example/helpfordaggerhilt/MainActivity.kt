package com.example.helpfordaggerhilt

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helpfordaggerhilt.ui.theme.HelpForDaggerHiltTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    @Named("getValue1")
    lateinit var therealvalue : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Log.d("MainActivity", "Value from MainActivity: $therealvalue")

            HelpForDaggerHiltTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("$therealvalue")

                }


            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "therealvalue")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelpForDaggerHiltTheme {
        Greeting("Android")
    }
}