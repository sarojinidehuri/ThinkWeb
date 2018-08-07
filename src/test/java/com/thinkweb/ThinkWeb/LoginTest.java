package com.thinkweb.ThinkWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver" , "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
		driver= new FirefoxDriver();
		
		driver.get("http://cs.mps-think.com");
		driver.quit();

	}

}


