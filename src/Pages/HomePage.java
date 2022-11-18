package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Base;

public class HomePage extends Base{

	public void homePageTest() {
		String crt = driver.findElement(By.xpath("//div[@class='maincounter-number']")).getText();			
		System.out.println("Home Page Data........"+crt);

	}


}
