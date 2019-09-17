import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowsers {
    public static void main(String[] args) {


    }

    public static void chrome() {
        System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
    }

    public static void fireFox() {
        System.setProperty("webdriver.gecko.driver", "/Users/vahit.peker/Desktop/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.na.edu");
    }
}