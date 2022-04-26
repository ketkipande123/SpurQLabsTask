package testingTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCalculator {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "J:\\Advanto software testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Multiplication
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='4']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='2']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='3']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div//span[@class='sciop' and text()='×']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='5']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='2']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='5']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div//span[@class='scieq' and text()='AC']")).click();
		Thread.sleep(2000);
		
		//division
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='4']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='0']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='0']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='0']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div//span[@class='sciop' and text()='/']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='2']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='0']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='0']")).click();
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div//span[@class='scieq' and text()='AC']")).click();
		Thread.sleep(2000);
		
		//Addition
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//span[@class='sciop' and text()='–']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='2']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='3']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='4']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='2']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='3']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='4']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div//span[@class='sciop' and text()='+']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='3']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='4']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='5']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='3']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='4']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='5']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div//span[@class='scieq' and text()='AC']")).click();
		Thread.sleep(2000);

		//Subtraction
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='2']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='3']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='4']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='8']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='2']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='3']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div//span[@class='sciop' and text()='–']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div//span[@class='scifunc' and text()='(']")).click();
	    driver.findElement(By.xpath("//div//span[@class='sciop' and text()='–']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='2']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='3']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='0']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='9']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='4']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='8']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='2']")).click();
		driver.findElement(By.xpath("//div//span[@class='scinm' and text()='3']")).click();
		driver.findElement(By.xpath("//div//span[@class='scifunc' and text()=')']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div//span[@class='scieq' and text()='AC']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
