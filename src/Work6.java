import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Work6{
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
        driver.get("https://www.justwatch.com/");



        WebElement africa = driver.findElement(By.xpath("//*[@id=\"base\"]/div/div/div/div[2]/div[5]/div/div[2]/div[4]/div"));


            List<WebElement> items = africa.findElements(By.tagName("a"));

            for (WebElement a: items) {
            System.out.println(a.getText());
        }



    }
}
