@echo off

echo                                      Git自动更新脚本
echo ===================================================================================
echo.

set /p change=请输入Git更新变动：
echo.
cd "C:\Users\zmlxd\Desktop\xido\leetcode"

git pull
git add .
git commit -m %change%
git push

echo.
echo ===================================================================================
echo                                      更新完毕
echo.

pause