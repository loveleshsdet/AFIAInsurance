package afia.Utilities;

import org.openqa.selenium.By;

import afia.PageElements.InsurerElements;

public class INSURER {
	InsurerElements e=new InsurerElements();
	public static By Insurer;
	
	public By Method(String Insure){
		//String Insure="RSA";
		switch(Insure) {
			case "QIC":
				Insurer=By.xpath(e.QIC_Checkbox);
				return Insurer;
			case "RSA":
				Insurer=By.xpath(e.RSA_Checkbox);
				return Insurer;
			case "TOKIO":
				Insurer=By.xpath(e.TOKIO);
				return Insurer;
			case "AXA":
				Insurer=By.xpath(e.AXA);
				return Insurer;
			
			case "SALAMA":
				Insurer=By.xpath(e.SALAMA);
				return Insurer;
			case "OIC":
				Insurer=By.xpath(e.OIC);
				return Insurer;
				
			case "NOOR":
				Insurer=By.xpath(e.NOOR);
				return Insurer;
	}
		return Insurer;
		
	}
//public static void main(String[] args) {
//	INSURER i=new INSURER();
//	By a= i.Method("RSA");
//	System.out.println(a);
//}


}
