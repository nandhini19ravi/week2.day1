package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EdgeBrowser {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driv = new EdgeDriver();
		driv.get("http://leaftaps.com/opentaps");
		driv.manage().window().maximize();
		String header = driv.getTitle();
		//printing the title name
		System.out.println(header);
		driv.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driv.findElement(By.id("password")).sendKeys("crmsfa");
		driv.findElement(By.className("decorativeSubmit")).click();
		driv.findElement(By.linkText("CRM/SFA")).click();
		driv.findElement(By.linkText("Leads")).click();
		driv.findElement(By.linkText("Create Lead")).click();
		driv.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driv.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhini");
		driv.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravichandran");
		
		//dropdown
		WebElement dropdown = driv.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel =new Select(dropdown);
		sel.selectByVisibleText("Employee");
		
		
		driv.findElement(By.name("submitButton")).click();
		String source = driv.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(source);
		String title2 = driv.getTitle();
		System.out.println(title2);
		//closing the driver
		//driver.close();
	

	}

}
