package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class DemoB {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		System.out.println(driver);
		//String v = driver.getWindowHandle();
		//System.out.println(v);
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println(allWHS);
		//driver.close();
		
		
		for(String n:allWHS) {
			
			driver.switchTo().window(n);
			//System.out.println("Titles: "+driver.getTitle());
			//driver.close();
			//String title = driver.getTitle();
			String title = driver.getTitle();
			System.out.println(title);
			//Thread.sleep(1000);
			//driver.close();
			if(title.equalsIgnoreCase("Reliance Industries Limited")) {
				//Thread.sleep(1000);
				
				driver.close();
			
			}
			//else driver.close(); driver.switchTo().window(n);
			//else driver.switchTo().window(n);*/
		
		}
	}

}
