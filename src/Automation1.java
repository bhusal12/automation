import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Automation1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Accordion/index.html");

        WebElement a=driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
        a.click();
        WebElement b=driver.findElement(By.xpath("//*[@id=\"manual-testing-description\"]/p"));
        System.out.println(b.getText());


    }
}
