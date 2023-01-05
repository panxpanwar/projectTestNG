package TestCase;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.Base;
import Pages.HomePage;
import Util.CaptureScreen;
import Util.MyReport;


public class HomePageTest extends Base{
	private static HomePage homePage;

	@DataProvider(name = "myDp")
	public Iterator<String> dataFromDP() {
		getExcelBase();
		
		ArrayList<String> myAl = new ArrayList<String>();	
		for (int i=0;i<3;i++) {
		myAl.add(getExcel.getExcelData("Sheet1", i, 1));
		}
		
		Iterator<String> itr = myAl.iterator();
		return itr;
	}
	

	
	@Test (dataProvider = "myDp")
	public void homePageTest(String dpData) {
	
		homePage=new HomePage();
		homePage.homePageTest();
		System.out.println("DP Data..........!!  "+dpData);
       
		myReport.getTest("firstTest").log(Status.PASS, "Step Pass").addScreenCaptureFromPath(scn.getScreen(driver, "firstTest"));
		myReport.test.log(Status.FAIL, "Step Failed");
		myReport.test.log(Status.INFO, "Step Info");
		myReport.test.log(Status.SKIP, "Step SKIP");
		myReport.test.log(Status.WARNING, "Step Warning");
		myReport.getTest("secondTest").log(Status.PASS, "Step Pass").addScreenCaptureFromPath(scn.getScreen(driver, "secondTest"));
	}
	
	
	
	@Test
	@Parameters("myName")
	public void hpTestTwo(String myName) {
	   // homePage.homePageTest();
		System.out.println("Parameter passed...!!  "+ myName );
        			
		myReport.getTest("thTest").log(Status.PASS, "Step Pass").addScreenCaptureFromPath(scn.getScreen(driver, "firstTest"));
		myReport.test.log(Status.FAIL, "Step Failed");
		myReport.test.log(Status.INFO, "Step Info");
		myReport.test.log(Status.SKIP, "Step SKIP");
		myReport.test.log(Status.WARNING, "Step Warning");
		myReport.getTest("frthTest").log(Status.PASS, "Step Pass").addScreenCaptureFromPath(scn.getScreen(driver, "secondTest"));

		
		myReport.extent.flush();
		
	}
	
	

}
