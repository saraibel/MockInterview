package LearnCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    WebDriver driver;

    @BeforeMethod
    public void loadBrowser() {
        // Set the path to the chromedriver executable (download it from the ChromeDriver website)
        System.setProperty("webdriver.chrome.driver", "src/main/Driver/chromedriver");
        // Create a new instance of the ChromeDriver /create the driver object
        driver = new ChromeDriver();
        // Open a website (replace "https://www.example.com" with the desired URL)
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        // Perform further actions or tests here
        // Close the browser
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}