package com.testcases.getshipboardsaas;

import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Configuration {
	
	public static WebDriver driver;
	public static WebDriverManager browser;
	public static String baseurl = "https://meetahsan.com/automationpractice/booking/index.php";
	public static Faker faker = new Faker(new Locale("en-PAK"));
	
@Test	
	public void Browser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	

}
