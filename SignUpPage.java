package com.atmecs.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.demoblaze.testsuit.Base;

public class SignUpPage extends Base {


	public static void SignUpMethods() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();
				
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.cssSelector("#sign-username")).sendKeys("");
		driver.findElement(By.cssSelector("#sign-password")).sendKeys("demo@1234");
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

		}
}

