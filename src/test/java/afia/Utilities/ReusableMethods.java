package afia.Utilities;


import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.util.DateFormatConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
	public  static  WebDriver driver;
	
	public ReusableMethods(WebDriver driver){
		this.driver=driver;
	}
	
	public void type(By locator,String value){
		
		driver.findElement(locator).sendKeys(value);
		
	}
	
	public void click(By locator){
		driver.findElement(locator).click();
		
	}
	public void clear(By Locator) {
		driver.findElement(Locator).clear();
	}
	
	public String getText(By locator){
		return driver.findElement(locator).getText();		
	}
	
	public boolean valueEqualTo(By locator,String value){
		return driver.findElement(locator).getText().equals(value);		
	}
	
	public String getTitle(){
		return driver.getTitle();		
	}
	
	public void waitByVisibility(By Locator) {		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locator)));
	}
	
	public void waitByClickable(By Locator) {		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locator)));
	}
	
	public void waitBySelect(By Locator) {		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(Locator)));
	}
	
	public void getDropdown(By Locator,String Value) {
		Select s=new Select(driver.findElement(Locator));
		s.selectByVisibleText(Value);
	}
	
	public List<WebElement> products(By Locator) {
		return driver.findElements(Locator);
	}
	
	public void ScrollToBottomOfPage() {
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
	}
	public WebElement WebElements(By Locator) {
		return driver.findElement(Locator);
	}
	
	public void ScrolltoElement(By Locator) {
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		WebElement element=WebElements(Locator);
		j.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void Hover(By locator) {
		Actions act=new Actions(driver);
		WebElement target = driver.findElement(locator);
		act.moveToElement(target);
	}
	
	public void drp_down(By Locator,String FI_Name) {
		int k=1;
		Select s=new Select(driver.findElement(Locator));
		List<WebElement> l=s.getOptions();
		String arr[]=FI_Name.split("'");
		System.out.println("Please select "+arr[1]+" from below");
		for(int i=0;i<l.size();i++) {
		
		System.out.println(k+"."+l.get(i).getText());
		k+=1;
		}
		 Scanner sc=new Scanner(System.in);
		int  z=sc.nextInt();
		//sc.close();
		for(int j=0;j<l.size();j++) {
			if(z==(j+1)) {
				s.selectByVisibleText(l.get(j).getText());
			}
			else {
		
			}
		}
		
	}
	public  void  dateSelect(String date,By Locator,By yearl,By monthl) {

		String a[]=date.split("/");
		String days=a[0];
		int monthint=Integer.parseInt(a[1]);
		String month=DatintToStr(monthint);
		String year=a[2];
		int dayas=Integer.parseInt(days);
		String day=Integer.toString(dayas);
//		System.out.println(day);
//		System.out.println(month);
//		System.out.println(year);
		String dayy="//table[@class='ui-datepicker-calendar']//child::tbody//child::tr//child::td//child::a[contains(text(),'"+day+"')]";
		By dayl=By.xpath(dayy);
		click(Locator);
		getDropdown(yearl, year);
		getDropdown(monthl, month);
		click(dayl);

	}
	public void select_CurrentDate(By Locator) {
		DateFormat dateFormat = new SimpleDateFormat("dd");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String datee= dateFormat.format(date);
		 int a=Integer.parseInt(datee);
		 if(a<10) {
			 String ss=Integer.toString(a);
			 String dayy="//table[@class='ui-datepicker-calendar']//child::tbody//child::tr//child::td//child::a[contains(text(),'"+ss+"')]";
			 By date1=By.xpath(dayy);
			 //System.out.println(date1);
			 click(Locator);
			 click(date1);
		 }
		 else {
		
		 String dayy="//table[@class='ui-datepicker-calendar']//child::tbody//child::tr//child::td//child::a[contains(text(),'"+datee+"')]";
		 By date1=By.xpath(dayy);
		 //System.out.println(date1);
		 click(Locator);
		 click(date1);
		 }
		 
//		 //System.out.println(date1);
//		 click(Locator);
//		 click(date1);
		 
		 
		 
		
	}
	public  String DatintToStr(int i) {
		String MonthS="";
		String  a[]= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		for(int j=0;j<a.length;j++) {
			
			if(j==i-1) {
			 MonthS+=a[j];
			
			return MonthS;
		}
		}
		return MonthS;
		
	}
	
	public void drp_downwithIndex(By Locator,int index) {
		int k=1;
		Select s=new Select(driver.findElement(Locator));
		List<WebElement> l=s.getOptions();
		for(int i=0;i<l.size();i++) {
		
	//	System.out.println(k+"."+l.get(i).getText());
		k+=1;
		}
		 //Scanner scan=new Scanner(System.in);
	//int z1=scan.nextInt();
//		System.out.println("line passed");
////		for(int j=0;j<l.size();j++) {
////			if(z==(j+1)) {
////				s.selectByValue(l.get(j).getText());
////			}
		//int index=z1-1;
//		System.out.println("here");
	Select s1=new Select(driver.findElement(Locator));
	s1.selectByIndex(index);
	//scan.close();

	}
	
}
