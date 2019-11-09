package org.tcs;

import javax.servlet.http.WebConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	static WebDriver driver;
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "E:\\VinoProj\\Project\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	public static void title() {
		String s= driver.getTitle();
		System.out.println(s);
	}
		public static void url(String s) {
		driver.get(s);		
	}
	public static void crntUrl() {
		String s=driver.getCurrentUrl();
		System.out.println(s);
		}
	public static void fill(WebElement e,String s) {
		e.sendKeys(s);
	}
	public static void dropDown(WebElement w,int i) {
		Select s= new Select(w);
		s.selectByIndex(i);
	}
	public static void btnclick(WebElement w) {
		w.click();
	}
	
}
