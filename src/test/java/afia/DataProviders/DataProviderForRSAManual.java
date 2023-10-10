package afia.DataProviders;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import afia.Utilities.ExcelHandler;

public class DataProviderForRSAManual extends ExcelHandler {
	
	@DataProvider
	public static Object[][] validCredentialsProvider(ITestContext context) throws Exception{

		String Type=readEXcel(23,1, context);
		String SeatingCAP=readEXcel(11,3,context);
		String BodyType=readEXcel(10,3, context);
		String Discount=readEXcel(35,1,context);
		String Make=readEXcel(24,1, context);
		String Model=readEXcel(25, 1, context);
		String YOR=readEXcel(26, 1, context);
		String DESC=readEXcel(27, 1, context);
		String DATE=readEXcel(28, 1, context);
		String NCD=readEXcel(29, 1, context);
		String Main_DRiv=readEXcel(30, 1, context);
		String FullName=readEXcel(32, 1, context);
		String Nationality=readEXcel(33, 1, context);
		String DOB=readEXcel(34, 1, context);
		String Gender=readEXcel(31, 1, context);
      return new Object[][]{{Type,SeatingCAP,Discount,BodyType,Make,Model,YOR,DESC,DATE,NCD,Main_DRiv,FullName,Nationality,DOB,Gender}};

}
	
}
