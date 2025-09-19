package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AFW_nested_frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
		
		System.out.println(d.findElement(By.xpath("/html/body/div/header/div[2]/h1")).getText());//get text-Selenium - Automation Practice Form
		
		d.switchTo().frame(0);
		
		System.out.println(d.findElement(By.xpath("/html/body/main/div/div/h1")).getText());//get text-New tab
		
		System.out.println(d.findElement(By.xpath("/html/body/div/header/div[2]/h1")).getText());//get text-Selenium - Automation Practice Form

	}

}
