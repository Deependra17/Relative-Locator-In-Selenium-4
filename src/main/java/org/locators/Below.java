package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Below {
    WebDriver driver= new ChromeDriver();
    public void below(){
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        WebElement emailField = driver.findElement(By.id("input-email"));
        emailField.sendKeys("Deepe12n@gmail.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement password= driver.findElement(with(By.tagName("input")).below(emailField));
        password.sendKeys("1234");
    }

    public static void main(String[] args) {
        Below blo= new Below();
        blo.below();
    }
    System.out.println("Test Passed Successfully..")
}
