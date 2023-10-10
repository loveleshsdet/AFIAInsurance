package afia.PageElements;

import org.openqa.selenium.By;

public class CreateQuoteElements {

	public String Customet_Type1="//select[@id='cutomer_type1']";
	public String Customer_Type2="//select[@id='cutomer_type2']";
	public String First_Name="//input[@name='firstName']";
	public String Last_Name="//input[@name='lastName']";
	public String Email="//input[@type='email']";
	public String phone="//input[@id='phone']";
	public String Title="//select[@id='title']";
	public String Dob= "//input[@id='dob']";
	public String Nationality="//select[@name='nationality']";
	public String DrivingLic="//select[@name='useDrivingLicence']";
	public String backhome="//input[@name='backHomeDrivingLicence']";
	public String TotalDrvngExp="//input[@name='drivingLicenceExperience']";
	public String ClaimHist="//select[@name='claimHistory']";
	public String address="//input[@name='address']";
	public String Zipcode="//input[@id='zipCode']";
	public String City="//input[@name='city']";
	public String Trade_LicenseNo="//input[@name='tradeLicenceNo']";
	public String Make="//select[@name='Make']";
	public String Model="//select[@name='Model']";
	public String Model_Spec="//input[@name='ModelSpecification']";
	public String neworpre="//select[@name='Brandneworpre']";
	public String Manu="//select[@name='YearofManufacture']";
	public String yoRR="//input[@name='YearoffirstRegistration']";
	public String RegType="//select[@name='RegistrationType']";
	public String BodyType="//select[@name='BodyType']";
	public String capacity="//input[@name='SeatingCapacity']";
	public String ReqPlace="//select[@id='EmirateofRegistration']";
	public String promo="//input[@name='Promo']";
	public String CurInsWith="//input[@name='CurrentlyInsuredwith']";
	public String Finance="//select[@name='BankFinance']";
	public String curCoverType="//select[@name='CurrentCoverType']";
	public String ReqCover="//select[@name='RequiredCover']";
	public String Tpltocomp="//select[@name='TPLtoComprehensive']";
	public String vechValue="//input[@id='VehicleValue']";
	public String QuoteDate="//input[@name='quoteInceptionDate']";
	public String Save="//div[@class='wf-col-6']//child::a[contains(text(),'Save')]";
	public String TradeLic="";
	
	
	
	
	
	String Monthl="//select[@data-handler='selectMonth']";
	String YearL="//select[@data-handler='selectYear']";
	
	public By first() {
		return By.xpath(First_Name);
	}
	
	public By last() {
		return By.xpath(Last_Name);
	}
	
	public By custype() {
		return By.xpath(Customet_Type1);
	}
	public By custype2() {
		return By.xpath(Customer_Type2);
	}
	public By Email() {
		return By.xpath(Email);
		
	}
	public By phoneno() {
		return By.xpath(phone);
	}
	public By Title() {
		return By.xpath(Title);
	}
	public By DOB() {
		return By.xpath(Dob);
	}
	public By nat() {
		return By.xpath(Nationality);
	}
	public By UAEDRIV() {
		return By.xpath(DrivingLic);
	}
	public By bkhome() {
		return By.xpath(backhome);
	}
//	public By totDriv() {
//		return By.xpath(TotalDrvngExp);
//	}
	public By totalDrvng() {
		return By.xpath(TotalDrvngExp);
	}
	public By claimhis() {
		return By.xpath(ClaimHist);
	}
	
	public By add() {
		return By.xpath(address);
	}
	
	public By zip() {
		return By.xpath(Zipcode);
	}
	public By city() {
		return By.xpath(City);
	}
	public By tradLic() {
		return By.xpath(Trade_LicenseNo);
	}
	
	public By makeor() {
		return By.xpath(Make);
	}
	public By modell() {
		return By.xpath(Model);
	}
	public By modspec() {
		return By.xpath(Model_Spec);
	}
	
	public By Brand_or_Pre() {
		return By.xpath(neworpre);
	}
	
	public By YOm() {
		return By.xpath(Manu);
	}
	public By Yrof_FR() {
		return By.xpath(yoRR);
	}
	public By Rtype() {
		return By.xpath(RegType);
	}
	public By BType() {
		return By.xpath(BodyType);
	}
	public By cap() {
		return By.xpath(capacity);
	}
	public By Reqplace() {
		return By.xpath(ReqPlace);
	}
	public By promoo() {
		return By.xpath(promo);
	}
	public By CurInsWith() {
		return By.xpath(CurInsWith);
	}
	public By Finance() {
		return By.xpath(Finance);
	}
	public By CurCover() {
		return By.xpath(curCoverType);
	}
	public By ReqCover() {
		return By.xpath(ReqCover);
	}
	public By Compre() {
		return By.xpath(Tpltocomp);
	}
	public By vechVal() {
		return By.xpath(vechValue);
	}
	public By Quote() {
		return By.xpath(QuoteDate);
	}
	public By Save() {
		return By.xpath(Save);
	}
	public By MonthL() {
		return By.xpath(Monthl);
	}
	public By YearL(){
		return By.xpath(YearL);
	}
	
}

