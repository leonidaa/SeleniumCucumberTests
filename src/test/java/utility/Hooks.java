package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks {
    protected BrowserDriver driver;

    @Before
    public void setUp() throws IOException {
        Properties config;
        FileInputStream fis;
        String browser;

        fis = new FileInputStream("src/test/resources/config.properties");
        config = new Properties();
        config.load(fis);
        browser = config.getProperty("browser","chrome");
        driver = new BrowserDriver(browser);
    }
    @After
    public void tearDown() {
        driver.close();
    }
}
