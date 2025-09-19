package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AFW_frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
		
		d.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/ul/li[3]/a")).click();
		
		System.out.println(d.findElement(By.xpath("/html/body/main/div/div/div[2]/h2[1]")).getText());//check activity
		
		d.switchTo().frame(0);//enter the frame
		System.out.println(d.findElement(By.xpath("/html/body/main/div/div/h1")).getText());//check activity
		
		d.switchTo().defaultContent();//to get back to parent frame
		System.out.println(d.findElement(By.xpath("/html/body/main/div/div/div[2]/h2[1]")).getText());//check activity
		

	}

}
