package Smoke_Testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Common_Utilities.Browser;

public class AUT
{
	WebDriver d;
@Test
public void get()
{
	d=Browser.browser("chrome");
}
}
