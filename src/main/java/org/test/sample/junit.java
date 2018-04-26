package org.test.sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class junit {
	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\uneab\\sample\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
		
		
}
	
	@Test
	public void test1() {
		System.out.println("test");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("12345asdf");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("765kjh");
		WebElement login=driver.findElement(By.id("u_0_2"));
		login.click();
	}
@After
public  void after() {
	System.out.println("after");
}

@Before
public  void before() {
	System.out.println("before");
}
}
