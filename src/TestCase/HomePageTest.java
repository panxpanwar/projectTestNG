package TestCase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.Base;
import Pages.HomePage;
import Util.CaptureScreen;
import Util.MyReport;


public class HomePageTest extends Base{
	private static HomePage homePage;

	

	
	@Test
	public void homePageTest() {
	
		homePage=new HomePage();
		homePage.homePageTest();
		
		
		myReport.getTest("firstTest").log(Status.PASS, "Step Pass").addScreenCaptureFromPath(scn.getScreen(driver, "firstTest"));
		myReport.test.log(Status.FAIL, "Step Failed");
		myReport.test.log(Status.INFO, "Step Info");
		myReport.test.log(Status.SKIP, "Step SKIP");
		myReport.test.log(Status.WARNING, "Step Warning");
		myReport.getTest("secondTest").log(Status.PASS, "Step Pass").addScreenCaptureFromPath(scn.getScreen(driver, "secondTest"));
	}
	
	@Test
	public void hpTestTwo() {
	    homePage.homePageTest();
		
		
		myReport.getTest("thTest").log(Status.PASS, "Step Pass").addScreenCaptureFromPath(scn.getScreen(driver, "firstTest"));
		myReport.test.log(Status.FAIL, "Step Failed");
		myReport.test.log(Status.INFO, "Step Info");
		myReport.test.log(Status.SKIP, "Step SKIP");
		myReport.test.log(Status.WARNING, "Step Warning");
		myReport.getTest("frthTest").log(Status.PASS, "Step Pass").addScreenCaptureFromPath(scn.getScreen(driver, "secondTest"));

		
		myReport.extent.flush();
		
	}
	
	

}
