package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form_practice_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		d.findElement(By.id("name")).sendKeys("Tejasvi");//Name field
		d.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");//Email field("#id")
		d.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[3]/div/div/div[2]/input")).click();//Gender radio button
		d.findElement(By.cssSelector("input[name='mobile']")).sendKeys("1234567898");//Mobile field("tag[attribute='value']")
		d.findElement(By.cssSelector("[type$='date']")).sendKeys("16-04-1991");//Date of birth field("[attribute$='value']")
		d.findElement(By.cssSelector("[name*='subjects']")).sendKeys("English");//Subject field("[attribute='value']")
		
		d.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[7]/div/div/div[3]/input")).click();//Hobbies field
		d.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[7]/div/div/div[2]/input")).click();//Hobbies field
		
		//d.findElement(By.xpath("//*[@id=\"picture\"]")).sendKeys("C:\\Users\\Sony\\Desktop\\C Tops\\screenshot\\testpic.jgp");//Upload
		//d.findElement(By.xpath("//*[@id=\"picture\"]")).sendKeys("hsfavjvajdbasjdbjadbadbadadbadbadbada");//Current Address
		
		WebElement state=d.findElement(By.id("state"));//Choose State
		Select s=new Select(state);
		s.selectByVisibleText("Rajasthan");
		
		WebElement city=d.findElement(By.id("city"));//Choose City
		Select s1=new Select(city);
		s1.selectByIndex(2);
		
		d.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[11]/input")).click();
	}

}
