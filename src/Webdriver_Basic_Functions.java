import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Basic_Functions {
    public static void main(String[] args) {
        // Step 2 ; give the path of chrome driver so that the program will now where  the browser driver is;
        // for this we will use system.propeties in java
        System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");

        // step 1; lets createa sample of our selenum webdriver class
        WebDriver driver = new ChromeDriver();

        // step 3 ; lets navigate to a Url by using method . do not for forget to put "https...
        driver.get("https://www.google.com");

        System.out.println("the title of page :" + driver.getTitle());
        driver.navigate().to("https://www.facebook.com");
         driver.navigate().back();
        driver.navigate().forward();
        System.out.println(driver.getPageSource());
        driver.close();

    }
}
