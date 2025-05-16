package com.example.divorceparty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.divorceparty.ui.theme.DivorcePartyTheme
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DivorcePartyTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                                color = MaterialTheme.colorScheme.background
                    ){
                        GreetingText(
                            message = "Divorce Party",
                            from = "Te invito a mi: ",
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }
    }


@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column  (
        verticalArrangement = Arrangement.Top,
        modifier = modifier)  {
        Text(
            text = from,
            fontFamily = FontFamily.Cursive,
            fontSize = 50.sp,
            modifier = Modifier
                .padding(10.dp)
                .align(alignment = Alignment.Start)
        )
        Text(
            text = message,
            fontSize = 100.sp,
            fontFamily = FontFamily.Cursive,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
    }

}

@Preview(showBackground  = true)
@Composable
fun DivorcePartyPreview() {
    DivorcePartyTheme {
       // GreetingText(message = "Divorce Party", from = "Te invito a: ")
    }
}