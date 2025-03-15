package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("http://leaftaps.com/opentaps/control/main");
		driver2.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");
		driver2.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver2.findElement(By.xpath("//input[contains@class,’submit’]")).click();
	}

}
