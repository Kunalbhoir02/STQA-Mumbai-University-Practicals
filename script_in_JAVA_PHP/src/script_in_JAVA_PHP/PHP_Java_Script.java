package script_in_JAVA_PHP;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PHP_Java_Script {

    public static void main(String[] args) {

        // Set the path to the GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "D:\\STQA\\geckodriver.exe");
        WebDriver driver = null;

        try {
            // Initialize FirefoxDriver
            driver = new FirefoxDriver();
            
            // Navigate to the URL and maximize the browser window
            driver.navigate().to("https://demoqa.com/automation-practice-form");
            driver.manage().window().maximize();

            // Add sleep to slow down the execution
            Thread.sleep(2000); // Wait for 2 seconds to allow the page to load

            // Enter first name
            WebElement first_name = driver.findElement(By.id("firstName"));
            first_name.sendKeys("kunal");

            // Enter last name
            WebElement last_name = driver.findElement(By.id("lastName"));
            last_name.sendKeys("bhoir");

            // Enter email
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("bhoirkunal0545@gmail.com");

            // Select gender (Male, using JavaScript click)
            WebElement genderMale = driver.findElement(By.id("gender-radio-1"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", genderMale);

            // Enter phone number
            WebElement phone = driver.findElement(By.id("userNumber"));
            phone.sendKeys("2354763498");

            // Enter date of birth
            WebElement birthdate = driver.findElement(By.id("dateOfBirthInput"));
            birthdate.sendKeys("08 Sep 2004");

            // Select hobbies (using JavaScript click)
            WebElement hobbies = driver.findElement(By.id("hobbies-checkbox-2"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbies);

            // Enter address
            WebElement address = driver.findElement(By.id("currentAddress"));
            address.sendKeys("panvel");

            // Scroll the state dropdown into view and click it
            WebElement stateDropdown = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stateDropdown);
            stateDropdown.click();

            // Select the desired state option
            WebElement stateOption = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
            stateOption.click();
            
            // Add sleep before submitting the form
            Thread.sleep(2000); // Wait for 2 seconds before submitting

            // Click the submit button (using JavaScript click)
            WebElement submitButton = driver.findElement(By.id("submit"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);

            // Wait for the confirmation message to appear
            Thread.sleep(3000); // Wait for 3 seconds after submitting the form

            // Verify if the form submission was successful by checking for the confirmation message
            WebElement confirmationMessage = driver.findElement(By.xpath("//*[@id=\"example-modal-sizes-title-lg\"]"));
            if (confirmationMessage.isDisplayed()) {
                System.out.println("Test Passed: The form was submitted successfully.");
            } else {
                System.out.println("Test Failed: The form submission failed.");
            }

            // Add sleep to allow you to see the confirmation
            Thread.sleep(5000); // Wait for 5 seconds before closing the browser

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Quit the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
