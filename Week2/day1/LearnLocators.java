package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnLocators {

	public static void main(String[] args) {
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.facebook.com");
		
		WebElement username = driver2.findElement(By.id("email"));
		username.sendKeys("testleaf.2023@gmail.com");
		
		WebElement password = driver2.findElement(By.id("pass"));
		password.sendKeys("Tuna@321");
		
		WebElement login = driver2.findElement(By.name("login"));
		login.click();
		
		driver2.findElement(By.linkText("Find your account and log in.")).click();
		String Title=driver2.getTitle();
		System.out.println(Title);
		/*driver2.close();
		
		/*driver2.findElement(By.partialLinkText("Forgotten password")).click();
		String Title=driver2.getTitle();
		System.out.println(Title);*/
		
		/*driver2.navigate();
		username.sendKeys("savithapeacock@gmail.com");
		password.sendKeys("Troyks56");
		login.click();*/
		
		
		/*		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.facebook.com");
		
		WebElement username = driver2.findElement(By.id("email"));
		username.sendKeys("testleaf.2023@gmail.com");
		
		WebElement password = driver2.findElement(By.id("pass"));
		password.sendKeys("Tuna@321");
		
		WebElement login = driver2.findElement(By.name("login"));
		login.click();
		
		driver2.findElement(By.linkText("Find your account and log in.")).click();
		String Title=driver2.getTitle();
		System.out.println(Title);*/
		
	}

}
