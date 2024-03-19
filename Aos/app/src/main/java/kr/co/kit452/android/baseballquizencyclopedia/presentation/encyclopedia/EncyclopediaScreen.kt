package kr.co.kit452.android.baseballquizencyclopedia.presentation.encyclopedia

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kr.co.kit452.android.baseballquizencyclopedia.ui.theme.Dimens

@Composable
fun WordListScreen(modifier: Modifier = Modifier) {

    val words = getBaseballTerms()

    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Adaptive(150.dp),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(words) { word ->
            WordItem(word)
            Spacer(modifier = Modifier.height(Dimens.medium))
        }
    }
}

@Composable
fun WordItem(word: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = word)
        }
    }
}

fun getBaseballTerms(): List<String> {
    return listOf(
        "홈런", "볼카운트", "스트라이크", "타석", "병살타", "좌익수", "우익수",
        "유격수", "적시타", "보크", "투구", "도루", "볼", "스퀴즈",
        "희생타", "페어볼", "희생플라이", "안타", "병살", "투수공"
    )
}
