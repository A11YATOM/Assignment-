import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrana\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rahul");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test@gmail.com");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("******");
		 driver.findElement(By.id("exampleCheck1")).click();
		 driver.findElement(By.id("exampleFormControlSelect1")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//select/option[1]")).click();
		 driver.findElement(By.id("inlineRadio2")).click();
		 driver.findElement(By.xpath("//input[@name='bday']")).click();
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.className("alert")).getText();
		 
	}

}
