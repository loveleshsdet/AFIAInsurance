package afia.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.ITestContext;

public class ExcelHandler {
	public static String readEXcel(int i,int j,ITestContext context) throws IOException {
		
		String excelLoc=context.getCurrentXmlTest().getParameter("excelLoc");
		String Sheetname=context.getCurrentXmlTest().getParameter("sheetName");
		HSSFCell cell;
		String excelSheet=System.getProperty("user.dir")+excelLoc;
		File src = new File(excelSheet);
		FileInputStream finput = new FileInputStream(src);
		HSSFWorkbook workbook = new HSSFWorkbook(finput);
		//HSSFSheet sheet = workbook.getSheetAt(0);
		HSSFSheet s=workbook.getSheet(Sheetname);
		cell=s.getRow(i).getCell(j);
		String ss=cell.getStringCellValue();
		//System.out.println(ss);
		workbook.close();
		return ss;
		
	}
	
}