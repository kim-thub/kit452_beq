package kr.co.kit452.android.baseballquizencyclopedia.domain.usecase

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.baseballquizencyclopedia.domain.model.WordEntity
import kr.co.kit452.android.baseballquizencyclopedia.domain.repository.WordRepository
import javax.inject.Inject

class SearchWordsUseCase @Inject constructor(
    private val repository: WordRepository
) {

    fun searchWords(keyword: String): Flow<List<WordEntity>> {
        return repository.searchWords(keyword)
    }

}