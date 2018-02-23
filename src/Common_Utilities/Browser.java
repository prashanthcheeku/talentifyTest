package Common_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constant.URL;

public class Browser
{
	static WebDriver d;
	public static WebDriver browser(String browse)
	{
		if(browse.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","G:\\Prashanth\\Softwares\\gechodriver\\chromedriver.exe");
			d=new ChromeDriver();
		}
		d.get(URL.url);
		return d;
	}
}
