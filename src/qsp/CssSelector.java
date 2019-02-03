package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		
		public static void main(String[] args) throws IOException {
			
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/Biruntha/Desktop/sample.html");
			driver.findElement(By.cssSelector("a[id='d1']")).click();
			driver.navigate().back();
			
			driver.findElement(By.cssSelector("a[name='n1']")).click();
			driver.navigate().back();
			
			driver.findElement(By.cssSelector("a[class='c1']")).click();
			driver.navigate().back();
			
			driver.findElement(By.cssSelector("a[title='t1']")).click();
			driver.navigate().back();
			
			driver.findElement(By.cssSelector("a[href='http://www.google.com']")).clear();
			driver.close();
		}

	}

