package TestCases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethodsOlay;
import Pages.RegistrationPage;
import Pages.UrlPageGermany;

public class OlazGermanyRegistration extends ProjectSpecificMethodsOlay
{
	@Test(dataProvider="readData")
public void runOlazGermanyRegistration(String email,String password,String fname,String lname ) 
{
	 new UrlPageGermany().putUrlPageGermany();
	  
	  new RegistrationPage().clickReg().genderclick
	  () .enterFirstName(fname).enterLastName(lname).enterEmailReg(email).enterPasswordReg(password).
	  enterConfirmPasswordReg(password).selectDateOfBirth().countryName().
	  enterStreetAddress() .enterCity().clickAgreeButton().clickRegistrationForm();
	 

}
}
