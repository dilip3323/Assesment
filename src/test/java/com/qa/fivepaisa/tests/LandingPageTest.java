package com.qa.fivepaisa.tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.fivepaisa.pages.LandingPage;

public class LandingPageTest extends BaseTest {
	
	LandingPage landingpage = new LandingPage(driver);
	
	@BeforeTest
	public void setup() throws IOException
	{
			init_prop();
			init_driver(prop);
		}
	
	
	@Test
	public void OpenDematFlow() throws IOException
	{
			landingpage.exitPopUp();
			landingpage.OpenDemat();
		}
}	
		
	


