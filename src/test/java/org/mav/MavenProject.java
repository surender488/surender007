package org.mav;

import org.Utillity.BaseClass;
import org.Utillity.PageModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenProject extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeBrowserlanch();
		urllanuch("https://www.flipkart.com/");
		maximize();
		
		PageModel p=new PageModel();
		click(p.getBtnclick());
		sendkey(p.getSearchname(),"APPLE iPhone 11 (Black, 128 GB)" );
		click(p.getSearchbtn());
		Thread.sleep(3000);
		click(p.getFristlinkclick());
		Thread.sleep(3000);
		click(p.getAddtocartBtn());
		Thread.sleep(3000);
		click(p.getPlaceOrderBtn());
				
		
		
		

	}

}
