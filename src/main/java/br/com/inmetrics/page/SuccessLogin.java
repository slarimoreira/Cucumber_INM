package br.com.inmetrics.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.inmetrics.core.DriverFactory;

public class SuccessLogin {
	
	private WebElement Successfully = DriverFactory.getDriver().findElement(By.className("post-title"));
	
	public String getSuccessfully() {
		return Successfully.getText();
	}
}
