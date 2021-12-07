package MarriottTechTraining.Javaguys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mavan1 {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\yasir\\eclipse-workspace\\Javaguys\\src\\choromedriver\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("http://www.amazon.com");//how to open site
//thread.sleep(6000);
driver.navigate().refresh();//how to refresh
//thread.sleep(6000);
driver.navigate().back();//how to go back ward
//thread.sleep(6000);
driver.navigate().forward();//how to go forward 
//thread.sleep(6000);
driver.manage().window();maximize();//how to maximize
String windowofhandel=driver.getWindowHandle();//how to get window handel 
System.out.println(windowofhandel);
String currenturlpage=driver.getCurrentUrl();//how to get current url for page
System.out.println(currenturlpage);
driver.close();//how to close the window 

	
	



	}
	private static void maximize() {
		// TODO Auto-generated method stub
		
	}

}
