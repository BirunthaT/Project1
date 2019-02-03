package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class DemoA {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		//Open the Browser
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver1 = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		
		//Get the Title of the page & print it
		String title = driver.getTitle();
		System.out.println(title);
		
		//Get the url present in the current page & print it
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		/*//Get HTML code of the Webpage & print it
		String s = driver.getPageSource();
		System.out.println(s);*/
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com/?gws_rd=ssl");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.get("http://demo.actitime.com");
		
		WebElement e = driver.switchTo().activeElement();
		e.sendKeys("Bindhu");
		
		System.out.println(driver);
		
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		driver.close();
		
		
		
	}

}
