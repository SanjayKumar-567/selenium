package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import fileutility.ReadProperty;

public class BaseClass {
	 public WebDriver driver;

	@BeforeClass

	public void openbrowser() {
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		ReadProperty properties = new ReadProperty();
		String url = properties.fetchproperty("url");

		driver.get(url);
		Reporter.log("browser opend sucessfuly and navigated to home page", true);
	}

	@BeforeMethod
	public void login() {

		ReadProperty properties = new ReadProperty();
		String username = properties.fetchproperty("username");

		driver.findElement(By.id("Email")).sendKeys(username);
		String password = properties.fetchproperty("password");
		// driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Reporter.log("logged in sucessfully", true);
	}

	@AfterMethod
	public void logout() {
		//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']
		//*[name()='path' and contains(@d,'M19.14 12.')]
	//	driver.findElement(By.xpath("//*[name()='svg'and @data-testid='SettingsIcon']")).click();
		//driver.findElement(By.xpath("//a[@id='cart']/following::div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/article/div[3]/div[1]/button"));
	
		WebElement  logout= driver.findElement(By.xpath("//*[name()='svg'and @data-testid='LogoutIcon']"));


            logout.click();//li[normalize-space()='Logout']
		Reporter.log("logged out sucessfully", true);
	}

	@AfterClass
	public void closebrowser() {
		//driver.close();
		Reporter.log("browser closed sucessfullu", true);
	}

}
