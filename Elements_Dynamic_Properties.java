package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_Dynamic_Properties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		d.findElement(By.xpath("//*[@id=\"navMenus\"]/li[9]/a")).click();//click on Dynamic Properties
		d.findElement(By.id("colorChange")).click();
		Thread.sleep(5000);
		System.out.println(d.findElement(By.id("visibleAfter")).getText());

	}

}
