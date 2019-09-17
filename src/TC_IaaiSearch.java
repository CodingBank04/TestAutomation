import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_IaaiSearch {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        chromeInvocation();
        driver.get("https://www.iaai.com");
        Thread.sleep(2000);
        driver.findElement(By.id("txtSearch")).sendKeys("Lexus");
        Thread.sleep(2000);
        driver.findElement(By.id("txtSearch")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("txtSearch")).getAttribute("placeholder");

        System.out.println(driver.findElement(By.id("txtSearch")).getAttribute("placeholder"));

        driver.navigate().to("https://wwww.amazon.com");




    }

    public static void chromeInvocation() {
        System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");
        driver = new ChromeDriver();

    }
}