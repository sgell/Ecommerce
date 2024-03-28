import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login{
@Test
    public static void loginn(){
        
    String expectedTitle = "Automation Exercise";
    WebDriver driver= new ChromeDriver();
    driver.get("https://automationexercise.com/");
    String actualTitle = driver.getTitle();

     Assert.assertEquals(actualTitle,expectedTitle);   

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




}



}
