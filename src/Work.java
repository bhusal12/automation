import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Work {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dart-tutorial.com");
                Thread.sleep(2000);
        WebElement hig = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[2]/a"));
        hig.click();
        Thread.sleep(2000);
        driver.navigate().back();
    }
}
// OPEN dart-tutorial.com wait for 2 second, click conditions and loop, wait for 2 second and
// go back [2 min]
