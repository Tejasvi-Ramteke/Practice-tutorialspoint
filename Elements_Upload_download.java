package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_Upload_download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		d.findElement(By.xpath("//*[@id=\"navMenus\"]/li[8]/a")).click();//click on Upload and Download
		
		d.findElement(By.linkText("Download")).click();//click on download button
		
		d.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Sony\\Desktop\\C Tops\\screenshot\\TVISH.jpg");//Choose File

	}

}
