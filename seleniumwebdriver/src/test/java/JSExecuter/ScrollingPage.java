package JSExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1) scroll down the page by pixel number
		
		js.executeScript("window.scrollBy(0,1000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// 2) scroll the page till element is visible
		
		WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// 3) scroll page till the end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
		// scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		
		
		
	}

}
