package pages;

import org.openqa.selenium.By;

import base.ProjectSpecficationMethod;

public class LoginPage extends ProjectSpecficationMethod{

	public LoginPage enterUsername() {
	
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
     LoginPage lp=new LoginPage();
	return lp;
}
	
	public LoginPage enterPassword() {
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	  
      return this;
	}
	
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	             return new WelcomePage();
	}
}
