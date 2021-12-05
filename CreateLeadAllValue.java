package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAllValue {

	public static void main(String[] args) {
		//chrome driver setup
		WebDriverManager.chromedriver().setup();
		//launching the chrome driver
		ChromeDriver driver = new ChromeDriver();
		//load the url (using the method get)
		driver.get("http://leaftaps.com/opentaps");
		//to maximixe the browser
		driver.manage().window().maximize();
		//title of the browser is assigned to variable title
		String title = driver.getTitle();
		//printing the title name
		System.out.println(title);
		 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravichandran");
		//dropdown
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel =new Select(dropdown);
		sel.selectByVisibleText("Employee");
		driver.findElement(By.name("submitButton")).click();
		String source = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(source);
		String title2 = driver.getTitle();
		System.out.println(title2);
		
	}

}
