package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forms_Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		
		d.findElement(By.id("email")).sendKeys("Tejasvi@gmail.com");
		d.findElement(By.id("password")).sendKeys("abcde");
		d.findElement(By.xpath("//*[@id=\"signInForm\"]/div[3]/input")).click();
		Thread.sleep(1000);
		d.findElement(By.linkText("New User")).click();
		Thread.sleep(1000);
		d.findElement(By.id("firstname")).sendKeys("Mukund");
		d.findElement(By.id("lastname")).sendKeys("Sapar");
		d.findElement(By.id("username")).sendKeys("MukSap@123");
		d.findElement(By.id("password")).sendKeys("abcde");
		d.findElement(By.xpath("//*[@id=\"signupForm\"]/div[5]/input")).click();
		
		d.findElement(By.linkText("Back to Login")).click();
		Thread.sleep(1000);
		d.quit();

	}

}
