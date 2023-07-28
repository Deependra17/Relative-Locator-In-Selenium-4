package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ToNear {
    WebDriver driver= new ChromeDriver();
    public void toNear(){
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement searchButton=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[2]/div[1]/div/form/table/tbody/tr/td[2]/input"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement search=driver.findElement(with(By.tagName("input")).near(searchButton));
        search.sendKeys("Deepen");
    }

    public static void main(String[] args) {
        ToNear near= new ToNear();
        near.toNear();
    }
}
