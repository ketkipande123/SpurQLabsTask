package testingTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Calculator2 {

//	static WebDriver driver;
	static WebDriver driver;
	
	@Test(priority=1)
	public void opn() 
	{
//		 System.setProperty("webdriver.chrome.driver", "J:\\Advanto software testing\\Automation\\chromedriver.exe");
//		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.calculator.net/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(priority=2)
	public void multi() throws Exception
	{
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

	}
	
	@Test(priority=3)
	public void div() throws Exception
	{
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
	}
	
	@Test(priority=4)
	public void add() throws Exception
	{
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
	}
	
	@Test(priority=5)
	public void sub() throws Exception
	{
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
	}
	  @BeforeClass
	  public void launchBrowser()
	  {
		  System.setProperty("webdriver.chrome.driver", "J:\\Advanto software testing\\Automation\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  
	  @AfterClass
	  public void close()
	  {
		  driver.close();
	  }
}



