package com.thinkweb.ThinkWeb;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		
//		System.setProperty("webDriver.gecko.driver" , "D:\\Think my testcase xstudio\\ThinkWeb\\geckodriver-v0.21.0-win64\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://cs.mps-think.com");
		driver.quit();

	}

}


