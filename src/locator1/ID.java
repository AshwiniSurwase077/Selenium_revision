package locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Setup.S1;

public class ID extends S1
{

public static void main(String[] args) throws InterruptedException 
{
	setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	//tagname not work bcz of their multiple matching are thier.
	//if single element will be present their then it will work
	
	driver.findElement(By.id("email")).sendKeys("bbb");
}

}
