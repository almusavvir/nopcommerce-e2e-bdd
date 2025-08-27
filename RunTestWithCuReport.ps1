mvn test "-Dcucumber.filter.tags=@smoke"

while (Get-Process -Name "java" -ErrorAction SilentlyContinue) {
    Start-Sleep -Seconds 2
}

$reportPath = "..\test-output\CucumberReports\report1.html"

if (Test-Path $reportPath) {
    Start-Process $reportPath
}