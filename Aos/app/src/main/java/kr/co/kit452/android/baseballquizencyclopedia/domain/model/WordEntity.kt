package kr.co.kit452.android.baseballquizencyclopedia.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "db")
data class WordEntity(

    @PrimaryKey
    @ColumnInfo(name="용어")
    val word: String,

    @ColumnInfo(name="뜻")
    val meaning: String,

    @ColumnInfo(name="출처")
    val source: String?,

    @ColumnInfo(name="영어")
    val english: String?,

    @ColumnInfo(name="약어")
    val abbreviation: String?,

    @ColumnInfo(name="힌트")
    val hint: String?,

    @ColumnInfo(name="동영상(링크)")
    val video: String?,

    @ColumnInfo(name="사진")
    val image: String?

)

