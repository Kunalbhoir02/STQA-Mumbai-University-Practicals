package objects_total;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practical_10 {
    public static void main(String[] args) {
        // Set the path for the GeckoDriver
        System.setProperty("webdriver.gecko.driver", "D:\\STQA\\geckodriver.exe");
        
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        
        try {
            // Navigate to the YouTube trending page
            driver.navigate().to("https://www.youtube.com/feed/trending");
            driver.manage().window().maximize();
            
            // Pause for 5 seconds (5000 milliseconds)
            Thread.sleep(5000); // Add a delay of 5 seconds

            // Find all elements on the page
            java.util.List<WebElement> elements = driver.findElements(By.cssSelector("*"));
            
            // Print the total number of elements
            System.out.println("Page Url: https://www.youtube.com/feed/trending\nTotal number of objects on the page: " + elements.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the driver
            driver.quit();
        }
    }
}
