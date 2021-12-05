package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		//chrome driver setup
				WebDriverManager.chromedriver().setup();
				//launching the chrome driver
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				String title = driver.getTitle();
				System.out.println(title);
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.linkText("Create Contact")).click();
				driver.findElement(By.id("firstNameField")).sendKeys("Nandhini");
				driver.findElement(By.id("lastNameField")).sendKeys("Ravichandran");
				driver.findElement(By.name("submitButton")).click();
				String title2 = driver.getTitle();
				System.out.println(title2);
				String firstname = driver.findElement(By.id("viewContact_firstName_sp")).getText();
				System.out.println(firstname);
				driver.close();
								
	}

}
