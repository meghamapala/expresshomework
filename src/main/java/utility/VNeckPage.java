package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VNeckPage  {
	
	WebDriver driver;
	
	@FindBy(xpath="")
	WebElement addToBagOption;
	
	public VNeckPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public AddToBag clickNeckSweater() {
		Shared.click(addToBagOption);
		return new AddToBag(driver);
	}

}
