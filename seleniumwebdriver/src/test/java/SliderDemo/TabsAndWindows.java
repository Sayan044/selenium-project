package SliderDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://orangehrm.com/");
		
		

	}

}
