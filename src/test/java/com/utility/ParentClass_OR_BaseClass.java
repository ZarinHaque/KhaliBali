package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class ParentClass_OR_BaseClass {

public static Properties prop; // properties global
public static WebDriver driver; // we have to set WebDriver in global
	

	public ParentClass_OR_BaseClass() { // Constructor created
		prop = new Properties();
		
		
	try {
		//FileInputStream is a class which we created an object for reading the file.
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\java\\com\\configuration\\configuration.properties"); // this is a class by maven
			
		// We created an object of properties also & made it global so all class can use it.
		// for exception we use try & catch
			prop.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	
		public void browserinitialization() {
		// We created a non-static method for initializing our browser & wrote browser name. also used if else if condition for launching browser/initialize
			// jodi 1 ta na pai ar 1 ta pabe tai.
		String browserName = prop.getProperty("browser1");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe" ); 
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TestData_Class.pageload,TimeUnit.SECONDS); // We made it dynamic
			driver.manage().timeouts().implicitlyWait(TestData_Class.implicitWait,TimeUnit.SECONDS);
		
		}
		
		
		else if(browserName.equalsIgnoreCase("safari")) {
			
		}
			
		}
		
		public static void launchURL(String URL) {
			// for launching URL we created another static parameterized method to make it dynamic. 
			// dynamic hole we can use it from anywhere.
		
		
		driver.get(prop.getProperty("url1"));
		
		}
}
