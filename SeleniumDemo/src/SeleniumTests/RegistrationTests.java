package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTests {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
		
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));   
	    Select sel1=new Select(year);
	    sel1.selectByVisibleText("2015");
	    
	    WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
	    Select sel2=new Select(month);
	    sel2.selectByValue("May");
	    
	    WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
	    Select sel3=new Select(day);
	    sel3.selectByIndex(21);


	}

}


    

