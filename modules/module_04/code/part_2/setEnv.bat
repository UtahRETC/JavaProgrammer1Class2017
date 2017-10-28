@echo off
echo Setting JAVA_HOME
set JAVA_HOME="C:\Program Files\Java\jdk1.8.0_151"
echo setting PATH
set PATH=%JAVA_HOME%\bin;%PATH%
echo Display java version
java -version
set CLASSPATH=.;%CLASSPATH%