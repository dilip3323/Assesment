package com.qa.fivepaisa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static WebDriver driver;
	public static Properties prop;

	
	public  void init_driver(Properties prop) {
		
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		} 
		else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	public Properties init_prop() throws IOException {

		String path = "C://Users//dilip//eclipse-workspace//Automate5Paisa-2//src//main//resources//com//qa//fivepaisa//resources//config.properties";
		prop = new Properties();
		FileInputStream ip = new FileInputStream(path);
		prop.load(ip);
		return prop;	
		
	}

}
