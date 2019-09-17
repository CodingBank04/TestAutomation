import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main
{
    public static WebDriver driver;
    public static String url="https://amazon.com";

    public static void main (String [] args) {
        //step 3 print the  result
        // step 4 code review  >> is there a better code?
        Firefox(url);
        System.out.println((isCurrentUrlTrue(url)));
    }
    // step 1 invoke the browser
    public static void Firefox(String url){
        System.setProperty("webdriver.gecko.driver", "/Users/vahit.peker/Desktop/geckodriver");
        driver=new FirefoxDriver();
        driver.get(url);


    }
    //step 2 is currentUrlTrue with the requested
    public static boolean isCurrentUrlTrue(String url) {
        Firefox(url);
        System.out.println("Sent Url: +" + url);
        System.out.println("Current url :" + driver.getCurrentUrl());
        return driver.getCurrentUrl().equals(url);
    }

}
