package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;

import Base.ProjectSpecificMethodsOlay;

public class VerifyLoginPages extends ProjectSpecificMethodsOlay
{
	public RegistrationPage verifyLoginPageUK() 
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ExpectedResult="WELCOME TO YOUR PROFILE";	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,6500)");
		String incorrectUK1="Incorrect username or password. Please try again.";
		if(driver.findElement(By.xpath("//button[@class='button-link event_profile_logout']")).isDisplayed())
		{
			Reporter.log(driver.findElement(By.xpath("//header[@class='profile-header']")).getText());
		}
		else
		{
			Reporter.log(incorrectUK1);
		}
		return new RegistrationPage();
	}
	
	public RegistrationPage verifyLoginPageSpanish()
	{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		String incorrectSpanish="Incorrect username or password. Please try again.";
		if(driver.findElement(By.xpath("//p[@class='FormErrorstyles__ErrorSentence-sc-1r4gczu-2 bvzjfU']")).getText().equals(incorrectSpanish))
		{
			Reporter.log(incorrectSpanish);
		}
		return new RegistrationPage();
	}
	public RegistrationPage verifyLoginPageGermany()
	{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		 String incorrectGermany1="Die eingegebene Kombination aus Passwort und E-Mail-Adresse ist ungültig. Bitte versuchen Sie es erneut oder klicken Sie auf den Link unten, um ein neues Konto zu erstellen.";
		if(driver.findElement(By.id("phdesktopbody_0_Message")).getText().equals(incorrectGermany1))
		{
			Reporter.log(incorrectGermany1);
		}
		return new RegistrationPage();

}
	
}
