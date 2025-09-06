package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_radio_button {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		
		d.findElement(By.xpath("//*[@id=\"navMenus\"]/li[3]/a")).click();//click on Radio Button
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/input")).click();//select Impressive
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/input")).click();//select Yes
		
		Thread.sleep(2000);
		d.quit();

	}

}
