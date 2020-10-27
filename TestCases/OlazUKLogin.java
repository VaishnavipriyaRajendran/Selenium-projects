package TestCases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethodsOlay;

import Pages.UrlPageGermany;
import Pages.UrlPageSpanish;
import Pages.UrlPageUk;

public class OlazUKLogin extends ProjectSpecificMethodsOlay
{
	@Test(dataProvider="readData")
	public void ruOlazUkLogin(String email,String password) 
	{
		
	
		new UrlPageUk().putUrlUk().clickJoinButton().enterEmail(email).enterPassword(password).clickLogin().verifyLoginPageUK();
	}
}
