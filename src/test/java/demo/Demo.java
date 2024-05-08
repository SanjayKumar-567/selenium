package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo  {
@Test
public void demotest() {
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("demo working");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=bookmyshow&oq=&gs_lcrp=EgZjaHJvbWUqCQgDECMYJxjqAjISCAAQLhgnGK8BGMcBGOoCGI4FMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMgkIBxAjGCcY6gLSAQo2ODIzNzBqMGo3qAIIsAIB&sourceid=chrome&ie=UTF-8");
Reporter.log("automated to webpage sucessfully",true);
	}

}
