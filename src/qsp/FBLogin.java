package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.id("email")).sendKeys("biruntha.tamilarasan");
		driver.findElement(By.id("pass")).sendKeys("Tamilarasan12@");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.close();
	}

}
