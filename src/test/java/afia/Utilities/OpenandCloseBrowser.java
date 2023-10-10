package afia.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class OpenandCloseBrowser {
	
	public  static WebDriver driver;
	
	
	@Parameters({"browser","baseURL"})
	@BeforeClass
	public void openBrowser(String browser,String baseURL){
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Resource\\geckodriver.exe");
		    driver=new FirefoxDriver();	
		}
		else if(browser.equalsIgnoreCase("chrome")){
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Resource\\chromedriver.exe");
			 driver=new ChromeDriver();	
			}
		else if(browser.equalsIgnoreCase("ie")){
			   System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\driver\\IEDriverServer.exe");
			   DesiredCapabilities caps=DesiredCapabilities.internetExplorer();
			   caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			   caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);			
			
			   caps.setCapability("InterruptedException", false);
			  driver=new InternetExplorerDriver();		
			}
		
		else if(browser.equalsIgnoreCase("safari")) {
			
			driver=new SafariDriver();   
		}
		
		else
		{
			
			driver=new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	public static WebDriver getInstance(){
		return driver;
	}
	
	@AfterClass
	public void closeBrowser(){
		//	driver.quit();		
	}

}
