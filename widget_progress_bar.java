package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class widget_progress_bar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.tutorialspoint.com/selenium/practice/progress-bar.php"); //launch url
		d.findElement(By.xpath("//*[@id=\"startProgressTimer\"]")).click();	
		Thread.sleep(5000L);
		d.close();

	}

}
