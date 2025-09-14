package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_Text_box {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		
		d.findElement(By.cssSelector("input#fullname")).sendKeys("Tejasvi Ramteke");//css selector ("tag#id")
		d.findElement(By.cssSelector("input.form-control[name=email]")).sendKeys("TR@g.com");//("tag.valueofclass[attribute=value]")
		d.findElement(By.id("address")).sendKeys("81-City Palace,Jammu, India");
		d.findElement(By.cssSelector("input#password")).sendKeys("abcde");//css selector ("tag#id")		
		d.findElement(By.xpath("//*[@id=\"TextForm\"]/div[5]/input")).click();//submit
		
		Thread.sleep(1000);
		d.quit();

	}

}
