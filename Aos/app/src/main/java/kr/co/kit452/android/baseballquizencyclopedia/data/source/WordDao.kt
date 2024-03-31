package kr.co.kit452.android.baseballquizencyclopedia.data.source

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Query
import androidx.room.RoomDatabase
import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.baseballquizencyclopedia.domain.model.WordEntity

@Dao
interface WordDao {
    @Query("SELECT * FROM db")
    fun getAllWords(): Flow<List<WordEntity>>

    @Query("SELECT * FROM db ORDER BY RANDOM() LIMIT 4")
    fun getRandomFourWords(): Flow<List<WordEntity>>

    @Query("SELECT * FROM db WHERE 용어 LIKE :keyword OR 영어 LIKE :keyword OR 뜻 LIKE :keyword OR 약어 LIKE :keyword")
    fun searchWords(keyword: String): Flow<List<WordEntity>>
}

@Database(entities = [WordEntity::class], version = 1)
abstract class WordDatabase : RoomDatabase() {

    abstract fun wordDirectoryDao(): WordDao

}