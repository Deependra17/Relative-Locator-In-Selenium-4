package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ToAbove {
    WebDriver driver= new ChromeDriver();
    public void above(){
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("1234");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement email=driver.findElement(with(By.tagName("input")).above(password));
        email.sendKeys("deepen14@gmail.com");
    }

    public static void main(String[] args) {
        ToAbove avb= new ToAbove();
        avb.above();
    }
}
