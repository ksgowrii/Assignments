package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("http://leaftaps.com/opentaps/control/main");
		driver2.findElement(By.id("username")).sendKeys("democsr");
		driver2.findElement(By.id("password")).sendKeys("crmsfa");
		driver2.findElement(By.className("decorativeSubmit")).click();
		
		driver2.findElement(By.partialLinkText("CRM")).click();
		driver2.findElement(By.linkText("Leads")).click();
		WebElement loginclick = driver2.findElement(By.linkText("Create Lead"));
		loginclick.click();
		
		driver2.findElement(By.id("createLeadForm_companyName")).sendKeys("KG");
		driver2.findElement(By.id("createLeadForm_firstName")).sendKeys("Gowri");
		driver2.findElement(By.id("createLeadForm_lastName")).sendKeys("K S");
		
		WebElement sourcedd = driver2.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(sourcedd);
		source.selectByIndex(5);
		
		WebElement marketingcampaigndd = driver2.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingcampaign = new Select(marketingcampaigndd);
		marketingcampaign.selectByVisibleText("Automobile");
		
		WebElement Ownershipdd = driver2.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select Ownership = new Select(Ownershipdd);
		Ownership.selectByValue("OWN_CCORP");
		
		WebElement loginclick1 = driver2.findElement(By.linkText("Create Lead"));
		loginclick1.click();

	}

}
