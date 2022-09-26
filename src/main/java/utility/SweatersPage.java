package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SweatersPage {
	
    WebDriver driver;

	
	@FindBy(xpath="//a[text()='Merino Wool-Blend V-Neck Sweater']")
	WebElement vNeckOption;
	
	public SweatersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public VNeckPage clickMenSweaters() {
		Shared.click(vNeckOption);
		return new VNeckPage(driver);
	}

}
