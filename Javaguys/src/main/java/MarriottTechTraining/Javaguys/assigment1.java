package MarriottTechTraining.Javaguys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigment1 {
       static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yasir\\Downloads\\chromedriver_win32\\chromedriver.exe");
       driver = new ChromeDriver();
        driver.get("http://www.facebook.com");		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("yasir");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.click();
		pass.sendKeys("tony");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.linkText("cancel")).click();
		driver.findElement(By.linkText("creat new account")).click();
		WebElement First=driver.findElement(By.name("firstname"));
		First.click();
		First.sendKeys("yasir");
		WebElement Last=driver.findElement(By.name("lasttime"));
		Last.click();
		
		
		
		
		
		
		
		
		
	}

}


