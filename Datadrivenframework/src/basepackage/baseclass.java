package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass {
public ChromeDriver driver;
@BeforeMethod
public void startdriver()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
}

@AfterMethod
public void close()
{
	driver.quit();
	System.out.println("yatin");
	System.out.println("manaoj");
}


}
