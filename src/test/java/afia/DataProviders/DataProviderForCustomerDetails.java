package afia.DataProviders;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import afia.Utilities.ExcelHandler;


public class DataProviderForCustomerDetails extends ExcelHandler {
	
	@DataProvider
	public static Object[][] validCredentialsProvider(ITestContext context) throws Exception{

	
		String first=readEXcel(3,1,context);
		String last=readEXcel(4,1,context);
		String email=readEXcel(5,1,context);
		String no=readEXcel(6,1,context);
		String Title=readEXcel(7,1,context);
		String date=readEXcel(8, 1, context);
		String Nationality=readEXcel(9,1,context);
		String UAED=readEXcel(10,1,context);
		String bckHome=readEXcel(11,1,context);
		String ind=readEXcel(12,1,context);
		String addr=readEXcel(13,1,context);
		String Zip=readEXcel(14,1,context);
		String Coun=readEXcel(15,1,context);
		String Custype=readEXcel(17,1,context);
		String TradeLic=readEXcel(16, 1, context);
		
	
      return new Object[][]{{first,last,email,no,Title,date,Nationality,UAED,bckHome,ind,addr,Zip,Coun,Custype,TradeLic}};
	}	
	
	
	


}
