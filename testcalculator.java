package calculator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcalculator {
	WebDriver driver;

	@BeforeTest
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\Chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}
	@Test
	public void multiplication() {
		driver.navigate().to("https://www.calculator.net/"); 
		System.out.println("Title of Web Page is "+  driver.getTitle());
		
		 
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
	System.out.println("Final result of multiplication is 222075");
	}
	
	@Test 
	public void division(){
		driver.navigate().to("https://www.calculator.net/"); 
		System.out.println("Title of Web Page is "+  driver.getTitle());
	
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
	driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
	System.out.println("Final result of division is 20");
}
	@Test
	public void addition(){
		driver.navigate().to("https://www.calculator.net/"); 
	    System.out.println("Title of Web Page is "+  driver.getTitle());
	    
	    
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		System.out.println("Final resultof addition is 111111 ");
	}
	@Test
	public void substraction(){
		driver.navigate().to("https://www.calculator.net/"); 
	    System.out.println("Title of Web Page is "+  driver.getTitle());
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
	    System.out.println("Final result of substraction is 23329646");
		
	}
	/*@AfterTest
	public void closebrowser() {
		driver.close();
	}*/
}



