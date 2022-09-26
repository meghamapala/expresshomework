package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage {
	
	WebDriver driver;
	
	@FindBy(xpath="a[aria-label='MENS SWEATERS']")
	WebElement menSweaterOption;
	
	public MenPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public SweatersPage clickMenSweaters() {
		Shared.click(menSweaterOption);
		return new SweatersPage(driver);
	}
	}
