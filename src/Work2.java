import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work2 {
    public static void main(String[] args) throws InterruptedException {
//*[@id="body-inner"]/div[1]/h3/a
        System.setProperty("webdriver.chrome.driver", "C:/mydriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/");

                driver.switchTo().frame("ourframe");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/a")).click();


        driver.switchTo().defaultContent();
        WebElement num1 = driver.findElement(By.name("first_name"));
        WebElement num2 = driver.findElement(By.id("num2"));

        num1.sendKeys("13");
        num2.sendKeys("2");



        WebElement button = driver.findElement(By.xpath("/html/body/div/button"));

        button.click();

        WebElement result = driver.findElement(By.id("result"));

        String text = result.getText();
        System.out.println(text);
    }
}