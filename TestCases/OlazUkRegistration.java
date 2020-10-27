package TestCases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethodsOlay;
import Pages.RegistrationPage;
import Pages.UrlPageUk;

public class OlazUkRegistration extends ProjectSpecificMethodsOlay
{
	@Test(dataProvider="readData")
	public void runOlazUkRegistration(String email,String password,String fname,String lname) 
	{
		new UrlPageUk().putUrlUk().clickJoinButton();
		
		 new RegistrationPage()
		 .enterFirstName(fname).enterLastName(lname).enterEmailReg(email).
		  enterPasswordReg(password)
		  .selectDateOfBirth().clickAgreeButton().clickRegistrationForm();

	}
}
