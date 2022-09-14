package PagesSwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLabs {

WebDriver driver;
	
	/* objects */
	
	@FindBy (id="user-name")
	WebElement UserName;
	@FindBy (id="password")
	WebElement Password;
	
	@FindBy (id="login-button")
	WebElement LoginBtn;
	
	public LoginPageLabs(WebDriver basedriver)
	{
		this.driver=basedriver;
		PageFactory.initElements(basedriver, this);
	}
	public void Login(String Usernameval , String Passwordval)
	{
		
					
					
					//Step1: Enter Username
					 
					UserName.sendKeys(Usernameval);
					
					//Step2: Enter Password
					 
					Password.sendKeys(Passwordval);
					
					
					//Step3: Click pn Login Button
					 
					LoginBtn.click();
					
	}
}
