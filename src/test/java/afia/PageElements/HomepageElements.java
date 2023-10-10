package afia.PageElements;

import org.openqa.selenium.By;

public class HomepageElements {
String Quotes="/html/body/div[1]/div/div/div[2]/ul/li[2]";
String createQuotes="//a[contains(text(),'Create New Quote')]";

public By Quote() {
	return By.xpath(Quotes);
}

public By CreateQuote() {
	
	return By.xpath(createQuotes);
}
}
