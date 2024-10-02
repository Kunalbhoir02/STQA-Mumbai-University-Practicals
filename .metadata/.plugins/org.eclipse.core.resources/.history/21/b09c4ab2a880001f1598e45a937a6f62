package login_a_specific_web_page7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class practical_7 {

    public static void main(String[] args) {
        // Set the path to the GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        WebDriver driver = null;

        try {
            // Initialize FirefoxDriver
            driver = new FirefoxDriver();
            driver.navigate().to("https://demo.guru99.com/Agile_Project/Agi_V1/");
            driver.manage().window().maximize();

            // Initialize WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Find user name and set
            WebElement textbox_username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("uid")));
            textbox_username.sendKeys("1303");

            // Find user password and set
            WebElement textbox_password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            textbox_password.sendKeys("Guru99");

            // Find submit button and click action on it
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnLogin")));
            loginButton.click();
         // Adding a sleep to wait for the login process
            Thread.sleep(2000); // Sleep for 2 seconds

            // Wait for the page to load and check if login was successful
            wait.until(ExpectedConditions.titleIs("Guru99 Bank Customer HomePage"));
            String expected_title = "Guru99 Bank Customer HomePage";
            String actual_title = driver.getTitle();

            if (expected_title.equals(actual_title)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Login Failed");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Ensure the browser is closed
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
