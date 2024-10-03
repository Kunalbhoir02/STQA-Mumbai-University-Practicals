package practicals.Practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practical_6 {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\STQA\\geckodriver.exe");
        WebDriver driver = null;

        try {
            // Step 1: Initialize FirefoxDriver
            driver = new FirefoxDriver();

            // Step 2: Navigate to the URL
            driver.navigate().to("https://demoqa.com/automation-practice-form");
            driver.manage().window().maximize();

            // Step 3: Fill out the form fields

            // Enter first name
            WebElement first_name = driver.findElement(By.id("firstName"));
            first_name.sendKeys("Kunal");

            // Enter last name
            WebElement last_name = driver.findElement(By.id("lastName"));
            last_name.sendKeys("Bhoir");

            // Enter email
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("kunalbhoir02@gmail.com");

            // Select gender
            WebElement genderFemale = driver.findElement(By.id("gender-radio-1"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", gendermale);

            // Enter phone number
            WebElement phone = driver.findElement(By.id("userNumber"));
            phone.sendKeys("2354763498");

            // Enter date of birth
            WebElement birthdate = driver.findElement(By.id("dateOfBirthInput"));
            birthdate.sendKeys("30 Sep 2002");

            // Select hobbies
            WebElement hobbies = driver.findElement(By.id("hobbies-checkbox-2"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbies);

            // Enter address
            WebElement address = driver.findElement(By.id("currentAddress"));
            address.sendKeys("panvel");

            // Scroll to the state dropdown and click it
            WebElement stateDropdown = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stateDropdown);
            stateDropdown.click();

            // Select the state option
            WebElement stateOption = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
            stateOption.click();

            // Click the submit button
            WebElement submitButton = driver.findElement(By.id("submit"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton); // Click using JS

            // Test if the confirmation message is displayed
            WebElement confirmationMessage = driver.findElement(By.xpath("//*[@id=\"example-modal-sizes-title-lg\"]"));
            if (confirmationMessage.isDisplayed()) {
                System.out.println("Test Passed: The form was submitted successfully.");
            } else {
                System.out.println("Test Failed: The form submission failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
