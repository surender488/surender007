package org.Utillity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static  WebDriver ChromeBrowserlanch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
		
	}
	public static void urllanuch(String url) {
		driver.get(url);
	}
	
public static void maximize() {
	driver.manage().window().maximize();
	}

public static void implicitwait(long secs) {
	driver.manage().timeouts().implicitlyWait(secs,TimeUnit.SECONDS );
}

public static void click(WebElement e) {
	e.click();
	}

public static void  sendkey(WebElement e,String Value) {
	e.sendKeys(Value);
	}

public static void clear(WebElement e) {
	e.clear();
}
public static void gettext (WebElement e) {
	e.getText();
}

public static void getattribute(WebElement e,String value) { 
e.getAttribute(value);
}













}

