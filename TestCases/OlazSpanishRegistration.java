package TestCases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethodsOlay;
import Pages.RegistrationPage;
import Pages.UrlPageSpanish;
import Pages.UrlPageUk;

public class OlazSpanishRegistration extends ProjectSpecificMethodsOlay
{
	@Test(dataProvider="readData")
public void runOlazSpanishRegistration(String email,String password,String fname,String lname) 
{
			new  UrlPageSpanish().putUrlPageSpanish().clickJoinButton();
		
		new RegistrationPage().enterFirstName(fname).enterLastName(lname).enterEmailReg(email).
		  enterPasswordReg(password)
		  .selectDateOfBirth().clickAgreeButton().clickRegistrationForm();
	 
/*}
else if(url1.contains("https://www.olay.es/es-es"))
{
	 new UrlPageSpanish().putUrlPageSpanish().clickJoinButton().enterEmail(email).
	  enterPassword(password).clickLogin().verifyLoginPageSpanish().clickReg().
	  enterFirstName(fname).genderclick()
	 .enterLastName(lname).enterEmailReg(email).enterPasswordReg(password).enterConfirmPasswordReg(password)
	 .selectDateOfBirth().enterPhoneNumber().clickAgreeButton().
	  clickRegistrationForm();*/
}

}
