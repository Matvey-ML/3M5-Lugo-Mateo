package com.lugo.composetapelelapin

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lugo.composetapelelapin.ui.theme.ComposeTapeLeLapinTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTapeLeLapinTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            title = {Text(text = "Tape le lapin")},
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer,
                                titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                            )
                        )
                    }
                    ) { innerPadding ->
                        EcranPrincipal(
                            modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun EcranPrincipal(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        AficherScores()
        TitreApplication(modifier = Modifier.fillMaxWidth())
        GrilleTuiles(modifier = Modifier)
    }
}

@Composable
private fun TitreApplication(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Tape le lapin",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
    )}

}

@Composable
fun AficherScores(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.fillMaxWidth().weight(1f),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "0 Pafs",
                color = Color.Green,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Box(
            modifier = Modifier.fillMaxWidth().weight(1f),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "0 Flops",
                color = Color.Red,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
@Composable
fun GrilleTuiles(modifier: Modifier) {
    var positionLapin = Random.nextInt(9)

    Column(
        modifier = modifier
    ) {
        for(col in 0..2){
            Row() {
                for (row in 0..2){
                    val indexTuile = col*3 + row
                    Tuile(
                        estLapin = positionLapin == indexTuile,
                        modifier = Modifier.padding(8.dp))
                }
            }
        }
    }

}

@Composable
private fun Tuile(estLapin : Boolean, modifier: Modifier) {
    Button(
        onClick = {},
        modifier = modifier
    ) {
        Text(
            text = if(estLapin) "Lapin" else "Taupe",
            fontSize = 25.sp
        )
    }
}
