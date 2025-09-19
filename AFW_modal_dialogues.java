package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AFW_modal_dialogues {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
		
		d.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/ul/li[5]/a")).click();
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]")).click();
		Thread.sleep(1000L);
		d.findElement(By.xpath("//*[@id=\"exampleModalSm\"]/div/div/div[3]/button")).click();
		
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]")).click();
		Thread.sleep(1000L);
		d.findElement(By.xpath("//*[@id=\"exampleModalLg\"]/div/div/div[3]/button")).click();
		


	}

}
