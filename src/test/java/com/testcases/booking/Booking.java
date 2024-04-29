package com.testcases.booking;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testcases.getshipboardsaas.Configuration;

public class Booking {
	
	@Test
	public void ValidEntries() {
		Configuration.driver.findElement(By.id("name")).sendKeys(Configuration.faker.name().firstName());
		Configuration.driver.findElement(By.id("email")).sendKeys(Configuration.faker.internet().emailAddress());
		Configuration.driver.findElement(By.id("phone")).sendKeys("03334265371");
		Configuration.driver.findElement(By.id("adults")).sendKeys("1");
		Configuration.driver.findElement(By.id("children")).sendKeys("2");
		Configuration.driver.findElement(By.id("date_from")).sendKeys("06/01/2021");
		Configuration.driver.findElement(By.id("date_to")).sendKeys("10/01/2021");
		Configuration.driver.findElement(By.name("message")).sendKeys(Configuration.faker.lorem().sentence());
		Configuration.driver.findElement(By.xpath("//button")).click();

	}
	
	

}
