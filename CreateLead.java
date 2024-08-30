package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
  
public class CreateLead {
	public static void main(String[] args) {
		//launch the required browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vamsi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Potta");
		
		WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDD = new Select(sourceWE);
		sourceDD.selectByIndex(4);
		
		WebElement campaignWE = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select campaignDD = new Select(campaignWE);
		campaignDD.selectByValue("9000");
		
		WebElement industryWE = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDD = new Select(industryWE);
		industryDD.selectByValue("IND_FINANCE");
		
		
		driver.findElement(By.className("smallSubmit")).click();
		String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(leadId);
		
		
	}
	

}
