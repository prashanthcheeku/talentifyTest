package Functional_Testing;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Utilities.Datadriven;

public class Login_Design 
{
	//locate element using xpath by testng annotation @Findby
@FindBy(xpath="//input[@name='email']")
WebElement un;
@FindBy(xpath="//input[@name='password']")
WebElement pwd;
@FindBy(xpath="//button[@type='submit']")
WebElement login;
//creating constructor
public Login_Design(WebDriver d)
{
	//static method to create object in another class
	PageFactory.initElements(d,this);
}
public void login() throws IOException, InterruptedException
{
	//creating object of datadriven class from common utilities package
	Datadriven d=new Datadriven();
	//creating a string to store the excel values
	String un1=d.get("sheet2",1,0);
	String pwd1=d.get("sheet2",1,1);
	//sending a values from excel sheet in the form of string
	un.sendKeys(un1);
	Thread.sleep(1000);
	pwd.sendKeys(pwd1);
	Thread.sleep(1000);
    //click on login button
	login.click();
	Thread.sleep(2000);

}
}
