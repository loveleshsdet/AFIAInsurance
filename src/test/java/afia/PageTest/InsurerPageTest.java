package afia.PageTest;

import org.testng.annotations.Test;

import afia.DataProviders.DataProviderForInsurer;
import afia.PageObjects.InsurerPageObjects;
import afia.Utilities.ReusableMethods;

public class InsurerPageTest {
	InsurerPageObjects o=new InsurerPageObjects(ReusableMethods.driver);
	@Test(dataProviderClass=DataProviderForInsurer.class,dataProvider="validCredentialsProvider")
	public void InsurerTest(String Insurer) {
		o.Insurers(Insurer);
	}

}
