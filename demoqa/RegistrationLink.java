package demoqa;

import org.testng.annotations.Test;

import registration.ClickOnRegistration;




public class RegistrationLink {
	
	@Test(priority=1)
	public void Register()
	{
		ClickOnRegistration click= new ClickOnRegistration();
		click.ClickRegistration();
		
		
		
	}
//	@Test(priority=2)
//	public void invalidLogin()
//	{
//		
//	}
	
	
	
	
	
	

}
