package Day9_102922;

import Reuseable_Liberary.Reusable_Actions;
import org.openqa.selenium.WebDriver;

import static Reuseable_Liberary.Reusable_Actions.setUpDriver;

public class T4_MetlifeUsingReuseable {
    public static void main(String[] args) throws InterruptedException {
        //call webdriver method from reusable library
        WebDriver driver = setUpDriver();
        //navigate to MetLife
        driver.navigate().to("https://www.metLife.com");
        //hover over the solutions dropdown
        //ReusableActions.mouseHover(driver, "//*[contains(text(), 'SOLUTIONS')]", "Solutions Dropdown");
        //or click on solutions dropdown
        Reusable_Actions.clickActionByIndex(driver, "//*[contains(text(), 'SOLUTIONS')]", 0, "Solutions Link");
        //click on dental link
        Reusable_Actions.clickAction(driver, "//*[text() = 'Dental']", "Dental Link");
        //capture the headline title
        String headlineTitle = Reusable_Actions.getTextAction(driver, "//*[@class = 'headline__title']", "Headline Title");
        //print out the title
        System.out.println("The headline title is " + headlineTitle);
        //quit driver
        driver.quit();
    }//end of main
}//end of java class
