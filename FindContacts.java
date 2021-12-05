package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContacts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver fdcon = new ChromeDriver();
		fdcon.get("http://leaftaps.com/opentaps/control/main");
		fdcon.manage().window().maximize();
		String output = fdcon.getTitle();
		System.out.println("The title of the screen "+output);
		fdcon.findElement(By.id("username")).sendKeys("DemoSalesManager");
		fdcon.findElement(By.id("password")).sendKeys("crmsfa");
		fdcon.findElement(By.className("decorativeSubmit")).click();
		String output2 = fdcon.getTitle();
		System.out.println("The title of the screen "+output2);
		fdcon.findElement(By.linkText("CRM/SFA")).click();
		fdcon.findElement(By.linkText("Contacts")).click();
		String output3 = fdcon.getTitle();
		System.out.println("The title of the screen "+output3);
		fdcon.findElement(By.linkText("Find Contacts")).click();
		//String output4 = fdcon.getTitle();
		//System.out.println("The title of the screen "+output4);
		fdcon.findElement(By.name("id")).sendKeys("10929");
		fdcon.findElement(By.id("ext-gen212")).click();
		
		fdcon.close();

	}

}
