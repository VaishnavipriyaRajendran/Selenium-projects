package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;

import Base.ProjectSpecificMethodsOlay;

public class UrlPageSpanish extends ProjectSpecificMethodsOlay
{
public ClickJoin putUrlPageSpanish() 
{
	driver.get("https://www.olay.es/es-es");
	Reporter.log("***********************************************");
	Reporter.log("Website open for Spanish");
	Reporter.log("***********************************************");
	 try { 
		  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click(); 
	  Thread.sleep(100);
	  driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click(); 
	  } catch
	  (Exception e) { e.printStackTrace(); }

	return new ClickJoin();

}
}
