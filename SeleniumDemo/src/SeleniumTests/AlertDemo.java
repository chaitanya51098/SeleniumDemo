package SeleniumTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
	    
				driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		        driver.manage().window().maximize();
		        
		        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		        
		        Alert alert=driver.switchTo().alert();
		        String alertmessage=driver.switchTo().alert().getText();
		        System.out.println(alertmessage);
		        alert.accept();
		     
		        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		        Alert alert1=driver.switchTo().alert();
		        String alertmsg1=driver.switchTo().alert().getText();
		        System.out.println(alertmsg1);
		        alert.dismiss();
		        
		        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		        
		        Alert alert2=driver.switchTo().alert();
		        String alertmsg2=driver.switchTo().alert().getText();
		        System.out.println(alertmsg2);
		        alert2.sendKeys("123457");
		        alert2.accept();
		        
		        String a=driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		        System.out.println(a);
		        driver.close();
		  
		        



	}

}
