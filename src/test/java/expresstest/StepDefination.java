package expresstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefination {
	
	WebDriver dr;
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		dr= new ChromeDriver();
	}

	@Given("^navigate to url$")
	public void navigate_to_url() throws Throwable {
		dr.get("https://www.express.com/");
	}

	@When("^user able to go to Home Page$")
	public void user_able_to_go_to_Home_Page() throws Throwable {
	}

	@When("^Home Page open with pop up box and user can close pop up box$")
	public void home_Page_open_with_pop_up_box_and_user_can_close_pop_up_box() throws Throwable {
	}

	@When("^user can click on Mens Page$")
	public void user_can_click_on_Mens_Page() throws Throwable {
	}

	@When("^from Mens Page user can click on Sweaters$")
	public void from_Mens_Page_user_can_click_on_Sweaters() throws Throwable {
	}

	@When("^user can use Sweaters Page$")
	public void user_can_use_Sweaters_Page() throws Throwable {
	}

	@When("^Sweaters Page open and click on VNeck$")
	public void sweaters_Page_open_and_click_on_VNeck() throws Throwable {
	}

	@When("^user able to go to VNeck Page$")
	public void user_able_to_go_to_VNeck_Page() throws Throwable {
	}

	@When("^VNeck page is open can select size$")
	public void vneck_page_is_open_can_select_size() throws Throwable {
	}

	@When("^user can click and select Add To Bag Button$")
	public void user_can_click_and_select_Add_To_Bag_Button() throws Throwable {
	   }

	@When("^user can see View Bag box appear$")
	public void user_can_see_View_Bag_box_appear() throws Throwable {
	}

	@When("^user can click View Bag$")
	public void user_can_click_View_Bag() throws Throwable {
	}

	@When("^user able to see Bag Page is open$")
	public void user_able_to_see_Bag_Page_is_open() throws Throwable {
	   }

	@When("^user able to click checkout$")
	public void user_able_to_click_checkout() throws Throwable {
	   }
}
