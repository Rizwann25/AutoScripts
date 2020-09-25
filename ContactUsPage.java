package com.atmecs.demoblaze.pages;

import org.openqa.selenium.WebDriver;


import com.atmecs.demoblaze.helpers.ElementHelpers;
import com.atmecs.demoblaze.testsuit.Base;

import bsh.org.objectweb.asm.Constants;

//import bsh.org.objectweb.asm.Constants;




public class ContactUsPage extends Base {
	WebDriver driver;
	
	public void contactFunctionality() {
		ElementHelpers elementhelper = new ElementHelpers();
		
		elementhelper.explicitWait(driver,Constants.,"contact_page");
		
		//Enter Username
		elementhelper.sendKeys(driver,Constants.PAGE_FILE,Constants.CONFIG_FILE, "contact_email");
		
		//Enter Password
		elementhelper.sendKeys(driver,Constants.PAGE_FILE,Constants.CONFIG_FILE, "contact_name");
		
		//Enter Message
		elementhelper.sendKeys(driver,Constants.PAGE_FILE,Constants.CONFIG_FILE, "message_text");
		
		//Press Login Button
		elementhelper.clickElement(driver,Constants.PAGE_FILE,Constants.CONFIG_FILE, "sendmessage_button");
		
		driver.switchTo().alert().accept();
		
	}

}
