package com.example.thirtydaysinmelbourne

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ThirtyDaysInMelbourneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThirtyDaysInMelbourneTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ThirtyDaysInMelbourne(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ThirtyDaysInMelbourne(modifier: Modifier = Modifier) {
}

@Composable
fun ThirdyDaysInMelbourneCard(modifier: Modifier = Modifier) {
    ElevatedCard(
        modifier = modifier
            .height(300.dp)
    ) {
        Column (modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(R.drawable.flinders_street_station),
                contentDescription = stringResource(R.string.flinders_street_station_title),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(bottom = 8.dp)
                    .clip(shape = MaterialTheme.shapes.medium)
            )
            Text(
                text = stringResource(R.string.flinders_street_station_title),
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = stringResource(R.string.flinders_street_station_desc),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Preview
@Composable
fun ThirtyDaysInMelbournePreview() {
    ThirtyDaysInMelbourneTheme {
        ThirdyDaysInMelbourneCard()
    }
}