package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestUiPath {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable notifications");
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		WebElement title = driver.findElement(By.xpath("//a[normalize-space()='ACME System 1']"));
		

	}

}
