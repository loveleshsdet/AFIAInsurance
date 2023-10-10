package afia.PageObjects;

import org.openqa.selenium.WebDriver;

import afia.PageElements.CreateQuoteElements;
import afia.Utilities.ReusableMethods;

public class QuotePageObjects extends ReusableMethods{
	CreateQuoteElements e=new CreateQuoteElements();
	public QuotePageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void CustomerDetails(String first,String last,String email,String no,String Title,String date,String Nationality,String UAED,String bckHome,
			String addr,String Zip,String Coun,String index,String Custype,String TradeLic) {
		try {Thread.sleep(2000);} catch (InterruptedException e1) {	}
		getDropdown(e.custype(), Custype);
		//drp_down(e.custype(),e.Customet_Type1);
		//drp_down(e.custype2());
		//getDropdown(e.custype2(), "Commercial");
		type(e.first(), first);
		type(e.last(),last);
		type(e.Email(),email);
		type(e.phoneno(),no);
		getDropdown(e.Title(), Title);
		//drp_down(e.Title(),e.Title);
		dateSelect(date,e.DOB(), e.YearL(), e.MonthL());
		getDropdown(e.nat(), Nationality);
		getDropdown(e.UAEDRIV(), UAED);
		type(e.bkhome(), bckHome);
		//type(e.totalDrvng(), DRVexp);
		getDropdown(e.claimhis(),index);
		//drp_downwithIndex(e.claimhis(),index);
		type(e.add(), addr);
		type(e.zip(),Zip);
		type(e.city(), Coun);		
	}
	
	public InsurerPageObjects VeichleDetails(String make,String model,String yom,String Yearr,String rtype,String btype,String Capa,String place,String CurrentCover,
			String fin,String cct,String rcov,String tpltocomp,String VecValue,String curDate,String Model_Spec,String New_Pre,String Promo) {
		waitByClickable(e.makeor());
		//drp_down(e.makeor(),e.Make);
		getDropdown(e.makeor(), make);
		
		try {Thread.sleep(3000);} catch (InterruptedException e1) {	}
		waitByClickable(e.modell());
		getDropdown(e.modell(),model);
		//drp_down(e.modell(),e.Model);
		
		type(e.modspec(), Model_Spec);
		if(New_Pre.equalsIgnoreCase("Yes")) {
		getDropdown(e.Brand_or_Pre(), "Brand new");}
		else if(New_Pre.equalsIgnoreCase("No")){
			getDropdown(e.Brand_or_Pre(), "Pre Owned");
		}
		waitByClickable(e.YOm());
		getDropdown(e.YOm(), yom);
		//drp_down(e.YOm(),e.Manu);
		type(e.Yrof_FR(), Yearr);
		waitByClickable(e.Rtype());
		getDropdown(e.Rtype(), rtype);
		//drp_down(e.Rtype(),e.RegType);
		waitByClickable(e.BType());
		getDropdown(e.BType(),btype);
		//drp_down(e.BType(),e.BodyType);
		type(e.cap(), Capa);
		type(e.promoo(),Promo);
		getDropdown(e.Reqplace(), place);
		//drp_down(e.Reqplace(),e.ReqPlace);
		type(e.CurInsWith(), CurrentCover);
		//drp_down(e.Finance(),e.Finance);
		getDropdown(e.Finance(), fin);
		//drp_down(e.CurCover(),e.curCoverType);
		getDropdown(e.CurCover(), cct);
		//drp_down(e.ReqCover(),e.ReqCover);
		getDropdown(e.ReqCover(), rcov);
		//drp_down(e.Compre(),e.Tpltocomp);
		getDropdown(e.Compre(), tpltocomp);
		type(e.vechVal(), VecValue);
		select_CurrentDate(e.Quote());
		//dateSelect(curDate,e.Quote(), e.YearL(), e.MonthL());
		
		try {Thread.sleep(3000);} catch (InterruptedException e1) {	}
		click(e.Save());
		try {Thread.sleep(2000);} catch (InterruptedException e1) {	}
		return new InsurerPageObjects(driver);
	}
	
}
