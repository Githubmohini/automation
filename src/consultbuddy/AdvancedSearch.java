package consultbuddy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedSearch {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohinis\\Desktop\\Test img\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver M=new ChromeDriver();
	M.manage().window().maximize();
	M.get("http://demo.consultbuddy.com/tender-filters");
	
	//M.findElement(By.xpath("/html/body/app-root/app-web/div/app-home/div[2]/div[1]/div/div/form/div/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Rail");
	Thread.sleep(1000);
	 /*
	  * M.findElement(By.xpath("/html/body/app-root/app-web/div/app-home/div[2]/div[1]/div/div/form/div/div[2]/button")).click();
	  */
	Thread.sleep(2000);
	M.findElement(By.xpath("/html/body/app-root/app-web/div/app-tender-filters/mat-card/div/div/div[1]/div/div/form/div[1]/mat-form-field/div/div[1]/div[3]/mat-select"));
	Thread.sleep(1000);
	/*Set<String> s=M.getWindowHandles();
	Iterator i=s.iterator();
	 String Child=(String) i.next();
	M.switchTo().window(Child);
	
	*
	*/
	M.findElement(By.xpath("//mat-select[@id=\"mat-select-0\"]")).click();
	Thread.sleep(1000);
	
	
	}

}
