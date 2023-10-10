package afia.PageTest;

import org.testng.annotations.Test;

import afia.PageObjects.HomePageObjects;
import afia.PageObjects.LoginPageObjects;
import afia.Utilities.OpenandCloseBrowser;
import afia.DataProviders.DataProviderForLoginPage;

public class LoginPageTest extends OpenandCloseBrowser{

	@Test(dataProviderClass=DataProviderForLoginPage.class,dataProvider="validCredentialsProvider")
	public void Login(String mail,String pass) throws InterruptedException {
		
		LoginPageObjects pg=new LoginPageObjects(driver);
			Thread.sleep(5000);
		HomePageObjects H=pg.Login(mail, pass);	
		//HomePageObjects test=
	}
}
