package Util;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class CaptureScreen {
	
	private String scrnPath = "C:\\projectScreenshots\\";
	
	public String getScreen(WebDriver driver, String testName) {
		
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");  
		   LocalDateTime now = LocalDateTime.now();  
		   String str = scrnPath+dtf.format(now)+testName+".png";

	try {
			TakesScreenshot scrnCap = (TakesScreenshot)driver;
			FileUtils.copyFile(scrnCap.getScreenshotAs(OutputType.FILE), new File(str));
		} catch (IOException e) {}
	return str;

	}

}
