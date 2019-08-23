package com.test;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	// public static WebDriver driver;

	WebDriver driver;
	Logger logg = LogManager.getLogger(LoginTest.class);

	@Test

	public void f2() throws InterruptedException {

		System.out.println("2 is dependent on car");

		System.setProperty("webdriver.chrome.driver", "C:\\Programs\\ChromeDriver\\76\\chromedriver.exe");
		driver = new ChromeDriver();
		// launch the url
		
		//https://www.seleniumeasy.com/test/basic-first-form-demo.html
		driver.get("http://newtours.demoaut.com/");

		logg.info("launching broser");

		// define the implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Enter User name

		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();
	}

	@Test
	public void f3() throws InterruptedException {
		System.out.println("33 is independent");
	}

	@Test
	public void f4() throws InterruptedException {
		System.out.println("3 is independent");
		  logg.info("**************************************sign in clicked**********************"); 
		  //logg.ALL("***************************************sign in clicked 1**********************"); 
		  logg.debug("*************************************sign in clicked 2**********************" ); 
		  logg.warn("**************************************sign in clicked 3**********************");
		  logg.fatal("*************************************sign in clicked 4**********************" ); 
		  logg.info("**************************************sign in clicked 5**********************");
		Thread.sleep(3000);
		driver.close();
	}
}
