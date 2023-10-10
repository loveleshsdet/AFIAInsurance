package afia.PageTest;

import org.testng.annotations.Test;

import afia.PageObjects.HomePageObjects;
import afia.PageObjects.QuotePageObjects;
import afia.Utilities.ReusableMethods;

public class HomePageTest {
	
	HomePageObjects o=new HomePageObjects(ReusableMethods.driver);
	@Test
	public void HomeTest() {
		QuotePageObjects ob=o.Quote();
	}

}
