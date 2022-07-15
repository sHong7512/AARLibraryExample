# AARLibraryExample

같은 패키지 안에서 적용하는 버전

1. 안드로이드 4.2 버전에서는 gradle -> task가 안뜰수 있음. 

preferences -> Experimental -> Do not build Gradle task list during Gradle sync 체크 해제 -> sync project with gradle files

하면 task폴더가 표시된다.


2. aar파일 위치
 
Gradle에서 assemble release로 빌드하면 project - build - outputs - aar 폴더에 있음


3. 자세한 방법은 레퍼런스 참고 

reference : https://developer.android.com/studio/projects/android-library?hl=ko
