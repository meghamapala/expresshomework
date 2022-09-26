package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="button[aria-label='Focus Close Modal']")
	WebElement crossbutton;
	
	@FindBy(xpath="a[href='/mens-clothing']")
	WebElement menmenu;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCancel() {
		Shared.click(crossbutton);
	}
	
	public MenPage clickOnMenMenu() {
		Shared.click(menmenu);
		return new MenPage(driver);
	}

}
