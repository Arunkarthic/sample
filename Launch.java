package org.test.java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "E:\\JavaProgram\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	  d.get("https://www.facebook.com/");
} 
}
  