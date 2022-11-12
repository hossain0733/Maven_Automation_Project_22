package Reuseable_Liberary;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.ArrayList;

public class Reusable_Actions_Loggers {
    public static WebDriver setUpDriver() {
        //set up your chromedriver with web-driver-manager
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add options for maximizing the Chrome window
        options.addArguments("start-maximized");
        //initialize driver with chrome options
        WebDriver driver = new ChromeDriver(options);
        return driver;

    }//end of setup driver method

    public static void clickAction(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            element.click();
            logger.log(LogStatus.PASS, "Successfully clicked on" + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element: " + elementName + " for reason: " + e);
            logger.log(LogStatus.FAIL,"Unable to click on element:" + elementName + " for reason:" + e);
            getScreenShot(driver, elementName, logger);

        }
    }

    public static void clickActionByIndex(WebDriver driver, String xpath, int index, ExtentTest logger,String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).click();
            logger.log(LogStatus.PASS,"Successfully clickByIndex on" + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element: " + elementName + " for reason: " + e);
            logger.log(LogStatus.FAIL,"Unable to click on element: " + elementName + " for reason: " + e);
            getScreenShot(driver, elementName, logger);

        }
    }

    public static void mouseHover(WebDriver driver, String xpath,ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //declare mouse actions
        Actions actions = new Actions(driver);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            actions.moveToElement(element).perform();
            logger.log(LogStatus.PASS,"Successfully hover cursor on" + elementName);
        } catch (Exception e) {
            System.out.println("Unable to hover to element: " + elementName + " for reason: " + e);
            logger.log(LogStatus.FAIL,"Unable to hover to element: " + elementName + " for reason: " + e);
            getScreenShot(driver, elementName, logger);

        }
    }

    public static void sendKeysAction(WebDriver driver, String xpath, String userInput, ExtentTest logger,String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            element.sendKeys(userInput);
            logger.log(LogStatus.PASS,"Successfully send keys to " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to send keys to : " + elementName + " for reason: " + e);
            logger.log(LogStatus.FAIL,"Unable to send keys to : " + elementName + " for reason: " + e);
            getScreenShot(driver, elementName, logger);

        }
    }

    public static String getTextAction(WebDriver driver, String xpath, ExtentTest logger,String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String textOutput = "";
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            textOutput = element.getText();
            logger.log(LogStatus.PASS,"Successfully get text from " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to get text for : " + elementName + " for reason: " + e);
            logger.log(LogStatus.FAIL,"Unable to get text for : " + elementName + " for reason: " + e);
            getScreenShot(driver, elementName, logger);

        }
        return textOutput;
    }

    public static void submitAction(WebDriver driver, String xpath, ExtentTest logger,String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            element.submit();
            logger.log(LogStatus.PASS,"successfully submit " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on element: " + elementName + " for reason: " + e);
            logger.log(LogStatus.FAIL,"Unable to submit on element: " + elementName + " for reason: " + e);
            getScreenShot(driver, elementName, logger);

        }
    }//end of submit action

    public static void selectByText(WebDriver driver, String xpath, String userInput,ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try{
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select dropDown = new Select(element);
            dropDown.selectByVisibleText(userInput);
            logger.log(LogStatus.PASS,"Successfully selected " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to get dropdown : " + elementName + "for reason: " + e);
            logger.log(LogStatus.FAIL,"Unable to get dropdown : " + elementName + "for reason: " + e);
            getScreenShot(driver, elementName, logger);

        }
    }//end of select by text.

    public static void switchToTabByIndex(WebDriver driver, int userInput){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(userInput));
    }//end of switchToTabByIndex

    public static void scrollByView(WebDriver driver, String xpath, ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            JavascriptExecutor jse = (JavascriptExecutor) driver;

            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

            jse.executeScript("arguments[0].scrollIntoView(true);", element);
            logger.log(LogStatus.PASS,"Successfully scroll to view" + elementName);
        }catch (Exception e){
            System.out.println("unable to scroll to : " + elementName + "for reason: " + e);
            logger.log(LogStatus.FAIL,"unable to scroll to : " + elementName + "for reason: " + e);
            getScreenShot(driver, elementName, logger);

        }
    }//end of scrollByView

    public static void getScreenShot(WebDriver driver, String imageName, ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT!!!");
            e.printStackTrace();
        }
    }//end of getScreenshot method

    public static void compareExpectedAndActualText(String expectedText, String actualText, ExtentTest logger) {
        if (actualText.equals(expectedText)) {
            logger.log(LogStatus.PASS, "Expected Text: " + expectedText + " and Actual Text: " + actualText + " match");
        }
        else{
            logger.log(LogStatus.FAIL, "Expected Text: " + expectedText + " and Actual Text: " + actualText + " does not match");
        }
    }//end of compareExpectedAndActualText


}
