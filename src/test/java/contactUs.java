import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class contactUs {
    @Test
    public static void Order() throws AWTException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > " +
                "ul > li:nth-child(4) > a")).click();

                 // email
        WebElement email = driver.findElement(By.xpath("//body/section[@id='form']" +
                "/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]"));

        email.sendKeys("sds@gtfd.com");

                // password

        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("1234");

                // button
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        button.click();

        WebElement contact = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1" +
                "]/div[2]/div[1]/ul[1]/li[9]/a[1]"));
        contact.click();

                // nameField
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("John");

                // mail
        WebElement mail = driver.findElement(By.name("email"));
        mail.sendKeys("asd@asd.com");

                // subject
        WebElement subject = driver.findElement(By.name("subject"));
        subject.sendKeys("regarding");

                // text
        WebElement message = driver.findElement(By.id("message"));
        message.sendKeys("New test in form");

                // submitButton
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();

        Alert aler = driver.switchTo().alert();
        aler.accept();













    }
}
