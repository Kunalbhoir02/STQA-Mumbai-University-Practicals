package practicals; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practical_5 { 
    public static void main(String[] args) {
        // Set the path for GeckoDriver
        System.setProperty("webdriver.gecko.driver", "D:\\STQA\\geckodriver.exe"); // Update path if needed

        // Initialize FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the website
        driver.navigate().to("https://cardetailing.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Optional: Close the browser after the test
        // driver.quit(); // Uncomment to close the browser
    }
}
