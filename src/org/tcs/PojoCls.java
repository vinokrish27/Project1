package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoCls extends UtilityClass {
	
	public PojoCls() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement name;
	@FindBy(id="pass")
	private WebElement pw;
	@FindBy(id="loginbutton")
	private WebElement btn;
	@FindBy(id="day")
	private WebElement d;
	public WebElement getName() {
		return name;
	}
	public WebElement getPw() {
		return pw;
	}
	public WebElement getBtn() {
		return btn;
	}
	public WebElement getD() {
		return d;
	}

}
