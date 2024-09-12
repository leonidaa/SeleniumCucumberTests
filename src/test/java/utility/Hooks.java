package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    public static BrowserDriver browserDriver;
    @Before
    public void setUp(){
        browserDriver=new BrowserDriver();
    }
    @After
    public void tearDown(){
        browserDriver.close();
    }
}
