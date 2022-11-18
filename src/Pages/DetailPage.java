package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Base;

public class DetailPage extends Base {

	public void todaysBirth() {
		String crt = driver.findElement(By.xpath("//span[@class='rts-counter'][@rel='births_today']")).getText();			
		System.out.println("Detailed Page...Today's Birth........"+crt);


	}
}
