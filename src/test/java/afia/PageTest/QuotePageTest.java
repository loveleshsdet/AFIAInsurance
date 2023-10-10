package afia.PageTest;



import org.testng.annotations.Test;
import afia.DataProviders.DataProviderForCustomerDetails;
import afia.DataProviders.DataProviderForVechileDetails;
import afia.PageObjects.InsurerPageObjects;
//import afia.DataProviders.DataProviderForQuotePage1;
import afia.PageObjects.QuotePageObjects;
import afia.Utilities.ReusableMethods;

public class QuotePageTest {
	QuotePageObjects  t=new QuotePageObjects(ReusableMethods.driver);
	
	@Test(dataProviderClass=DataProviderForCustomerDetails.class,dataProvider="validCredentialsProvider")
	public void CustomerDetails(String first,String last,String email,String no,String Title,String date,String Nat,String UAED,String bckHome,String index,
			String addr,String Zip,String Coun,String Custype,String TradeLic) {
		
		t.CustomerDetails(first, last, email, no,Title,date,Nat,UAED,bckHome,addr,Zip,Coun,index,Custype,TradeLic);
		
		
	}
	
	//@Parameters({"Yearr","Capa","CurrentCover","Value"})
	@Test(dataProviderClass=DataProviderForVechileDetails.class,dataProvider="validCredentialsProvider")
	public void VehicleDetails(String make,String model,String yom,String Yearr,String rtype,String btype,String Capa,String place,String CurrentCover,
			String fin,String cct,String rcov,String tpltocomp,String VecValue,String curDate,String Model_Spec,String New_Pre,String Promo) {
		InsurerPageObjects ob=t.VeichleDetails(make,model,yom,Yearr,rtype,btype,Capa,place,CurrentCover,fin,cct,rcov,tpltocomp,VecValue,curDate,Model_Spec,New_Pre,Promo);
	}

}
