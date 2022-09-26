package expresstest;

import java.io.IOException;
import java.util.Properties;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Shared;


public class BaseTest {
	
	public WebDriver driver;
    public Properties prop;
	
	@BeforeClass
	public void configure() throws IOException {
		
		prop=Shared.readProp(System.getProperty("user.dir")+"/Users/meghamapalagama/"
				+ "eclipse-workspace/expresshomework/chromedriver ");
		}

	@Before
	public void startBrowser() {
		
		String b = prop.getProperty("browser");
		if(b.equals("chrome"))
		{  
			System.setProperty("webdriver.chrome.driver", "/Users/meghamapalagama/"
					+ "eclipse-workspace/"
				+ "expresshomework/chromedriver");
			driver=new ChromeDriver();
		}else if(b.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("url") ;
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}


