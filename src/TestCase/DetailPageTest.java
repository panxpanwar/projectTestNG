package TestCase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.Base;
import Pages.DetailPage;

public class DetailPageTest extends Base {
	
	@Test(priority=1)
	public void detailPageTest() {
		DetailPage detailPage=new DetailPage();
		
		detailPage.todaysBirth();
			
		myReport.getTest("Detailed Page").log(Status.PASS, "Step Pass").addScreenCaptureFromPath(scn.getScreen(driver, "DPTest"));
		myReport.test.log(Status.FAIL, "Step Failed");
		myReport.extent.flush();
	}

}
