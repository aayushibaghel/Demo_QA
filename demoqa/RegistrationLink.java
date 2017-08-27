package demoqa;

import org.testng.annotations.Test;

import registration.ClickOnRegistration;




public class RegistrationLink {
	
	@Test
	public void Register()
	{
		ClickOnRegistration click= new ClickOnRegistration();
		click.ClickRegistration();
		
	}
	
	
	
	
	
	
	

}
