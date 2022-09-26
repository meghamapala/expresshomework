package expresstest;

import org.junit.Test;

import utility.AddToBag;
import utility.CheckOut;
import utility.HomePage;
import utility.MenPage;
import utility.SweatersPage;
import utility.VNeckPage;
import utility.ViewBagPage;

public class SmokeTest extends BaseTest{
	
	HomePage homePage;
	MenPage mp;
	SweatersPage msp;
	VNeckPage vnp;
	AddToBag atb;
	ViewBagPage vbp;
	CheckOut co;

	
	@Test
	public void testHome() {
		homePage = new HomePage(driver);
		homePage.clickOnCancel();
		mp=homePage.clickOnMenMenu();
		mp.clickMenSweaters();
		msp=mp.clickMenSweaters();
		vnp=msp.clickMenSweaters();
		vnp.clickNeckSweater();
		atb=vnp.clickNeckSweater();
		atb.clickBagBtn();
		vbp=atb.clickBagBtn();
		vbp.viewBag();
		co=vbp.viewBag();
	
		
	}
}
