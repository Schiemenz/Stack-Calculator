@echo off
echo type 'quit' to exit the stack calculator
cd %~dp0
java -cp . de.schiemenz.stackcalc.Calculator
pause