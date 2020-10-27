package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IInvokedMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

import Base.ProjectSpecificMethodsOlay;

public class UrlPageGermany extends ProjectSpecificMethodsOlay
{
public ClickJoin putUrlPageGermany() 
{
driver.get("https://www.olaz.de/de-de");
Reporter.log("***********************************************");
Reporter.log("Website open for Germany");
Reporter.log("***********************************************");

  try { 
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
  driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click(); 
  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
  driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click(); 
 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
  driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click(); 
  } catch
  (Exception e) { e.printStackTrace(); }
 
return new ClickJoin();
}
	 
}
