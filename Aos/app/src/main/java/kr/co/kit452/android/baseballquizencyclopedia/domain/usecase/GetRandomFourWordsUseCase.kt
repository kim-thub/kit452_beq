package kr.co.kit452.android.baseballquizencyclopedia.domain.usecase

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.baseballquizencyclopedia.domain.model.WordEntity
import kr.co.kit452.android.baseballquizencyclopedia.domain.repository.WordRepository
import javax.inject.Inject

class GetRandomFourWordsUseCase @Inject constructor(
    private val repository: WordRepository
) {

    fun getWords(): Flow<List<WordEntity>> {
        return repository.getRandomFourWords()
    }

}