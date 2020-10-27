package Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Pages.ReadData1;

public class ProjectSpecificMethodsOlay  
{
public static  WebDriver driver;
public static String workBookName;
	@BeforeClass
	
	@Parameters({"browser","filename"})
	public WebDriver startApp(String browser,String filename) throws Exception
	{
	if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			System.setProperty("webdriver.gecko.driver", "./Drivers/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver","./Drivers/Drivers/chromedriver.exe");
			//create chrome instance
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}
		//Check if parameter passed as 'Edge'
				else if(browser.equalsIgnoreCase("Edge"))
				{
					//set path to Edge.exe
					System.setProperty("webdriver.edge.driver","./Drivers/MicrosoftWebDriver.exe");
					//create Edge instance
					driver = new EdgeDriver();
					driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
	workBookName=filename;
	return driver;
	}
	
	
	


	@DataProvider(name="readData")
	
	public String[][] sendData() throws IOException 
	{
		return ReadData1.readData(workBookName);
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
