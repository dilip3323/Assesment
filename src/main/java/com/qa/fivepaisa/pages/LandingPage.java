package com.qa.fivepaisa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage extends BasePage {
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	By modalFrame = By.id("nv_leadform_content-iframe_4181");
	By btnClose = By.id("nv_js-leadform-close-button_4181");
	By btnOpenDemat = By.xpath("//a[text()='Open Demat Account'][@class='search--btn btn--invr menu--login']");
	By textMobileNo	= By.id("mobileNumber");
	By btnOpenDematAccount = By.xpath("//a[text()='Open Demat Account'][@class='search--btn btn--invr menu--login']");
	By btnProceed = By.id("btnGenerateOTP");
	By txtPin= By.id("dvPin1");
	By btnSubmit = By.id("btnPINSubmit");
	By btnNoThanks =By.id("btnPINlinkingLimitNo");
	
	
	
	
	
	
	
	
	
	
	
	

	public void exitPopUp() {
		
		
		if(driver.findElement(btnClose).isDisplayed()) {
		driver.switchTo().frame("nv_leadform_content-iframe_4181");
		driver.findElement(btnClose).click();
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		hmap.put("Apple",1);
		hmap.put("Orranges",4);
		hmap.put("Grapes",5);
		
		Iterator<Entry<String, Integer>> itpair = hmap.entrySet().iterator();
		while(itpair.hasNext()) {
			Entry<String,Integer> entry = itpair.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
		}
		
		hmap.forEach((k,v)->System.out.println("Keys is"+k+v ));
		
		}
		
		Set<String> str = driver.getWindowHandles();
		
		String parentWindowHandle = driver.getWindowHandle();
		
		Set<String> allWindowHandles = driver.getWindowHandles(); 
		
		String str1 = "my name is Dilip";
		char[] chararr = str1.toCharArray();
		int[] intarr ;
		List<Character> list = new ArrayList<Character>();
		
		List<int[]> asList = Arrays.asList(intarr);
				for(int i=chararr.length-1; i>0;i--){


		list.forEach( k->System.out.println());
		
		public static void switchToParticularWindow(WebDriver driver, int index) throws InterruptedException {
			
			 String s = "asdasdasda";
			    char[] chars = s.toCharArray();
			    String[] ss ;
			    int[] intt;
			    List<String> sst = Arrays.asList(ss);
			    List<String> sstt = new ArrayList<String>(Arrays.asList(ss));
			   
			    
			    List<int[]> lint = new ArrayList<int[]>();
			    
			   
			    
			    int[] n;
			 List<char[]> asList = Arrays.asList(chars); // because this DOES compile.
			
	        
	        driver.switchTo().window(tabs.get(2));
	        Thread.sleep(2000);
	        logger.info("Switched to new tab");
	    }
		


	public void OpenDemat() {
		
		driver.findElement(btnOpenDemat).click();
		driver.findElement(textMobileNo).sendKeys(prop.getProperty("MobileNo"));
		driver.findElement(btnProceed).click();
		driver.findElement(txtPin).sendKeys(prop.getProperty("PIN"));
		driver.findElement(btnSubmit).click();
		driver.findElement(btnNoThanks).click();
		
	}
	
	
	

	
	
	
	
	}

	private Object startswith(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
