package org.Utillity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageModel extends BaseClass {
	
	public PageModel() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="email")
	private WebElement txtusername;
	
	@FindBy(id="pass")
	private WebElement txtpassword;
	
	@FindBy(name="login")
	private WebElement bntlogin;
	

	

	
	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBntlogin() {
		return bntlogin;
	}
	

	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement btnclick;

	public WebElement getBtnclick() {
		return btnclick;
	}
	
	@FindBy(name="q")
	private WebElement searchname;

	public WebElement getSearchname() {
		return searchname;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbtn;

	public WebElement getSearchbtn() {
		return searchbtn;
	} 
	@FindBy(xpath="(//div[@class='_1AtVbE col-12-12'])//div[text()='APPLE iPhone 11 (Black, 128 GB)']")
	private WebElement fristlinkclick;

	public WebElement getFristlinkclick() {
		return fristlinkclick;
	}
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement addtocartBtn;

	public WebElement getAddtocartBtn() {
		return addtocartBtn;
	}
	@FindBy(xpath="//button//span[text()='Place Order']")
	private WebElement placeOrderBtn;

	public WebElement getPlaceOrderBtn() {
		return placeOrderBtn;
	}
	

	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement btncreat;

    public WebElement getBtncreat() {
		return btncreat;
	}
@FindBy(name="firstname")
private WebElement fristname;

@FindBy(name="lastname")
private WebElement lastname;
@FindBy(name="websubmit")
private WebElement singup;


public WebElement getSingup() {
	return singup;
}

public WebElement getFristname() {
	return fristname;
}

public WebElement getLastname() {
	return lastname;
}



@FindBy(xpath="//input[@type='text'])[2]")
	private WebElement frtname;
@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
private WebElement buttonclick;

@FindBy(xpath="//input[@type='text']")
private WebElement search;

@FindBy(xpath="//button[@type='submit']")
private WebElement searchClick;

@FindBy(xpath="//div[@class='_4rR01T']")
private WebElement laptopName;





public WebElement getSearch() {
	return search;
}

public void setSearch(WebElement search) {
	this.search = search;
}

public WebElement getLaptopName() {
	return laptopName;
}

public void setLaptopName(WebElement laptopName) {
	this.laptopName = laptopName;
}

public void setSearchbtn(WebElement searchbtn) {
	this.searchbtn = searchbtn;
}

public WebElement getButtonclick() {
	return buttonclick;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
