package com.testcases.login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testcases.getshipboardsaas.Configuration;

public class Login {
	
	@Test
	public void validlogin() {
		Configuration.driver.findElement(By.xpath("//form/div[1]/input")).sendKeys("first@example.com");
		Configuration.driver.findElement(By.xpath("//form/div[2]/input")).sendKeys("secret");
		Configuration.driver.findElement(By.xpath("//button")).click();
	}
	
	public void L_01() {
		
	}

}


