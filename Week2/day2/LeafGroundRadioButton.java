package Week2.day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

public class LeafGroundRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         FirefoxDriver driver = new FirefoxDriver();
         driver.get("https://www.leafground.com/radio.xhtml");
         driver.manage().window().maximize();
         
         //Select 'Your most favourite browser' from the radio buttons 
         driver.findElement(By.xpath("//label[contains(text(),'Chrome')]")).click();
        
         //- Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
         driver.findElement(By.xpath("//label[contains(text(),'Chrome')]")).click();
         boolean selected = driver.findElement(By.xpath("//label[contains(text(),'Chrome')]")).isSelected();
         System.out.println("The button Chrome is " +selected);
         
         /*- Identify the radio button that is initially selected by default.
         List<WebElement> radiobuttons = driver.findElements(By.xpath("(//div[@class='card'])[3]"));
         for(WebElement radiobutton:radiobuttons)
         {
         if(radiobutton.isSelected())
         {
        	 System.out.println("default radio button selected is " +radiobutton);
         }
         break;
         }*/
         //- Check and select the age group (21-40 Years) if not already selected
         
	}

}
