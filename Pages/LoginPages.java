package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Base.ProjectSpecificMethodsOlay;

public class LoginPages  extends ProjectSpecificMethodsOlay  
{
	
public LoginPages enterEmail(String email)
{
	Reporter.log("Start Login");
	driver.findElement(By.xpath("(//input[@name='signInEmailAddress'])[2]|//input[@data-key='signInEmailAddress']")).sendKeys(email,
			Keys.TAB,"Newusersvaishu@94");
	Reporter.log(email);
	return this;
}
public LoginPages enterPassword(String password)
{
	driver.findElement(By.xpath("(//input[@name='signInEmailAddress'])[2]|//input[@data-key='signInEmailAddress']")).sendKeys(Keys.TAB,password);
	Reporter.log("Entered password is "+password);
	
	 
	 
	return this;
}
public VerifyLoginPages clickLogin() 
{
	
	driver.findElement(By.xpath("(//button[@type='submit'])[3]|//div[@class='form-container']//button[text()='Log in']|//input[@type='submit']")).click();
		
	Reporter.log("Click Login");
	
	return new VerifyLoginPages();
}


	


}

