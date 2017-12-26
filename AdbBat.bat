cd D:\IntellectoKids\android-sdk\platform-tools
start adb.exe
rem Следующие три строки считывают переменную и удаляют из нее кавычки
set test=%1
set test=%test:"=%
adb %test%
pause