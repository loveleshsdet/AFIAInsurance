package afia.PageObjects;

import org.openqa.selenium.WebDriver;

import afia.PageElements.LoginPageElements;
import afia.Utilities.ReusableMethods;

public class LoginPageObjects extends ReusableMethods{
	
	
	public LoginPageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public LoginPageElements obj=new LoginPageElements();
	public HomePageObjects Login(String mail,String pass) {
		waitByVisibility(obj.Id());
		type(obj.Id(),mail );
		waitByVisibility(obj.Password());
		type(obj.Password(),pass);
		waitByClickable(obj.SignIN());
		click(obj.SignIN());
		return new HomePageObjects(driver);
	}

}
