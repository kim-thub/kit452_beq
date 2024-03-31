package kr.co.kit452.android.baseballquizencyclopedia.data

import kr.co.kit452.android.baseballquizencyclopedia.data.source.WordDao
import kr.co.kit452.android.baseballquizencyclopedia.domain.repository.WordRepository
import javax.inject.Inject

class WordRepositoryImpl @Inject constructor(
    private val WordDao: WordDao
) : WordRepository {

    override fun getAllWords() = WordDao.getAllWords()

    override fun getRandomFourWords() = WordDao.getRandomFourWords()

    override fun searchWords(keyword: String) = WordDao.searchWords(keyword)
}