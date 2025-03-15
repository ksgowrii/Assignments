package Week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnSeleniumBasics {

	public static void main(String[] args) {
		/*
		 * //EdgeDriver driver=new EdgeDriver(); ChromeDriver driver1=new
		 * ChromeDriver(); //driver.get("https://www.google.com/");
		 * driver1.get("http://leaftaps.com/opentaps/control/main");
		 * driver1.manage().window().maximize(); String title =driver1.getTitle();
		 * System.out.println(title);
		 */
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.facebook.com");
		driver2.manage().window().maximize();
		String URL = driver2.getCurrentUrl();
		System.out.println("URL is " +URL);
		String title = driver2.getTitle();
		System.out.println("Title is " +title);
		driver2.close();
	}
}
