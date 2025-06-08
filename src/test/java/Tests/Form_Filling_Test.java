package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Browser;

public class Form_Filling_Test extends Browser {

    @Test
    public void testEnterTextInDemoForm() throws InterruptedException {
        driver.findElement(By.id("FirstName")).sendKeys("Rahul Gupta");
        Thread.sleep(1000);

        driver.findElement(By.name("Email")).sendKeys("rahulbhai@gmail.com");

        driver.findElement(By.name("Phone")).sendKeys("1234567890");
    }
}