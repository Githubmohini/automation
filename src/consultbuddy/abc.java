package consultbuddy;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohinis\\Desktop\\Test img\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demo.consultbuddy.com/login");
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("admin@gmail.com");
	    d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Admin@123");
	   
	    String s=JOptionPane.showInputDialog("Enter captcha");
	    d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(s);
	    
	    d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[5]/div[2]/button")).click();
	    Thread.sleep(3000);
	    d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[4]/h2/button")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[4]/div/div/div/div/a[3]")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-question-bank-list/div/div[2]/a")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//div[@id=\"mat-select-value-9\"]")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[4]/div/div/div/mat-option[1]/span")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[4]/div/div/div/mat-option/span")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/div/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[4]/div/div/div/mat-option[1]/span")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/div/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[4]/div/div/div/mat-option[1]/span")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/div/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[4]/div/div/div/mat-option[3]/span")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/div/div[6]/button[2]")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[1]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("What is a PPF and How it Works?");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[2]/div/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys("savings scheme which develops the habit of investment and provide savings in small amounts for depositors. The minimum deposit to open a PPF account  lock-in period of 15 years and the interest is compounded annually. ");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[2]/div/mat-form-field[2]/div/div[1]/div[3]/textarea")).sendKeys("is a type of savings scheme which develops the habit of investment and provide savings in small amounts for depositors. The minimum deposit to open a PPF account in Bank of Maharashtra starts from as low as Rs. 500 to a maximum of Rs. 1,50,000 in a financial year. PPF comes with a mandatory lock-in period of 15 years and the interest is compounded annually. Furthermore, one of the key benefits of this scheme is it offers a rebate on income tax under Section 80C of the Income Tax Act to the depositors.");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[2]/div/div[1]/mat-checkbox/label/span[1]")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[2]/div/div[2]/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[4]/div/div/div/mat-option[3]/span")).click();
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[2]/div/div[2]/div/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("What is tender MCQS?");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[2]/div/div[2]/div/div[4]/div/div/mat-form-field/div/div[1]/div[3]/textarea")).sendKeys("Tender is an estimation of selling price. Tender is used in response to Request for tender.");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[3]/div/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys("What are the types of tender?");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[3]/div/mat-form-field[2]/div/div[1]/div[3]/textarea")).sendKeys("The 4 main types of tenders are:\r\n"
	    		+ "Open tender.\r\n"
	    		+ "Selective tender.\r\n"
	    		+ "Negotiated tender.\r\n"
	    		+ "Single-stage and two-stage tender");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[4]/div/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys("What is EMD amount in tender?");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[4]/div/mat-form-field[2]/div/div[1]/div[3]/textarea")).sendKeys("EMD stands for Earnest Money Deposit. It is taken by the organization to ensure that only serious bidders participate in the tender. This is a refundable deposit which is sought in the form of fixed deposit Receipt/crossed Bank Draft/Irrevocable Bank Guarantee.");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[5]/div/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys("Which is part of tender notice?");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/mat-card/div/div/div[5]/div/mat-form-field[2]/div/div[1]/div[3]/textarea")).sendKeys("The tender notice should stipulate short description of the work, period of construction, date and time for submission of the tender, amount of earnest money to be deposited, manner of depositing the earnest money, estimated amount of the tender, source of receiving the tender documents and the name and address");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-bottom-sheet-container/app-add-question/form/div[2]/div/button[2]/span[1]")).click();
	
	
	
	

	}
	}
