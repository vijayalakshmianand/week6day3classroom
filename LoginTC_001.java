package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecficationMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class LoginTC_001 extends ProjectSpecficationMethod{
	
	
		@Test
		public void runLogin() {
			LoginPage lp = new LoginPage();
			lp.enterUsername()
			.enterPassword()
			.clickLoginButton()
			.verifyLoginPage()
			.clickCrmsfaLink();
			
			
					
		}
		
		
	}


