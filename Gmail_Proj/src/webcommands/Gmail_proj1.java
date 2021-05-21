package webcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_proj1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Tool\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/* 1. Open Gmail */
		driver.get("https://accounts.google.com/login/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().window().maximize();
		/*2.clicl Help */
		
		WebElement help = driver.findElement(By.xpath("// a[@target='_blank'][1]"));
		System.out.println(help.getCssValue("color"));
		
		help.click();
		
		//WebElement help = driver.findElement(By.linkText("Help"));
		//help.click();
		
	//	<a href="https://support.google.com/accounts?hl=en" target="_blank">Help</a>
		//driver.findElement(By.xpath("// a[@href='https://support.google.com/accounts?hl=en']")).click();

		/*3 click on Create a google Account */
		
	
		
		String curURL = null;
		curURL = driver.getCurrentUrl();
		
		System.out.println("current URL is : " + curURL);
		
	//	driver.findElement(By.linkText("Create a Google Account")).click();
		
	//	WebElement creategoogle = driver.findElement(By.partialLinkText("Create a"));
	//	creategoogle.click();
		Thread.sleep(3000);
		driver.close();
	
	}

}
