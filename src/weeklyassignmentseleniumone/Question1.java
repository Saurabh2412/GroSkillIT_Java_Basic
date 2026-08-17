package weeklyassignmentseleniumone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://files.wiseapp.live/upload_files/6932afb3c05630afe5a997f1/upload_997951c3-ea02-4bd1-94eb-4dfb62b41407.html");
		
		driver.manage().window().maximize();
		
		//Enter UserName
		driver.findElement(By.id("userName")).sendKeys("Shreya sharma");
		Thread.sleep(2000);
		
		//Select City from DropDown
		WebElement city = driver.findElement(By.id("city"));
		Select select = new Select(city);
		select.selectByValue("Mumbai");
		Thread.sleep(2000);
		
		//Select Gender from radio button
		driver.findElement(By.id("female")).click();
		Thread.sleep(2000);
		
		//Select all options in Checkbox Skills
		List<WebElement> skillsList = driver.findElements(By.name("skills"));
		
		for(WebElement skill : skillsList)
		{
			skill.click();
		}
		Thread.sleep(3000);
		
		//Click on Submit button
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
	}

}
