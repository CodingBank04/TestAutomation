import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUrl {
         public static WebDriver driver;
        // public static String url = "https://www.amazon.com";
         public static void main(String[] args) {
             String url="https://www.amazon.com";
        chrome(url);
        boolean result=urlValidation(url);
        System.out.println("Validation:" + result);
    }
     /// invoke the chrome browser
        public static void chrome(String url) {
            System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");
            driver = new ChromeDriver();
            driver.get(url);
        }


            // Returns if the current url and requested url are the same
        public static boolean urlValidation(String url)
        {
            //System.out.println("Current Url" + driver.getCurrentUrl());
            //System.out.println("Requested Url" + url);
            //this returns if the current url and requested url are the same
            return url.equals(driver.getCurrentUrl());

           /* if(url.equals(driver.getCurrentUrl())){
                return true;

            }
            else {
                return false;

            */
            }

    }


