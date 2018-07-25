package com.KG.Support;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.*;
import java.io.*;
import java.util.*;
import static com.KG.Support.BaseClass.driver;
import static org.junit.Assert.*;

public class ElementUtils {


    private Properties prop;
    private FileInputStream fileInputStream;
    public String parentWindow;



    //click button with fluent wait
    public void clickBtn(By by) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
       try{element.click();}
       catch (Exception e){
           Thread.sleep(1000);
           element.click();
       }
    }
    public ElementUtils sendText(By by, String txt) {
        WebElement element = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(by));
        element.clear();
        element.sendKeys(txt);
        return this;
    }


    public String getTextOfElement(By by) {
        return driver.findElement(by).getText();

    }

    public void assertElementNotPresent(By by) {
        List<WebElement> element = driver.findElements(by);
        assertTrue(element.isEmpty());
    }

    public void assertURL(String expectedURL) {
        String actualURL = driver.getCurrentUrl();
        assertEquals(expectedURL, actualURL);
    }

    //explicit wait element to be present
    public void waitForElementVisible(By by) {
        new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public String pickAtRandomWithInRange(String[] lot) {
        String[] prefix = lot;
        Random random = new Random();
        String randomPick = prefix[random.nextInt(prefix.length)];
        return randomPick;

    }
    //get properties method
    public String getProperty(String key) {

        try {
            prop = new Properties();
            fileInputStream = new FileInputStream("src/test/Resources/config.properties");
            prop.load(fileInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
    public void selectByVisibleText(By by, String text) {
        WebElement element = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(by));
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void switchToNewWindow() {
        parentWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String windowHandle : handles) {;
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                driver.manage().window().maximize();

            }
        }
    }
    public void switchToPreviousWindow(int number) {
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(number));
    }


    //browser selector choose between chrome and phantomJS. specify the desired browser in the config.properties
    public WebDriver browser() {

        if (getProperty("browser").equalsIgnoreCase("chrome")) {
            ChromeDriverManager.getInstance().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-fullscreen");
            driver = new ChromeDriver();
        }

        return driver;
    }
    //screen capture upon failure. the images are stored under output folder. and also the report.html is a consolidated report of the results
    public void captureScreenShot(String screenShotName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./output/" + screenShotName + ".png"));
        System.out.println("screenShot taken");
    }
    public ElementUtils scrollToElement(By by)  {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }
    public void javaScriptExecutorClick(By by) {
        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        //arguments[0].scrollIntoView();
    }


}







