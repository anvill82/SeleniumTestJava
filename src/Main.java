import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public Main() {
    }

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("Success!");

        driver.quit();

    }
}
