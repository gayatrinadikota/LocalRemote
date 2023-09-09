package AutoITDemos;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoiTDemo1 
{
	@Test
	public void fileUploadTest() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Srinivas\\Downloads\\FileUploadDemo1.html");
		WebElement fileUpload=driver.findElement(By.xpath("//input[@id='RBG']"));
		fileUpload.click();
		Thread.sleep(10000);
		Runtime.getRuntime().exec("C:\\Users\\Srinivas\\Desktop\\Testing downloads\\AutoIT\\AutoITDemo1.exe");
		System.out.println("Done");
		
	}
	}


