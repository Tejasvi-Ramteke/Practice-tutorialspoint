package practice.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		
		//New Tab
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]")).click();
		System.out.println(d.findElement(By.xpath("/html/body/div/header/div[2]/h1")).getText());//to confirm tab activity
		//to switch tab
		ArrayList<String>tabs=new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs.get(0));
		
		//New window
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]")).click();
		Set<String>winIds=d.getWindowHandles();
		System.out.println("1st windows ids are:"+winIds);
		
		Iterator<String> itr=winIds.iterator();
		String pwin=itr.next();
		String cwin=itr.next();
		
		System.out.println("Parent window id="+ pwin + " Child window id ="+cwin);
		d.switchTo().window(cwin); //switch to child window opened
		System.out.println("new window activity check:-"+d.findElement(By.xpath("/html/body/main/div/div/h1")).getText());//check activity
		
		//New Window Message
		d.switchTo().window(pwin);//switch to parent window
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[3]")).click();//click "new window message" tab
		Set<String>window2=d.getWindowHandles();
		System.out.println("2nd window ids are:-"+window2);
		
		Iterator<String>itr2=window2.iterator();
		String pwindow=itr2.next();
		String cwindow=itr2.next();
		
		System.out.println("Parent window: "+pwindow+" Child window: "+cwindow);
		d.switchTo().window(cwindow);
		System.out.println("new window activity check:-"+d.findElement(By.xpath("/html/body/div/header/div[2]/h1")).getText());//to check activity of child window
		d.switchTo().window(pwindow);
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]")).click();//to check activity of parent window
	}

}
