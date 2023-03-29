package com.PerStoreAutomation.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	static Properties config;
	public static String getProperty(String key) {
		if(config==null) {
			FileInputStream fis = null;
			config=new Properties();
			try {
				fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return config.getProperty(key);
		
	}

}
