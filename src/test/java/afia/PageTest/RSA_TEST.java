package afia.PageTest;

import org.testng.annotations.Test;

import afia.DataProviders.DataProviderForRSAManual;
import afia.PageObjects.RSAPageObject;
import afia.Utilities.ReusableMethods;

public class RSA_TEST {
	RSAPageObject p=new RSAPageObject(ReusableMethods.driver);
	@Test(dataProviderClass=DataProviderForRSAManual.class,dataProvider="validCredentialsProvider")
	public void RSA_Insurance_Generation(String Type,String Cap,String dis,String BodyType,String Make,String Model,String YOR,String DESC,String DATE,String NCD
			,String Main_DRiv,String FullName,String Nationality,String DOB,String Gender) {
		p.RSA_INS(Type,Cap, dis,BodyType,Make,Model,YOR,DESC,DATE,NCD,Main_DRiv,FullName,Nationality,DOB,Gender);
		
		
	}

}
