package Day4_100922;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_WebDriverExample {

    public static void main(String[] args) throws InterruptedException {
        //declare the webdriver manager setup for chrome
        WebDriverManager.chromedriver().setup();
        //define the chorme driver for your test use
        //create an instance for a chrome driver to use for automation
        WebDriver driver = new ChromeDriver();

        // Navigate to chrome google site
        driver.navigate().to("https://www.google.com");

        // To allow the browser to wait few seconds
        Thread.sleep(4000);

        //to quit chrome session
        driver.quit();

    }//end of  main

}//end of java class
