package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable notifications");
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Chidambara");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thanu");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8088755398");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Thanu@123");
		driver.findElement(By.xpath("//select[@title='Day']")).click();
		driver.findElement(By.xpath("//option[@value='18']")).click();
		driver.findElement(By.xpath("//select[@title='Month']")).click();
		driver.findElement(By.xpath("//option[normalize-space()='May']")).click();
		driver.findElement(By.xpath("//select[@title='Year']")).click();
		driver.findElement(By.xpath("//option[@value='1987']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();

	}
	

}
