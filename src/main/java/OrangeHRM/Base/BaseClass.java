package OrangeHRM.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseClass {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){

        System.setProperty("C:\\Users\\sebas\\Documents\\XmartCourse", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
