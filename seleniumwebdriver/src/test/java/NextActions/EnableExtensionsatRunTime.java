package NextActions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsatRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		
		File file=new File("");
		options.addExtensions(file);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://text-compare.com/");
		
		
		
		

	}

}
