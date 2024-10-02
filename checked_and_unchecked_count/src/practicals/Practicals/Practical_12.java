package practicals.Practicals;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practical_12 {
    public static void main(String[] args) {
        // Set GeckoDriver path and initialize driver
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        try {
            // Load Checkbox HTML and maximize window
            driver.navigate().to("file:///D:\\TYCS 2024-25\\Practicals TYCS MU\\STQA\\Checkbox.html");
            driver.manage().window().maximize();
            Thread.sleep(3500); // Wait for the page to load
            
            // Count checkboxes
            List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
            int checkedCount = 0, uncheckedCount = 0;

            for (WebElement checkBox : checkBoxes) {
                if ("checkbox".equals(checkBox.getAttribute("type"))) {
                    boolean isChecked = checkBox.isSelected();
                    System.out.println("Checkbox " + checkBox.getAttribute("id") + (isChecked ? " is selected" : " is not selected"));
                    if (isChecked) checkedCount++; else uncheckedCount++;
                }
            }

            // Print results
            System.out.println("Selected: " + checkedCount + ", Unselected: " + uncheckedCount);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // Close the driver
        }
    }
}
