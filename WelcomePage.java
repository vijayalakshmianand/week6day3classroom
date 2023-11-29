package pages;

import org.openqa.selenium.By;

import base.ProjectSpecficationMethod;

public class WelcomePage extends ProjectSpecficationMethod{
	
	
	
	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
     return new MyHomePage();
		
	}

	public LoginPage clickLogoutButton() {
		
		System.out.println("Logout successfull");
		return new LoginPage();
	}
	public WelcomePage verifyLoginPage() {
		System.out.println("Login Successfull");
	return this;
	}
}
