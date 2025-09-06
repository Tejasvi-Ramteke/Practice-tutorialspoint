package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_checkbox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		
		d.findElement(By.xpath("//*[@id=\"navMenus\"]/li[2]/a")).click();//go to Check box
		
		d.findElement(By.xpath("//*[@id=\"bs_1\"]/span[1]")).click();//open Main level 1
		d.findElement(By.xpath("//*[@id=\"c_bf_2\"]")).click();//check sub level 2
		
		d.findElement(By.xpath("//*[@id=\"bs_2\"]/span[1]")).click();//open Main level 2
		d.findElement(By.id("c_bf_4")).click();//check sub level 4
		
		d.findElement(By.id("c_bs_1")).click();//check Main level 1 
		
		Thread.sleep(2000);
		d.quit();
		

	}

}
