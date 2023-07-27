package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Main {
    WebDriver driver= new ChromeDriver();
    public void below(){
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        WebElement emailField = driver.findElement(By.id("input-email"));
        emailField.sendKeys("Deepe12n@gmail.com");

        WebElement password= driver.findElement(with(By.tagName("input")).below(emailField));
        password.sendKeys("1234");
    }
    public void above(){
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("1234");

        WebElement email=driver.findElement(with(By.tagName("input")).above(password));
        email.sendKeys("deepen14@gmail.com");
    }
    public void toNear(){

    }

    public static void main(String[] args) throws InterruptedException {
        Main locator= new Main();
        locator.below();
        Thread.sleep(3000);
        locator.above();
    }
}