package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
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
				
				//click on account and create an account 
				
				driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
				driver.findElement(By.xpath("//a[text()='Create Account']")).click();
				driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("zrizy account");
				
				driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
				driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("20");
				driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
				
				WebElement InitialTeam = driver.findElement(By.id("initialTeamPartyId"));
				Select InitialTeamdd=new Select(InitialTeam);
				InitialTeamdd.selectByValue("DemoSalesTeam2");
					
				driver.findElement(By.xpath("//input[contains(@onclick,'submitFormWith')]")).click();
				Thread.sleep(5000);
				
				String AccountNameValue = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
				System.out.println("Acount name value is " +AccountNameValue);
				
				String title1 = driver.getTitle();
				System.out.println("title is" +title1);
				
	}

}
