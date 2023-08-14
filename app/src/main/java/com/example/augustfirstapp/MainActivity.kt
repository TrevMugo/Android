package com.example.augustfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.augustfirstapp.ui.theme.AugustFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AugustFirstAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .background(Color.Cyan)
        .fillMaxSize()
    ){
        Text(
            text = "Hello $name!",
            color = Color.Blue,
            modifier = modifier
                .background(Color.Red)
                .padding(16.dp)
                .fillMaxWidth(),
            fontSize = 40.sp,
            textAlign = TextAlign.Center


        )

        Text(
            text = "Enjoy your Coding",
            color = Color.Blue,
            modifier = modifier
                .background(Color.White)
                .padding(16.dp)
                .fillMaxWidth(),
            fontSize = 27.sp,
            textAlign = TextAlign.Center

        )

    }





}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AugustFirstAppTheme {
        Greeting("Trevor")
    }
}