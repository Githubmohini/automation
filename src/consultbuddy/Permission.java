package consultbuddy;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class Permission {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mohinis\\\\Desktop\\\\Test img\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver p=(WebDriver) new ChromeDriver();
		p.get("http://demo.consultbuddy.com/home");
		Thread.sleep(1000);
		p.manage().window().maximize();
		
		// For click on Login 
		p.findElement(By.xpath("/html/body/app-root/app-web/app-web-header/header/nav/div/div/ul/div/li[1]/a")).click();
		
		//For Username and Password
		p.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("admin@gmail.com");
		p.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Admin@123");
		
		
		// For Captcha field
		String s=JOptionPane.showInputDialog("Enter Captcha");
		p.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(s);
	
		//For clcik on login button
		p.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[5]/div[2]/button")).click();
		Thread.sleep(2000);
		
		
		// For clcik on Users option
		p.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[3]/h2/button")).click();
		Thread.sleep(1000);
		
		
		//For Click on Permission option
		p.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[3]/div/div/div/div/a[4]")).click();
		Thread.sleep(1000);
		
		
		//For click on dropdown
		p.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-permission/mat-card/form/div/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
		Thread.sleep(2000);
		
		//For selection of perticular option"Carpenter"
		p.findElement(By.xpath("//*[@id=\"mat-option-5\"]/span")).click();
		Thread.sleep(1000);
		
		
		// For selecting perticular checkbox
		p.findElement(By.xpath("//*[@id=\"mat-checkbox-54\"]/label/span[1]")).click();
		
		//For scrolling functionality
		
		String s1;
	    JavascriptExecutor js = (JavascriptExecutor) p;
		js.executeScript( s1="window.scrollBy(0, 400)");
		

		// For selecting perticular checkbox
		p.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-permission/mat-card/div[1]/div/mat-table/mat-row[17]/mat-cell[4]/mat-checkbox/label/span[1]")).click();
		
		//For click on save button
		p.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-permission/mat-card/div[2]/div/button[2]/span[1]")).click();
		
		//For click on dropdown
		p.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-permission/mat-card/form/div/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
		Thread.sleep(2000);
		

		//For selection of perticular option"Carpenter"
		p.findElement(By.xpath("//*[@id=\"mat-option-5\"]/span")).click();
		Thread.sleep(1000);
		
		
		/*p.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-permission/mat-card/form/div/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
		//p.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[6]/span")).click();*/
	
	}

}
