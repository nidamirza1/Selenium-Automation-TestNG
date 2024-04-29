package com.testcases.login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testcases.getshipboardsaas.Configuration;


public class Logout {

	@Test
	public void logout() throws Exception {
	    Thread.sleep(3000);
		Configuration.driver.findElement(By.xpath("//div[@id='app']/div[2]/div/div/nav[3]/a[2]")).click();
	}
}
