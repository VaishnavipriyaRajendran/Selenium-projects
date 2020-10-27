package TestCases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethodsOlay;

import Pages.UrlPageGermany;
import Pages.UrlPageSpanish;
import Pages.UrlPageUk;

public class OlazGermanyLogin extends ProjectSpecificMethodsOlay
{
	@Test(dataProvider="readData")
	public void runOlazGermanyLogin(String email,String password) 
	{
				 
	new UrlPageGermany().putUrlPageGermany().clickJoinButton().enterEmail(email).enterPassword(password).clickLogin().verifyLoginPageGermany();
	}
}