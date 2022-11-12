package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class AI_2_DataDriven_Bing {

    public static void main(String[] args) throws InterruptedException {

        //ArrayList for Sports
        ArrayList<String> sport = new ArrayList<>();
        sport.add("cricket");
        sport.add("football");
        sport.add("soccer");
        sport.add("badminton");


        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //define the chrome driver to use for your test
        //creating an instance for a chrome driver(browser) to use for automation
        WebDriver driver = new ChromeDriver();


        for (int i = 0; i < sport.size(); i++) {

            //navigate to the bing site
            driver.navigate().to("https://www.bing.com");

            //maximize my window
            //for windows
            driver.manage().window().maximize();

            //sleep statement
            Thread.sleep(3000);

            //search a keyword on the search field
            //relative xpath to locate the element
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sport.get(i));
            //hit submit on the search button
            driver.findElement(By.xpath("//*[@name='search']")).submit();

            //sleep statement
            Thread.sleep(3000);

            //capture the search result text
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //split message to extract out the search number
            String[] splitResult = result.split(" ");
            System.out.println("The search number is for " + sport.get(i) + " is " + splitResult[0]);

        }//End of for loop

        //Quit the driver to end the session
        driver.quit();


    }//End of main


}//End of java class
