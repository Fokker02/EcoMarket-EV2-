package com.example.evaluacion2_30kt

import android.os.Bundle
import android. util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.evaluacion2_30kt.ui.theme.EVALUACION2_30ktTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EVALUACION2_30ktTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val buttonText = "esto es lo que logre aprender"
    var counter = remember { mutableStateOf(0) }

    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Button(onClick = {
            counter.value = counter.value + 1
        }) {
            Text(text = buttonText)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EVALUACION2_30ktTheme {
        Greeting()
    }
}
