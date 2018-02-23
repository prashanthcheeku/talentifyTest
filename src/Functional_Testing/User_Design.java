package Functional_Testing;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Utilities.Datadriven;

public class User_Design
{
	//locate element using xpath by testng annotation @Findby
	@FindBy(xpath=".//*[@id='users']")
	WebElement user;
	@FindBy(xpath="//button[@id='addUserClick']")
	WebElement add;
	@FindBy(xpath=".//*[@id='name']")
	WebElement name;
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	@FindBy(xpath=".//*[@id='mobile']")
	WebElement mob;
	@FindBy(xpath=".//*[@id='pincode']")
	WebElement pin;
	@FindBy(xpath=".//*[@id='add-user-modal']/div/div/div/div[2]/form/div[5]/div[2]/div/div/div/button")
	WebElement choose;
	@FindBy(xpath=".//*[@id='add-user-modal']/div/div/div/div[2]/form/div[5]/div[2]/div/div/ul/li/a/span[2]/b")
	List<WebElement> list;
	@FindBy(xpath=".//*[@id='add-user-modal']/div/div/div/div[2]/form/div[5]/div[2]/div/div/ul/li[1]/div/input")
	WebElement search;
	@FindBy(xpath=".//*[@id='address2']")
	WebElement address2;
	@FindBy(xpath=".//*[@id='address1']")
	WebElement address1;
	@FindBy(xpath=".//*[@id='create_user']")
	WebElement add1;
	@FindBy(xpath=".//*[@id='add-user-modal']/div/div/div/div[2]/form/div[5]/div[2]/div/div/ul/li[3]/a/span[2]/b")
	WebElement boi;
	@FindBy(xpath="//button[@class='confirm']")
	WebElement popup;
	@FindBy(xpath="//input[@type='search']")
	WebElement search1;
	
	//creating xpath to locate element using testng annotation @Findby
	public User_Design(WebDriver d)
	{
		//static method to create object in another class
		PageFactory.initElements(d,this);
	}
	public void user(WebDriver w) throws IOException, InterruptedException
	{
		//clicking on user tab
		user.click();
		Thread.sleep(1000);
		//clicking on add user
		add.click();
		Thread.sleep(1000);
		//creating object of datadriven class from common utilities package
		Datadriven d=new Datadriven();
		//creating a string to store the excel values
		String name1=d.get("sheet1",1,0);
		String email1=d.get("sheet1",1,1);
		String mob1=d.get("sheet1",1,2);
		String pin1=d.get("sheet1",1,3);
		String add01=d.get("sheet1",1,4);
		String add02=d.get("sheet1",1,5);
		
		//sending a values from excel sheet in the form of string
		name.sendKeys(name1);
		email.sendKeys(email1);
		mob.sendKeys(mob1);
		pin.sendKeys(pin1);
		address1.sendKeys(add01);
		address2.sendKeys(add02);
		
		//clicking to choose a group
		choose.click();
		search.sendKeys("boi");
		//for each loop to select 'BOI Demo Course'
		for(WebElement e:list)
		{
			//getting text of choose dropdown and comparing with BOI 'Demo Course'
			if(e.getText().equalsIgnoreCase("BOI Demo Course"));
			{
				//if it is same as text then click
				e.click();
				break;
			}
	
		}
		Thread.sleep(2000);
		//clicking to choose a group
		choose.click();
		Thread.sleep(1000);
		//clicking on add user button
		add1.click();
		Thread.sleep(2000);
		//clicking on confirmation page
		popup.click();
		Thread.sleep(1000);
		//searching for pra whether it is added into user list or not
		search1.sendKeys("pra");
		
		
		
	}
}
