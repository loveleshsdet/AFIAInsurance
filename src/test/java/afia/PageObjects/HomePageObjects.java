package afia.PageObjects;

import org.openqa.selenium.WebDriver;

import afia.PageElements.HomepageElements;
import afia.Utilities.ReusableMethods;

public class HomePageObjects extends ReusableMethods {
	HomepageElements e=new HomepageElements();
	public HomePageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public QuotePageObjects Quote() {
		//waitByClickable(e.Quote());
		click(e.Quote());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		waitByClickable(e.CreateQuote());
		click(e.CreateQuote());
		return new QuotePageObjects(driver);
	}
	
	
	
	
}
