package com.example.thirtydaysinmelbourne

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
                Surface {
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
            items(landmarks) { landmark ->
                ThirdyDaysInMelbourneCard(landmark)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirtyDaysInMelbourneTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.titleLarge
            )
        }
    )
}

@Composable
fun ThirdyDaysInMelbourneCard(landmark: LandmarkTip, modifier: Modifier = Modifier) {
    ElevatedCard(
        modifier = modifier
            .height(300.dp)
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
                overflow = TextOverflow.Clip,
                maxLines = 1,
            )
            Text(
                text = stringResource(landmark.description),
                style = MaterialTheme.typography.bodyMedium
            )
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