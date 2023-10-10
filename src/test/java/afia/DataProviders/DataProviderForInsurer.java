package afia.DataProviders;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import afia.Utilities.ExcelHandler;

public class DataProviderForInsurer extends ExcelHandler {

	@DataProvider
	public static Object[][] validCredentialsProvider(ITestContext context) throws Exception{

	
		String Insurer=readEXcel(21,1,context);
		
	
      return new Object[][]{{Insurer}};
	}	
	
	
}
