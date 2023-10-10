package afia.PageObjects;

import org.openqa.selenium.WebDriver;

import afia.PageElements.RSA_Elements;
import afia.Utilities.ReusableMethods;

public class RSAPageObject extends ReusableMethods {

	RSA_Elements e=new RSA_Elements();
	public RSAPageObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void RSA_INS(String Type,String Cap,String dis,String BodyType,String Make,String Model,String YOR,String DESC,String DATE,String NCD
			,String Main_DRiv,String FullName,String Nationality,String DOB,String Gender) {
		
		if(Type.equalsIgnoreCase("INSURER")) {
			click(e.Insurers());
			click(e.Plan1());
			click(e.plan2());
			click(e.plan3());
			click(e.Agency());
			click(e.Non_Agency());
			getDropdown(e.Make(), Make);
			try {Thread.sleep(2000);} catch (InterruptedException e1) {}
			getDropdown(e.Model(),Model);
			getDropdown(e.Year(), YOR);
			try {Thread.sleep(3000);} catch (InterruptedException e1) {}
			getDropdown(e.Vechile_Description(), DESC);
			try {Thread.sleep(3000);} catch (InterruptedException e1) {}
			dateSelect(DATE,e.Reg_Date(), e.YearL(),e.MonthL());
			getDropdown(e.NCD(),NCD);
			if(Main_DRiv.equalsIgnoreCase("NO")) {
				click(e.Nooo());
				try {Thread.sleep(2000);} catch (InterruptedException e1) {}
				type(e.Driv_NAmee(),FullName);
				getDropdown(e.Nat(),Nationality);
				dateSelect(DOB, e.Dobb(),e.YearL(), e.MonthL());
			}
			else if(Main_DRiv.equalsIgnoreCase("Yes")) {
				click(e.Ye());
			}
			else {
				System.out.println("Error");
			}
			try {Thread.sleep(2000);} catch (InterruptedException e1) {}
			if(Gender.equalsIgnoreCase("male")) {
				click(e.Maleee());
			}
			else if(Gender.equalsIgnoreCase("Female")) {
				click(e.FeM());
			}
			else {
				System.out.println("Error");
			}
			type(e.Discount_Afia(), dis);
			try {Thread.sleep(3000);} catch (InterruptedException e1) {}
			ScrolltoElement(e.GeneratePremium());
			try {Thread.sleep(2000);} catch (InterruptedException e1) {}
			click(e.GeneratePremium());
			
			
		}
		else if(Type.equalsIgnoreCase("Manual")){
			System.out.println("In Manual");
		click(e.Man());
		click(e.Plan1());
		click(e.plan2());
		click(e.plan3());
		click(e.Agency());
		click(e.Non_Agency());
		type(e.Capacity(), Cap);
		try {Thread.sleep(2000);} catch (InterruptedException e1) {}
		getDropdown(e.BodyType(), BodyType);
		type(e.Discount_Afia(), dis);
		try {Thread.sleep(3000);} catch (InterruptedException e1) {}
		ScrolltoElement(e.GeneratePremium());
		try {Thread.sleep(2000);} catch (InterruptedException e1) {}
		click(e.GeneratePremium());
	}
		
		else {
			System.out.println("Error");
		}
		}

}
