package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		DeleteLead CreateLeadWithPh = new DeleteLead();
		CreateLeadWithPh.createLead2();
		
		//instantiate the driver , launch the browser and login to leaf tap
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//click on crm/sfa link
				driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
				//click on Leads link
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				
				//click on findleads link
				driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
				
				//click on phone link
				driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[2]/span")).click();
				
				//enter are code , country code and phone number
				driver.findElement(By.name("phoneCountryCode")).sendKeys("");
				driver.findElement(By.name("phoneAreaCode")).sendKeys("91");
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9080490608");
				Thread.sleep(500);
				
				//click on findleads link
				driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
				Thread.sleep(5000);
				
				//store the leadID
				String LeadId = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
				Thread.sleep(5000);
				System.out.println("LeadId is " +LeadId);
				Thread.sleep(5000);
				
				//click on find leads and enter the lead id 
				driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadId);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(3000);
				
				//click on delete lead id
				driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				Thread.sleep(3000);
				
				//Click "Find leads" again.. 
				driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadId);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(500);
				
				String norecords = driver.findElement(By.xpath("//div[contains(text(),'No records')]")).getText();
				System.out.println(norecords);
	}
		public void createLead2() {
			ChromeDriver driver = new ChromeDriver();
			String title = driver.getTitle();
			System.out.println("Title is" + title);
			// launch the browser and login to leaf tap
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();

			// click on crm/sfa link and lead , created lead
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

			// fill in details to create lead
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Temenos31todelete");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gowri");
			driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("K S");
			WebElement sourceid = driver.findElement(By.name("dataSourceId"));
			Select source = new Select(sourceid);
			source.selectByIndex(5);
			WebElement Title = driver.findElement(By.xpath("//input[@name= 'generalProfTitle']"));
			Title.sendKeys("Lead product");

			driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("");
			driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
			driver.findElement(By.xpath("(//input[@name='primaryPhoneNumber'])[4]")).sendKeys("9080490608");

			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		}

		
	}
