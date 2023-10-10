package afia.PageElements;

import org.openqa.selenium.By;

public class LoginPageElements {

	String id="//input[@id='inputEmail']";
	
	String pass="//input[@id='inputPassword']";
	
	String Signin="//input[@type='submit']";
	
	public By Id() {
		return By.xpath(id);
	}
	public By Password() {
		return By.xpath(pass);
	}
	public By SignIN() {
		return By.xpath(Signin);
	}
}
