mvn test "-Dcucumber.filter.tags=@smoke"

while (Get-Process -Name "java" -ErrorAction SilentlyContinue) {
    Start-Sleep -Seconds 2
}

Set-Location .\test-output\

allure serve