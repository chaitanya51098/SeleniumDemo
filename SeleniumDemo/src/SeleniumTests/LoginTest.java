package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("chaitanya.parimi05@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("chaitu12");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		String expectedname="Demo Web Shop";
		String actualname=driver.getTitle();
		System.out.println(actualname);
		if(actualname.equals(expectedname)) {
			System.out.println("Same Page");
			driver.close();
		}
		else {
			System.out.println("Wrong Page");
			driver.quit();
			
		}
	}

}
