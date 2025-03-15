package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount2hw {

	public static void main(String[] args) {
		// instantiate the driver , launch the browser and login to leaf tap
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// click on crm/sfa link and lead , created lead
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// click on account and create an account

		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("HWGowri account");
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");

		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select Industrydd = new Select(Industry);
		Industrydd.selectByIndex(4);

		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select Ownershipdd = new Select(Ownership);
		Ownershipdd.selectByVisibleText("S-Corporation");

		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sourcedd = new Select(source);
		sourcedd.selectByValue("LEAD_EMPLOYEE");

		WebElement marketingcampaign = driver.findElement(By.id("marketingCampaignId"));
		Select marketingcampaigndd = new Select(marketingcampaign);
		marketingcampaigndd.selectByIndex(6);

		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select statedd = new Select(state);
		statedd.selectByValue("TX");

		driver.findElement(By.xpath("//input[contains(@onclick,'submitFormWith')]")).click();

		String title1 = driver.getTitle();
		System.out.println("title is" + title1);

		WebElement AccountName = driver.findElement(By.xpath("//span[contains(text(),'HWGowri account')]"));
		System.out.println("AccountName is" + AccountName);

		driver.close();
	}

}
