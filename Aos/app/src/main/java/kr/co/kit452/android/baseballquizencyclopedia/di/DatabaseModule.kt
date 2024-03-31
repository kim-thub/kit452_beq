package kr.co.kit452.android.baseballquizencyclopedia.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kr.co.kit452.android.baseballquizencyclopedia.data.source.WordDao
import kr.co.kit452.android.baseballquizencyclopedia.data.source.WordDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): WordDatabase {
        return Room.databaseBuilder(
            context,
            WordDatabase::class.java,
            "db.db"
        )
            .createFromAsset("word_db.db").build()
    }

    @Provides
    @Singleton
    fun provideWordDao(db: WordDatabase): WordDao {
        return db.wordDirectoryDao()
    }
}