package practicals.Practicals;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practical_11 {
    public static void main(String[] args) {
        // Set the path for the GeckoDriver
        System.setProperty("webdriver.gecko.driver", "D:\\STQA\\geckodriver.exe");
        
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        
        try {
            // Navigate to the Cars HTML file
            driver.navigate().to("file:///D:\\STQA/Cars.html");
            driver.manage().window().maximize();
            
            // Wait for the page to load
            Thread.sleep(3000); // Pause for 3 seconds
            
            // Interact with the combo box
            Select comboBox = new Select(driver.findElement(By.id("cars")));
            List<WebElement> options = comboBox.getOptions();
            System.out.println("Number of items in the combo box: " + options.size());

            // Print each option in the combo box
            for (WebElement option : options) {
                System.out.println("Option: " + option.getText());
            }
            
            // Print the selected option
            System.out.println("Selected option: " + comboBox.getFirstSelectedOption().getText());
            System.out.println("Test executed successfully.....");
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for exceptions
        } finally {
            driver.quit(); // Close the browser
        }
    }
}
