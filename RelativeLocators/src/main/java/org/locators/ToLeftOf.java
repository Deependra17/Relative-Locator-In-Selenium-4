package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ToLeftOf {
    WebDriver driver= new ChromeDriver();

    public void toLeftOf(){
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement loginButton= driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[12]/div[1]/button[2]"));
        System.out.println("test print  ");

        String submitButton= String.valueOf(driver.findElement(with(By.tagName("button")).toLeftOf(loginButton)));
        System.out.println(submitButton);
    }

    public static void main(String[] args) {
        ToLeftOf element= new ToLeftOf();
        element.toLeftOf();
    }
}
