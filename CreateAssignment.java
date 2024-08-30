package week2.Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAssignment {
	public static void main(String[] args) {
		//launch the required browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Testers");
		driver.findElement(By.id("numberEmployees")).sendKeys("1008");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("Caputered title is: "+ title);
		//Assertions.assertEquals("Practice page", title);
		driver.close();

		
	}
	

}
