package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		//instantiate the driver , launch the browser and login to leaf tap
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//click on crm/sfa link and lead , created lead
				driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
				
				//fill in details to create lead
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Temenos1");
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gowri1");
				driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("K S1");
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("G K");
				
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Training");
				driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("to create a lead form");
				driver.findElement(By.xpath("(//input[@name = 'primaryEmail'])[4]")).sendKeys("savithapeacock@gmail.com");
			    WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
			    Select statedd = new Select(State);
			    statedd.selectByVisibleText("New York");
			    
			    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			    driver.findElement(By.xpath("//a[text()='Edit']")).click();
			    driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).sendKeys("to edit the lead form");
			    driver.findElement(By.xpath("//textarea[@name = 'importantNote']")).sendKeys("updated the lead");
			    
			    driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
			    String title = driver.getTitle();
				System.out.println("Title is" +title);
				
				driver.close();
				
	}

}
