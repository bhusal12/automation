import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodoAutomate {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // Going to website
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");
        // Write value to textbox

        WebElement box = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));

        String []  todoWorks = {"Get Up", "Code", "Sleep"};
        for(String i: todoWorks){
            box.sendKeys(i);
            box.sendKeys(Keys.ENTER);
        }

    }
}
