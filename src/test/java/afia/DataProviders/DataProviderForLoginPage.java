package afia.DataProviders;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import afia.Utilities.ExcelHandler;
import afia.Utilities.ExcelHandler;

public class DataProviderForLoginPage extends ExcelHandler {
	
	@DataProvider
	public static Object[][] validCredentialsProvider(ITestContext context) throws Exception{

	
		String username=readEXcel(1,0,context);
		String password=readEXcel(1,1,context);
	
      return new Object[][]{{username,password}};
	}	
	
	
	


}
