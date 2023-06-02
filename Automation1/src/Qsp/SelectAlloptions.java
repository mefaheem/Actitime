package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAlloptions {
	static {
		System.setProperty("WebDriver.Chrome.driver","./driver/ChromeDriver.exe");
		}
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		Thread.sleep(1000);
		List<WebElement> alloptions = s.getOptions();
		int count=alloptions.size();
		System.out.println(count);
		for(WebElement a:alloptions) {
			 String text = a.getText();
			 System.out.println(text);
		}
	}

}
