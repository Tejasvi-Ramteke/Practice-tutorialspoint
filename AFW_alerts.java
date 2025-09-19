package practice.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AFW_alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
		
		d.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/ul/li[2]/a")).click();
		
		//Click Button to see alert
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button")).click();
		Alert a=d.switchTo().alert();
		Thread.sleep(1000L);
		a.accept();		
		
		//On button click, alert will appear after 5 seconds
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(5000L);//since alert will appear after 5 seconds
		Alert a1=d.switchTo().alert();
		Thread.sleep(1000L);
		a1.accept();
		
		//On button click, confirm box will appear
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/button")).click();
		Alert a2=d.switchTo().alert();
		Thread.sleep(1000L);
		//a2.accept();//OK
		a2.dismiss();//Cancel
		
		//On button click, prompt box will appear
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/button")).click();
		
		Alert a3=d.switchTo().alert();
		a3.sendKeys("TEJASVI");
		Thread.sleep(1000L);
		a3.accept();
		
		

	}

}
