package afia.DataProviders;


import java.io.File;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import afia.Utilities.ExcelHandling;
public class DataProviderForQuotePage {

	@DataProvider
	public static Object[][] validCredentialsProviderQuote(ITestContext context) throws Exception {
		String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
		String sheetName=context.getCurrentXmlTest().getParameter("sheetName");

		  File location=new File(System.getProperty("user.dir")+excelLoc);
		  ExcelHandling excel=new ExcelHandling(location);
		  excel.selectSheet(sheetName);
		  System.out.println(excelLoc+" "+sheetName);
			String first=excel.getColumn(1).get(3).getContents();
			System.out.println(first);
			String last=excel.getColumn(2).get(3).getContents();
			String email=excel.getColumn(3).get(3).getContents();
			String no=excel.getColumn(4).get(3).getContents();
			String Title=excel.getColumn(5).get(3).getContents();
			String date=excel.getColumn(6).get(3).getContents();
			String Nationality=excel.getColumn(3).get(6).getContents();
			String UAED=excel.getColumn(8).get(3).getContents();
			String bckHome=excel.getColumn(9).get(3).getContents();
			String ind=excel.getColumn(10).get(3).getContents();
			String addr=excel.getColumn(11).get(3).getContents();
			String Zip=excel.getColumn(12).get(3).getContents();
			String Coun=excel.getColumn(13).get(3).getContents();
			
		
	      return new Object[][]{{first,last,email,no,Title,date,Nationality,UAED,bckHome,ind,addr,Zip,Coun}};
		  
//		  String Name=excel.getColumn(1).get(5).getContents();
//		  String Mobile=excel.getColumn(2).get(5).getContents();
//		  String pinc=excel.getColumn(3).get(5).getContents();
//		  String loca=excel.getColumn(4).get(5).getContents();
//		  String addr=excel.getColumn(5).get(5).getContents();
//		  
//		return new Object[][] {{Name,Mobile,pinc,loca,addr}};
	}
	
}
