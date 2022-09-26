package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToBag {
	
    WebDriver driver;
	
	@FindBy(css="button[aria-label='Select l Size']")
	WebElement selectSizeOption;
	
	@FindBy(xpath="//button[text()='Add to Bag']")
	WebElement clickBagBtn;
	
	@FindBy(xpath="//a[text()='View Bag']")
	WebElement clickViewBagBtn;
	
	public AddToBag(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public ViewBagPage clickBagBtn() {
		selectSizeOption.click();
		clickBagBtn.click();
		Shared.click(clickBagBtn);
		
		return new ViewBagPage(driver);
		
		
		
		
		
		
		
	}

}
