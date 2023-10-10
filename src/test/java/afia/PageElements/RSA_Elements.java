package afia.PageElements;

import org.openqa.selenium.By;

public class RSA_Elements {
	
	public String Insurer="//div[@id='rsaManulAutooption']//child::div[@class='wf-col-4']//child::label//child::input[@value='Insurer']";
	public String Manual="//div[@id='rsaManulAutooption']//child::div[@class='wf-col-4']//child::label//child::input[@value='Manually']";
	public String RSA_EXE="//div[@class='wf-col-9']//child::label[@class='checkmark-container rsa-plan-executive']//child::span[@class='checkmark']";
	public String RSA_Com="//div[@class='wf-col-9']//child::label[@class='checkmark-container rsa-plan-msc']//child::span[@class='checkmark']";
	public String RSA_TPL="//div[@class='wf-col-9']//child::label[@class='checkmark-container rsa-plan-tpl']//child::span[@class='checkmark']";
	public String Ag="//div[@class='wf-col-9']//child::label[@class='checkmark-container rsa-plan-agency']//child::span[@class='checkmark']";
	public String NAg="//div[@class='wf-col-9']//child::label[@class='checkmark-container rsa-plan-non-agency']//child::span[@class='checkmark']";
	public String Seating_CAP="//div[@class='wf-col-6']//child::input[@id='seatingCapRsa']";
	public String AF_DIS="//input[@name='rsaAfiadiscountD']";
	public String Generate="//input[@value='Generate Premium']";
	public String Body_Type="//select[@name='bodyTypeRsa']";
	
	public String Make="//select[@id='rsa_make']";
	public String Model="//select[@id='rsa_model']";
	public String Year="//select[@id='rsa_year_model']";
	public String Vech_Desc="//select[@id='rsa_VehicleDescCode']";
	public String Registration="//input[@id='rsa_firstspecificReg']";
	public String NCD="//select[@id='rsa_ncb_years']";
	public String Driv_Name="//input[@id='rsa_drive_name']";
	public String Male="//input[@class='rsa_driver_gender1']";
	public String Female="//input[@class='rsa_driver_gender2']";
	public String Yess="//div[@class='wf-row']//child::div[@class='wf-col-4 padding-ltr']//child::label//child::input[@class='rsa_main_driver_ind1']";
	public String No="//div[@class='wf-row']//child::div[@class='wf-col-4 padding-ltr']//child::label//child::input[@class='rsa_main_driver_ind2']";
	public String Nationality="//select[@id='rsa_main_driver_country']";
	public String DOB="rsa_drive_dob";
	
	String Monthl="//select[@data-handler='selectMonth']";
	String YearL="//select[@data-handler='selectYear']";
	
	public By Man() {
		return By.xpath(Manual);
	}
	
	public By Plan1() {
		return By.xpath(RSA_EXE);
	}
	public By plan2() {
		return By.xpath(RSA_Com);
	}
	public By plan3() {
		return By.xpath(RSA_TPL);
	}
	public By Agency() {
		return By.xpath(Ag);
	}
	public By Non_Agency() {
		return By.xpath(NAg);
	}
	public By Capacity() {
		return By.xpath(Seating_CAP);
	}
	public By Discount_Afia() {
		return By.xpath(AF_DIS);
	}
	public By GeneratePremium() {
		return By.xpath(Generate);
	}
	public By BodyType() {
		return By.xpath(Body_Type);
	}

	public By Insurers() {
		return By.xpath(Insurer);
	}
	
	public By Make() {
		return By.xpath(Make);
	}
	
	public By Model() {
		return By.xpath(Model);
	}
	
	public By Year() {
		return By.xpath(Year);
	}
	public By Vechile_Description() {
		return By.xpath(Vech_Desc);
	}
	public By Reg_Date() {
		return By.xpath(Registration);
	}
	public By NCD() {
		return By.xpath(NCD);
	}
	public By Driv_NAmee() {
		return By.xpath(Driv_Name);
	}
	public By Maleee() {
		return By.xpath(Male);
	}
	public By FeM() {
		return By.xpath(Female);
	}
	public By Ye() {
		return By.xpath(Yess);
	}
	public By Nooo() {
		return By.xpath(No);
	}
	public By Nat() {
		return By.xpath(Nationality);
	}
	public By Dobb() {
		return By.xpath(DOB);
	}
	
	public By MonthL() {
		return By.xpath(Monthl);
	}
	public By YearL(){
		return By.xpath(YearL);
	}
	
}
