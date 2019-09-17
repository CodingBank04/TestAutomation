import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/vahit.peker/Desktop/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.com/");

    }
}
