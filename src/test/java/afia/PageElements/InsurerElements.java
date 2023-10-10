package afia.PageElements;

import org.openqa.selenium.By;

public class InsurerElements {
	
	
	//ul[@class='quotationInsTabs']//child::label//child::input[@id='inputQIC']
	//ul[@class='quotationInsTabs']//child::label//child::input[@id='inputRSA']
	
	public String QIC_Checkbox="//ul[@class='quotationInsTabs']//child::sub[contains(text(),'QIC')]";
	///html/body/form/div[2]/div/div/ul/label[1]/span
	//html/body/form/div[2]/div/div/ul/label[1]/span
	
	public String RSA_Checkbox="/html/body/form/div[2]/div/div/ul/label[3]/span";
	
	public String TOKIO="/html/body/form/div[2]/div/div/ul/label[2]/span";
	public String AXA="/html/body/form/div[2]/div/div/ul/label[4]/span";
	public String SALAMA="/html/body/form/div[2]/div/div/ul/label[6]/span";
	public String OIC="/html/body/form/div[2]/div/div/ul/label[7]/span";
	public String NOOR="/html/body/form/div[2]/div/div/ul/label[5]/span";
	
	
	public By QICCbox() {
		return By.xpath(QIC_Checkbox);
	}
	
	public By RSACbox() {
		return By.xpath(RSA_Checkbox);
	}
	

}
