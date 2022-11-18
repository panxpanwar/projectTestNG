package Base;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Util.CaptureScreen;
import Util.MyReport;


public class Base {
	
	public static WebDriver driver;
	private String driverPath =  System.getProperty("user.dir")+"/src/WebDriver/chromedriver.exe"; 	
	private String url = "https://www.worldometers.info/world-population/"; //"https://www.worldometers.info/world-population/";

	public static MyReport myReport;
	public static CaptureScreen scn;
	
	@BeforeMethod
	public void  openBrowser() throws InterruptedException {
			if (driver==null) {
			System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();	}	
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		driver=null;
	}
	
	@BeforeTest
	public void setUp() {
		myReport=new MyReport();
		scn = new CaptureScreen();
	}

}
