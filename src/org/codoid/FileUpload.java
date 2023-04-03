package org.codoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\manikandan.k\\eclipse-workspace\\Codoid Selenium\\div\\chromedriver.exe");
		   ChromeOptions o=new ChromeOptions();
		   o.addArguments("--remote-allow-origins=*");
		   WebDriver a=new ChromeDriver(o);
      
		a.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        
        a.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("C:\\Users\\manikandan.k\\Downloads\\Resume.pdf");

        Thread.sleep(2000);
        a.quit();
    }

}
