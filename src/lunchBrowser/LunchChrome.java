package lunchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		//Scanner scn = new Scanner(System.in);
		System. setProperty("webdriver.chrome.driver","C:\\Users\\mandi\\OneDrive\\Desktop\\June2021QA (Selenium)\\1st_selenium_Projects\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");//Opening browser
		driver.manage().window().maximize();//maximizing browser
		driver.close();//closing the browser
		driver.findElement(By.className("q")).sendKeys("selenium");
		Thread.sleep(2000);//closing the browser for 2 second
		driver.close();
	}

}
