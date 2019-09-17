import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebLocatorsId {

     static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        FireFox();
        driver.get("https://www.skyscanner.com");
        Thread.sleep(5000);
       // try { Thread.sleep(10000); }catch (Exception e){ }
        driver.findElement(By.id("fsc-origin-search")).clear();
        driver.findElement(By.id("fsc-origin-search")).sendKeys("Dallas");
        driver.findElement(By.id("fsc-destination-search")).sendKeys("Salt Lake City");



    }
    public static void FireFox(){
        System.setProperty("webdriver.gecko.driver", "/Users/vahit.peker/Desktop/geckodriver");
        driver = new FirefoxDriver();

    }

}
