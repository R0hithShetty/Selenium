package com.swaglabs.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileLib1 {
	public String getDataFromProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondataswaglabs.properties");
		Properties p=new Properties();
		p.load(fis);
		String data= p.getProperty(key);
		return data;
	}
	
	

}
