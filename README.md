# Baseball-Quiz-Encyclopedia
야구 용어에 대한 사전과 퀴즈 제공

# 내 앱 DB 변경 방법

## 1. CSV 파일을 DB 파일로 변환

- DB Browser for SQLite를 사용해 CSV 파일을 DB 파일로 변환합니다. 

## 2. DB Browser에서 DB 만들기

- DB Browser for SQLite를 열고 새 Database를 만듭니다. 

- 만든 Database에서 'Import'를 선택해 앞서 변환한 CSV 파일을 가져옵니다.

- 자동 생성된 Table을 수정합니다.

## 3. Assets 폴더에 DB 파일 추가

- 위에서 만든 DB 파일을 앱의 Assets 폴더에 추가합니다.

## 4. Database Module 수정

```kotlin
@Module  
@InstallIn(SingletonComponent::class)
object DatabaseModule {

  @Provides  
  @Singleton 
  fun provideDatabase(@ApplicationContext context: Context): WordDatabase {
    return Room.databaseBuilder(
      context,
      WordDatabase::class.java,  
      "내_DB_파일명.db"
    )
    .createFromAsset("내_DB_파일명.db").build()
  }

  @Provides
  @Singleton
  fun provideWordDao(db: WordDatabase): WordDao {
    return db.wordDirectoryDao()
  }   
}
```