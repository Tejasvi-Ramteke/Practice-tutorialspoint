package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class widgets_date_picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		
		//date picker1
		d.findElement(By.id("datetimepicker1")).click();
		d.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/span[26]")).click();//date selection
		d.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/input")).sendKeys("10");//hours
		d.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/input")).sendKeys("30");//minutes
		d.findElement(By.xpath("/html/body/div[2]/div[3]/span[2]")).click();//click only when AM is needed, to leave it PM comment this line 
		
		//date picker2
		d.findElement(By.id("datetimepicker2")).click();
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/span[17]")).click();//choose date
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/h1")).click();//click outside to close the widget

	}

}
