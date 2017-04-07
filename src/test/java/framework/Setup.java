package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Framework setup
 * 
 * 
 * Download Gecko WebDriver v0.14.0 - 32bits
 *  https://github.com/mozilla/geckodriver/releases/
 * Download Firefox 52.0.1 - 32bits 
 *  https://ftp.mozilla.org/pub/firefox/releases/
 * 
 * Download Chrome WebDriver
 *  curl -O http://chromedriver.storage.googleapis.com/2.29/chromedriver_win32.zip
 *  
 * @author joaquin.losada
 */
public class Setup {
	private String projectDirectory;
	
	private String browser = "firefox";

	public void loadConfiguration(){
    	if (projectDirectory == null){
        	projectDirectory = System.getProperty("user.dir");
    	}
	}
	public WebDriver getDriver(){
    	
    	DesiredCapabilities capabilities;
    	
    	switch (browser.toLowerCase()){
    		case "firefox":
    	    	System.setProperty("webdriver.gecko.driver", projectDirectory + "/geckodriver-v0.14.0-win32/geckodriver.exe");
    	    	capabilities = DesiredCapabilities.firefox();
    	    	return new FirefoxDriver(capabilities);
    		case "chrome":
    	    	System.setProperty("webdriver.chrome.driver", projectDirectory + "/chromedriver_win32/chromedriver.exe");
    	        return new ChromeDriver();
    	}
    	return null;
	}

}
