import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    private String field1 = "";
    public Main(String name) {
        this.field1 = name;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
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
