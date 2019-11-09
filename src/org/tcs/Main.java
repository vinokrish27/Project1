package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main extends UtilityClass{
	public static void main(String[] args) {
		launch();
		url("https://www.facebook.com/");
		crntUrl();
		PojoCls pc=new PojoCls();
		fill(pc.getName(),"vinokrish@2710");
		fill(pc.getPw(),"12345");
		title();
		dropDown(pc.getD(),10);
		btnclick(pc.getBtn());
	}

}
