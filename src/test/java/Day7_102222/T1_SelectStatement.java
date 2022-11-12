package Day7_102222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_SelectStatement {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add options for maximizing the chrome window
        options.addArguments("start-maximized", "incognito");
        //define the webdriver and pass the options into the method
        WebDriver driver = new ChromeDriver(options);
        //go to mortgage calc site
        driver.navigate().to("https://www.mlcalc.com");
        //wait 3 secs
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Show advanced options']")).click();

        //use slect command for month dropdown
        WebElement strtMonth = driver.findElement(By.xpath("//*[@name='sm']"));
        Select startMonthDropDown = new Select(strtMonth);
        //select by visible text
        startMonthDropDown.selectByVisibleText("Nov");

        //select year
        WebElement strtyear = driver.findElement(By.xpath("//*[@name='sy']"));
        Select startYearDropDown = new Select(strtyear);
        //select by visible text
        startYearDropDown.selectByVisibleText("Nov");

        //driver.findElement(By.xpath("//*[@name='sy']")).click();
        //driver.findElement(By.xpath("//*[text()='2023']")).click();


    }//end of main

}//end of java class
