# AARLibraryExample

라이브러리 제작(aar) & 퍼블리싱 (jitpack)

1. 안드로이드 4.2 버전에서는 gradle -> task가 안뜰수 있음. 

preferences -> Experimental -> Do not build Gradle task list during Gradle sync 체크 해제 -> sync project with gradle files

하면 task폴더가 표시된다.


2. aar파일 위치
 
Gradle에서 assemble release로 빌드하면 project - build - outputs - aar 폴더에 있음


3. 자세한 방법은 레퍼런스 참고 

- 기본 aar 만들기

reference : https://developer.android.com/studio/projects/android-library?hl=ko

- jitpack 퍼블리싱

reference : https://dev.to/vtsen/how-to-publish-android-library-on-jitpackio-with-github-50n1

- jitpack 주소

https://jitpack.io/#sHong7512/AARLibraryExample

4. 에러 처리

minsdk가 28로 높아서 아래와 같은 에러 발생할 수 있음

```
Manifest merger failed : uses-sdk:minSdkVersion 19 cannot be smaller than version 28 declared in library [com.github.sHong7512:AARLibraryExample:0.0.3] /Users/shong/.gradle/caches/transforms-3/f021ea286cbe0885d14c019305f20f70/transformed/AARLibraryExample-0.0.3/AndroidManifest.xml as the library might be using APIs not available in 19
	Suggestion: use a compatible library with a minSdk of at most 19,
		or increase this project's minSdk version to at least 28,
		or use tools:overrideLibrary="com.shong.examplecal" to force usage (may lead to runtime failures)
```

```
<uses-sdk tools:overrideLibrary="com.shong.examplecal" />
```

위 문구를 AndroidManifest에 삽입하면 됨


