@echo off

rem 변수에 클래스명 입력받기
echo bin 이하 폴더명?
set /p dirname=

echo 클래스명?
set /p name=
echo ----%dirname%.%name%-start--------

rem 컴파일명령어실행
javac -d . -encoding utf8 .\bin\%dirname%\%name%.java
java bin.%dirname%.%name%
echo ----%dirname%.%name%-end----------
