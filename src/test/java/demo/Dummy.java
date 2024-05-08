package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dummy {
	@Test
	public void loginTest( ) {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));
		Assert.assertEquals(login.isDisplayed(), true);
		//driver.findElement(By.id("Email")).sendKeys(username);
		//driver.findElement(By.id("Password")).sendKeys(password);
		
	}

}
