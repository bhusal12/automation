import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/driver/chromedriver.exe");
   WebDriver b=new ChromeDriver();
   b.get("https://www.amazon.com/");
    }
}
