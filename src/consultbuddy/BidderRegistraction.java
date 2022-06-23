package consultbuddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BidderRegistraction {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohinis\\Desktop\\Test img\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("http://demo.consultbuddy.com/home");
		Thread.sleep(2000);
		
		b.findElement(By.xpath("/html/body/app-root/app-web/app-web-header/header/nav/div/div/ul/div/li[2]/a")).click();
		Thread.sleep(1000);
		b.findElement(By.xpath("/html/body/app-root/app-web/app-web-header/header/nav/div/div/ul/div/li[2]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-bidder-registration/div/div/div/div/div/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Karishama");
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-bidder-registration/div/div/div/div/div/div[2]/form/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Shevatkar");
		Thread.sleep(1000);
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-bidder-registration/div/div/div/div/div/div[2]/form/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("denafjex719@syswift.com");
		
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-bidder-registration/div/div/div/div/div/div[2]/form/div[1]/div[5]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("7569876543");
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-bidder-registration/div/div/div/div/div/div[2]/form/div[2]/small/mat-checkbox/label/span[1]")).click();
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-bidder-registration/div/div/div/div/div/div[2]/form/div[3]/div/button[2]/span[1]")).click();
		
		
	}

}
