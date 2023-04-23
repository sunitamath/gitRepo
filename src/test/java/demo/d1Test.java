package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d1Test {
	@Test
	public void Sample() {
		WebDriver driver=null;
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=WebDriverManager.chromedriver().create();
		}else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=WebDriverManager.firefoxdriver().create();
		}else { 
			WebDriverManager.chromedriver().create();
	}
	driver.get(URL);
	}
	// push changes
	// send changess
}


