package Loginpage;

import org.openqa.selenium.chrome.ChromeDriver;

public class loginfunctions {

ChromeDriver driver;
	  
	public loginfunctions(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public void enterusername(String data)
	{
	driver.findElementById("email").sendKeys(data);
	}
	public void password(String pwd)
	{
		driver.findElementById("pass").sendKeys(pwd);
	}
}
