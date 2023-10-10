package afia.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import afia.PageElements.InsurerElements;
import afia.Utilities.INSURER;
import afia.Utilities.ReusableMethods;

public class InsurerPageObjects extends ReusableMethods {
InsurerElements e=new InsurerElements();
INSURER i=new INSURER();
	public InsurerPageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void Insurers(String Insurer) {
	ScrolltoElement(e.QICCbox());
	//By ele=By.xpath("/html/body/form/div[2]/div/div/ul/label[2]/span");

	try {Thread.sleep(5000);} catch (InterruptedException e1) {	}
	 //waitByClickable(e.QICCbox());
	if(Insurer.equalsIgnoreCase("QIC")) {
	//	click(ele);
		
	}
	else {
		try {Thread.sleep(3000);} catch (InterruptedException e1) {	}
	By loc=i.Method("QIC");
	click(loc);
	try {Thread.sleep(3000);} catch (InterruptedException e1) {	}
	//click(ele);
	waitByClickable(e.RSACbox());
	click(i.Method(Insurer));}
	
}

	

}
