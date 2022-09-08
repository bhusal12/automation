import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class WindowWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/");

                driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"contact-us\"]")).click();

        ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement firstName= driver.findElement(By.name("first_name"));
        WebElement lastName= driver.findElement(By.name("last_name"));
        WebElement eMail= driver.findElement(By.name("email"));
        WebElement comments= driver.findElement(By.name("message"));

        firstName.sendKeys("kala");
        lastName.sendKeys("Bhusal");
        eMail.sendKeys("Kala@gmail.com");
        comments.sendKeys("hello");

        WebElement submit= driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.click();
        Thread.sleep(3000);

        driver.close();

        ArrayList<String>tabss=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabss.get(0));

        WebElement loginP= driver.findElement(By.xpath(" //*[@id=\"login-portal\"]"));
        loginP.click();

        ArrayList<String>tabs2=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        WebElement userName= driver.findElement(By.id("text"));
        WebElement password= driver.findElement(By.id("password"));
        WebElement logInButton= driver.findElement(By.id("login-button"));


        userName.sendKeys("webdriver");
        password.sendKeys("webdriver123");
        logInButton.click();
        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        driver.close();
    }
}