package br.com.inmetrics.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.inmetrics.core.DriverFactory;

public class LoginPage {
	
	private WebElement Username = DriverFactory.getDriver().findElement(By.name("username"));
	private WebElement Passaword = DriverFactory.getDriver().findElement(By.name("password"));
	private WebElement ButtonSubmit = DriverFactory.getDriver().findElement(By.id("submit"));
	private WebElement MessageError;
	
	public void setUsername(String valor) {
		Username.sendKeys(valor);
	}
	
	public void setPassaword(String valor) {
		Passaword.sendKeys(valor);
	}
	
	public void setBtnSubmit() {
		ButtonSubmit.click();
	}
	
	public String getMessageError() {
		MessageError = DriverFactory.getDriver().findElement(By.id("error"));
		
		return MessageError.getText();
	}
	
}
