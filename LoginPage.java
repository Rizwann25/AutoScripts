package com.atmecs.demoblaze.pages;

import java.util.Properties;


import com.atmecs.demoblaze.constants.Constants;
import com.atmecs.demoblaze.helpers.ElementHelpers;
import com.atmecs.demoblaze.testsuit.Base;
import com.atmecs.demoblaze.utils.PropertyReader;

public class LoginPage extends Base {
Properties Loc_path;
Properties Data_path;
public void LoginSets()
{
Loc_path= PropertyReader.readProperties(Constants.Locator_file);
Data_path= PropertyReader.readProperties(Constants.TestData_file);

ElementHelpers.clickElement(driver, Loc_path.getProperty("Login") );

ElementHelpers.SendkeysAction(driver, Loc_path.getProperty("LoginUsername"), Data_path.getProperty("LoginUsername"));
ElementHelpers.SendkeysAction(driver, Loc_path.getProperty("Loginpassword"), Data_path.getProperty("LoginPassword"));

ElementHelpers.clickElement(driver, Loc_path.getProperty("LoginButton"));

}

}