package kr.co.kit452.android.baseballquizencyclopedia.domain.repository

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.baseballquizencyclopedia.domain.model.WordEntity

interface WordRepository {
    fun getAllWords(): Flow<List<WordEntity>>

    fun getRandomFourWords(): Flow<List<WordEntity>>

    fun searchWords(keyword: String): Flow<List<WordEntity>>
}