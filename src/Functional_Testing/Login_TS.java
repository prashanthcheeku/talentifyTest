package Functional_Testing;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Common_Utilities.Browser;

public class Login_TS 
{
WebDriver d;
@Test
public void get() throws IOException, InterruptedException
{
	//calling browser class from common utlities package to run chrome browser
	d=Browser.browser("chrome");
	//creating object of login_design class
	Login_Design l=new Login_Design(d);
	//calling login method
	l.login();
}
}
