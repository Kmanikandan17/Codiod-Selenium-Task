package org.codoid;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manikandan.k\\eclipse-workspace\\Codoid\\div\\chromedriver.exe");
	    ChromeOptions o=new ChromeOptions();
	    o.addArguments("--remote-allow-origins=*");
	    WebDriver a=new ChromeDriver(o);
	    
	    a.get("https://www.facebook.com");
	    
	    a.manage().window().maximize();
	    
	    TakesScreenshot ts=(TakesScreenshot) a;
	    
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    System.out.println(src);
	    
	    File des=new File("C:\\Users\\manikandan.k\\eclipse-workspace\\Codoid\\SS\\pig.png");
	    FileUtils.copyFile(src, des);
	    
	}

}
