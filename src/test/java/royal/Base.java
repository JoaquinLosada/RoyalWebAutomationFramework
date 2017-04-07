package royal;

import org.fluentlenium.adapter.testng.FluentTestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base extends FluentTestNg {

    @Override
    public WebDriver newWebDriver() {
    	//https://www.youtube.com/watch?v=CbBgHmSufqo
    	//System.setProperty("webdriver.firefox.marionette", "C:/Users/joaquin.losada/workspace6/AutomationFluent/geckodriver-v0.14.0-win32/geckodriver.exe");
    	System.setProperty("webdriver.gecko.driver", "C:/Users/joaquin.losada/workspace6/AutomationFluent/geckodriver-v0.14.0-win32/geckodriver.exe");
    	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    	//capabilities.setCapability("firefox_binary","C:\\Program Files\\Mozilla Firefox\\firefox.exe");    	
		//capabilities.setCapability("marionette", true);
		//capabilities.setBrowserName("firefox");
    	return new FirefoxDriver(capabilities);
    	//System.setProperty("webdriver.chrome.driver", "C:/Users/joaquin.losada/workspace6/AutomationFluent/chromedriver_win32/chromedriver.exe");
        //return new ChromeDriver();
    }
}
