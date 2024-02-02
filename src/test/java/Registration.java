import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {
    @Test
    public void openAutomationURL(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > " +
                "ul > li:nth-child(4) > a")).click();

                //username
        WebElement userName = driver.findElement(By.name("name"));

                // email
        WebElement email = driver.findElement(By.xpath("//body/section[@id='" +
                "form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]"));
        userName.sendKeys("gf");
        email.sendKeys("sds@gtfd.com");

                // button
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
                button.click();

                // password

        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("1234");

                // first name
        WebElement firstName = driver.findElement(By.id("first_name"));
                firstName.sendKeys("bfgt");

                // last name
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("grf");

               // address
        WebElement address = driver.findElement(By.id("address1"));
        address.sendKeys("port");

                // dropdown
        WebElement drpDown = driver.findElement(By.name("country"));
        Select select = new Select(drpDown);
        select.selectByValue("Canada");

              // State

        WebElement state = driver.findElement(By.id("state"));
        state.sendKeys("varna");

             // city
        WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("varna");


            // Zipcode

        WebElement zipcode = driver.findElement(By.id("zipcode"));
        zipcode.sendKeys("9000");

          // mobilePhone

        WebElement phone = driver.findElement(By.name("mobile_number"));
        phone.sendKeys("08956324");

        //createAccountButton

        WebElement button1 = driver.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
        button1.click();











    }
}

