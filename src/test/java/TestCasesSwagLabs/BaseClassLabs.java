package TestCasesSwagLabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassLabs {
	WebDriver driver;
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 driver = new ChromeDriver(); // if u give WebDriver driver here..it will cause nullpointer exception...declaration should be given one time which is already declared at line 11
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
		
		@AfterMethod
		public void TearDown()
		{
			//Step7: Close the browser
			driver.close();
		}
}
