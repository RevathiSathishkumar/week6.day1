package week5.day1;
 

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class CreateLead extends ProjtectSpecificMethods {
  
  @Test
		public void CreateLeads() {
	        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathi");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Madhavan");
			driver.findElement(By.name("submitButton")).click();
			driver.close();
	}
  
	  
  }
	


