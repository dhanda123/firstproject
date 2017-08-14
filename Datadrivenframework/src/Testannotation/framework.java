package Testannotation;

import org.testng.annotations.Test;

import Loginpage.loginfunctions;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.baseclass;
import Loginpage.*;

public class framework extends baseclass {
	@Test(dataProvider="excel")
	public void login(String username,String pwd) throws IOException
	{
		loginfunctions L1=new loginfunctions(driver);
		L1.enterusername(username);
		L1.password(pwd);
	}
	
	/*@DataProvider(name="Static")
	public Object[][] datagenerator()
	{
		Object[][] ret={{"username1","pwd1"},{"username2","pwd2"},{"username3","pwd3"}};
		return ret;
		
	} */
	
	@DataProvider(name="excel")
	public Object[][] datagenerator1() throws IOException
	{
		XSSFWorkbook wk=new XSSFWorkbook("C:\\Users\\Sudhanshu\\Desktop\\datadriver.xlsx");
		XSSFSheet s1=wk.getSheet("Sheet1");
		int r=s1.getPhysicalNumberOfRows();	
		Object [][] ret=new Object[r][2];
		for(int i=0;i<r;i++)
		{
			XSSFRow r1=s1.getRow(i);
			XSSFCell username1=r1.getCell(0);
			XSSFCell pwd1=r1.getCell(1);
			ret[i][0]=username1.getStringCellValue();
			ret[i][1]=pwd1.getStringCellValue();
		}
		return ret;	
		}
}