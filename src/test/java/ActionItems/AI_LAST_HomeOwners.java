package ActionItems;

import Reuseable_Liberary.Reusable_Actions_Loggers;
import Reuseable_Liberary.Reuseable_Annotations;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AI_LAST_HomeOwners extends Reuseable_Annotations {
    @Test (priority = 1)
    public void tc001_HomeInsurance() throws InterruptedException {
        //Navigate to Shelter Insurance home page
        driver.navigate().to("https://www.shelterinsurance.com/");
        Thread.sleep(3000);
        //hover mouse over Insurance
        Reusable_Actions_Loggers.mouseHover(driver,"//*[@id= 'nav-bar-insurance']",logger,"Insurance");
        //click on home insurance
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='Home Insurance']",logger,"Home Insurance");
        Thread.sleep(3000);
    }

    @Test (dependsOnMethods = "tc001_HomeInsurance")
    public void tc002_HomeOwnersInsurance(){
        //click on homeowners insurance
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='Homeowners Insurance']",logger,"Homeowner Insurance");
        //click on coverage option
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='Coverage Options']",logger,"Coverage");
        //click on discount option
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='Discounts']",logger,"Discount");

    }


}//End of java class
