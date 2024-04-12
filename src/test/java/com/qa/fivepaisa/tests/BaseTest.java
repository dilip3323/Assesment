package com.qa.fivepaisa.tests;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.fivepaisa.pages.BasePage;


public class BaseTest extends BasePage{

	
	

	@BeforeTest
	public void setup() throws IOException {
		
		init_prop();
		init_driver(prop);
	}
	
	@Test
	public void login() {
		
	}
}
