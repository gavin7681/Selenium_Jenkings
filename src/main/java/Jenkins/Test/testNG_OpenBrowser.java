package Jenkins.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_OpenBrowser {
  //Open Browser Test Cases
	 private WebDriver driver;
		@BeforeTest
		public void beforeTest() {	
			 System.setProperty("webdriver.chrome.driver", "C:/WebDriver/chromedriver.exe");
			//System.setProperty("webdriver.firefox.driver", "H:/webdrivers/geckodriver-v0.26.0-win64/geckodriver.exe");
 	
			
			driver = new ChromeDriver();  
		}
	 
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();	
			System.out.println("Test Started");
	
			Assert.assertTrue(title.contains("Demo Guru99 Page"));
			System.out.println("Test Success");
			
		}	
			
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
	
	
}
