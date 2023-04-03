package org.codoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFile {
	public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\manikandan.k\\eclipse-workspace\\Codoid Selenium\\div\\chromedriver.exe");
		   ChromeOptions o=new ChromeOptions();
		   o.addArguments("--remote-allow-origins=*");
		   WebDriver a=new ChromeDriver(o);
     
		a.get("https://demo.automationtesting.in/FileDownload.html");
		
		a.findElement(By.id("textbox")).sendKeys("Hi This Manikandan K \r\n" + 	"B.E/CSE-2022\r\n" + "I have Done Java Selenium Course");
		a.findElement(By.id("createTxt")).click();
	    a.findElement(By.id("link-to-download")).click();
}
}
