package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		// Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("(//div[@class='card'])[1]/button")).click();
		// - Verify that the title of the page is ‘dash board’
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		driver.navigate().back();
		// - Check if the button with the text ‘Confirm if the button is disabled’ is
		// disabled.
		WebElement buttonId = driver.findElement(By.xpath("(//div[@class='card'])[2]//button"));
		boolean enabled = buttonId.isEnabled();
		System.out.println("button is " + enabled);
		driver.navigate().back();
		// - Find and print the position of the button with the text ‘Submit.’
		WebElement textalign = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		Point position = textalign.getLocation();
		System.out.println("position of the button is " + position);
		// - Find and print the background color of the button with the text ‘Find the
		// Save button color.’
		WebElement bgcolor = driver.findElement(By.xpath("(//span[text()='Save'])[1]"));
		System.out.println("the bg color of button is " + bgcolor.getCssValue("color"));

		// - Find and print the height and width of the button with the text ‘Find the
		// height and width of this button.’
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("Size of the button is " + size);

		// - Close the browser window
		driver.close();
	}

}
