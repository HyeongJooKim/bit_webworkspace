@echo off

rem ������ Ŭ������ �Է¹ޱ�
echo bin ���� ������?
set /p dirname=

echo Ŭ������?
set /p name=
echo ----%dirname%.%name%-start--------

rem �����ϸ�ɾ����
javac -d . -encoding utf8 .\bin\%dirname%\%name%.java
java bin.%dirname%.%name%
echo ----%dirname%.%name%-end----------
