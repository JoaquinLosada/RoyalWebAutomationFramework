package royal;

import org.fluentlenium.adapter.testng.FluentTestNg;
import org.openqa.selenium.WebDriver;

import framework.Setup;

/**
 * Base for test classes.
 */
public class Base extends FluentTestNg {
	
    @Override
    public WebDriver newWebDriver() {
    	Setup setup = new Setup();
    	setup.loadConfiguration();
    	return setup.getDriver();
    }
}
