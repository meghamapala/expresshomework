package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewBagPage {
	
	 WebDriver driver;
		
		@FindBy(xpath="//button[@id='continue-to-checkout']")
		WebElement checkOutOption;
		
		public ViewBagPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public CheckOut viewBag() {
			Shared.click(checkOutOption);
			return new CheckOut();
		}

}
