package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LeafGroundCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         FirefoxDriver driver = new FirefoxDriver();
         driver.get("https://leafground.com/checkbox.xhtml");
         driver.manage().window().maximize();
         //Click on the "Basic Checkbox.”
         driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/span[1]")).click();
         // Click on the "Notification Checkbox."
         driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[2]/span")).click();
       //Verify that the expected message is displayed- unable to do this as the text is disappearing
        //Click on your favorite language (assuming it's related to checkboxes)
         driver.findElement(By.xpath("(//div[@class='col-12'])[3]//td[1]")).click();
         driver.findElement(By.xpath("(//div[@class='col-12'])[3]//td[4]")).click();
         //Click on the "Tri-State Checkbox."
         driver.findElement(By.xpath("(//div[@class='col-12'])[4]")).click();
         //Verify which tri-state option has been chosen - unable to do this as the text is disappearing
         //Click on the "Toggle Switch." 
         driver.findElement(By.xpath("(//div[@class='ui-toggleswitch ui-widget'])/div[2]")).click();
         //Verify that the expected message is displayed-unable to do this as the text is disappearing
         //Verify if the Checkbox is disabled
                
         WebElement Checkbox = driver.findElement(By.xpath("//input[@disabled='disabled']"));
         boolean enabled = Checkbox.isEnabled();
         System.out.println("check box is " +enabled);
         //Select multiple options on the page (details may be needed).
         driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']"));
         
       
         
   
         
	}

}
