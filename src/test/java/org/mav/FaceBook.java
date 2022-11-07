package org.mav;

import javax.servlet.Registration;

import org.Utillity.BaseClass;
import org.Utillity.PageModel;
import org.junit.BeforeClass;
import org.junit.Test;

public class FaceBook  extends BaseClass {
	
	@BeforeClass
	public static void BeforeClass() {
	ChromeBrowserlanch() ;
	urllanuch("https://www.facebook.com/");
	maximize();
	}
	@Test
	public void test1() throws InterruptedException{
		urllanuch("https://www.flipkart.com/");
		PageModel p =new PageModel();
		click(p.getButtonclick());
		sendkey(p.getSearch(), "laptop");
		click(p.getSearchbtn());
	
		
		}
//	@Test
//	public void test2() {
//		urllanuch("https://www.facebook.com/");
//		PageModel p =new PageModel();
//		click(p.getBtncreat());
//		sendkey(p.getFristname(), "surender");
//		sendkey(p.getLastname(), "m");
//		click(p.getSingup());
//	@Test
//	public void test3() {
//		urllanuch("https://www.facebook.com/");
//		PageModel p=new PageModel();
//		sendkey(p.getFrtname(), "manoj");
//	}
	
	
	
	

}
