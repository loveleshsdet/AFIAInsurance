package afia.DataProviders;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import afia.Utilities.ExcelHandler;
import org.apache.poi.ss.util.NumberToTextConverter;



public class DataProviderForVechileDetails extends ExcelHandler {


	@DataProvider
	public static Object[][] validCredentialsProvider(ITestContext context) throws Exception{

	
		String make=readEXcel(3,3,context);
		String model=readEXcel(4,3,context);
		String Model_Spec=readEXcel(5, 3, context);
		String New_Pre=readEXcel(6, 3, context);
		
		String yom=readEXcel(7,3,context);
		String Yearr=readEXcel(8,3,context);
		String rtype=readEXcel(9,3,context);
		String btype=readEXcel(10, 3, context);
		String Capa=readEXcel(11,3,context);
		String place=readEXcel(12,3,context);
		String Promo=readEXcel(13,3, context);
		String CurrentCover=readEXcel(14,3,context);
		String fin=readEXcel(15,3,context);
		String cct=readEXcel(16,3,context);
		String rcov=readEXcel(17,3,context);
		String tpltocomp=readEXcel(18,3,context);
		String VecValue=readEXcel(19,3,context);
		String curDate=readEXcel(20, 3,context);
		
	
      return new Object[][]{{make,model,yom,Yearr,rtype,btype,Capa,place,CurrentCover,fin,cct,rcov,tpltocomp,VecValue,curDate,Model_Spec,New_Pre,Promo}};
	}	
	
	
}
