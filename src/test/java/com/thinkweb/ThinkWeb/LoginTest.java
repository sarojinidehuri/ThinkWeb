package com.thinkweb.ThinkWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriver driver;
//		System.setProperty("webdriver.gecko.driver" , "D:\\Think my testcase xstudio\\geckodriver-v0.21.0-win64\\geckodriver.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette",true);
//		driver= new FirefoxDriver(capabilities);
		
		driver= new FirefoxDriver();
		
		driver.get("http://cs.mps-think.com");
		
		//Login
		WebElement un = driver.findElement(By.id("exampleInputEmail1"));
		un.sendKeys("demo@mpsthink.com");
		WebElement pw = driver.findElement(By.id("exampleInputPassword1"));
		pw.sendKeys("thinktest");
		driver.findElement(By.id("loginform"));
		
		driver.quit();

	}

}


