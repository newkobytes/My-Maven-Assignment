package TestCasesSwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import PagesSwagLabs.LoginPageLabs;

public class SwagLabsLogin extends BaseClassLabs {

	@Test
	public void Test1() {
		
		LoginPageLabs lp = new LoginPageLabs(driver);
		lp.Login("standard_user", "secret_sauce"); //Test1 method for positive tc and Test2 for negative tc
		System.out.println("success");
		//Step6: Validate the error message on screen
		
	}
	
	@Test
	public void Test2()
	{
		LoginPageLabs lp = new LoginPageLabs(driver);
		lp.Login("standard_user", "secret");
		WebElement Error = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ActError = Error.getText();
		String ExpError = "Epic sadface: Username and password do not match any user in this service";
//Assert.assertFalse(Error.isDisplayed());
Assert.assertTrue(Error.isDisplayed());
Assert.assertEquals(ActError, ExpError);

if(ActError.equals(ExpError)) {
	System.out.println("TC PAssed");
}else {
	System.out.println("Tc Failed");
}

}
	
	@Test
	public void Test3()
	{
		String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
        String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		LoginPageLabs lp = new LoginPageLabs(driver);
		lp.Login(UserName, Password);
		System.out.println("Inside Test3 using excel data");
	}
}