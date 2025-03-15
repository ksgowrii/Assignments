package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Temenos");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gowri");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("K S");
		WebElement sourceid = driver.findElement(By.name("dataSourceId"));
		Select source = new Select(sourceid);
		source.selectByIndex(5);
		WebElement Title = driver.findElement(By.xpath("//input[@name= 'generalProfTitle']"));
		Title.sendKeys("Lead product");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println("Title is" +title);
	}

}
