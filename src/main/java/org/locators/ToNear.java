package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ToNear {
    WebDriver driver= new ChromeDriver();
    public void toNear(){
        driver.get("http://omayo.blogspot.com/");
        WebElement LoginButton=driver.findElement(By.id("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[12]/div[1]/button[2]"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement Submit=driver.findElement(with(By.tagName("button")).near(LoginButton));
        Submit.click();
    }

    public static void main(String[] args) {
        ToNear near= new ToNear();
        near.toNear();
    }
}
