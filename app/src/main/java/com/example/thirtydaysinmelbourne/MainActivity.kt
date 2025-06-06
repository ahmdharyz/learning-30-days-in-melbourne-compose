package com.example.thirtydaysinmelbourne

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ThirtyDaysInMelbourneTheme
import com.example.thirtydaysinmelbourne.model.LandmarkTip
import com.example.thirtydaysinmelbourne.model.landmarkTips

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThirtyDaysInMelbourneTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    ThirtyDaysInMelbourne(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun ThirtyDaysInMelbourne(landmarks: List<LandmarkTip> = landmarkTips, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { ThirtyDaysInMelbourneTopAppBar() }
    ) {
        LazyColumn(
            contentPadding = it,
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
            modifier = modifier
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            items(landmarks, key = { landmark -> landmark.day }) { landmark ->
                ThirtyDaysInMelbourneCard(landmark)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirtyDaysInMelbourneTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.headlineMedium
            )
        }
    )
}

@Composable
fun ThirtyDaysInMelbourneCard(landmark: LandmarkTip, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.landmark_day_label, landmark.day),
        style = MaterialTheme.typography.labelLarge,
        modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small))
    )
    ElevatedCard(
        colors = CardDefaults.cardColors()
    ) {
        Column (modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))) {

            Image(
                painter = painterResource(landmark.imageResourceId),
                contentDescription = stringResource(landmark.title),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(bottom = dimensionResource(R.dimen.padding_small))
                    .clip(shape = MaterialTheme.shapes.medium)
            )

            Text(
                text = stringResource(landmark.title),
                style = MaterialTheme.typography.titleLarge,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
            )
            Spacer(Modifier.height(dimensionResource(R.dimen.padding_small)))
            Text(
                text = stringResource(landmark.description),
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(Modifier.height(dimensionResource(R.dimen.padding_small)))
        }
    }
}

@Preview
@Composable
fun ThirtyDaysInMelbournePreview() {
    ThirtyDaysInMelbourneTheme {
        ThirtyDaysInMelbourne(landmarks = landmarkTips)
    }
}