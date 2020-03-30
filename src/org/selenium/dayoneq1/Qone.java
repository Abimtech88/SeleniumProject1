package org.selenium.dayoneq1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Qone {
public static void main(String[] args) {
	
	//Configure browser
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\DayOne\\Driver\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	//Launch Browser
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.get("http://www.greenstechnologys.com/");
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		//Title
	String t = driver.getTitle();
	System.out.println(t);
	//Current Url
	String url=driver.getCurrentUrl();
	System.out.println(url);
	//Quit
	driver.quit();
	
}
}
