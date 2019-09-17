import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.Callable;

public class BrowserInvocations {

    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {

            Chrome();
            Firefox();



    }

    int j = 1;
        while(j<4) {
        Firefox();
        Chrome();
        j++;
    }

}
    //this method will invoke the chrome browser
    // Created By : me Date ......
    //Last Modified By: x
    public static void Chrome(){
        System.setProperty("webdriver.chrome.driver","/Users/vahit.peker/Desktop/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://syscanner.com");

    }
    public static void Firefox(){
        System.setProperty("webdriver.gecko.driver","/Users/vahit.peker/Desktop/geckodriver");
        WebDriver driver= new FirefoxDriver();
        driver.get("http://syscanner.com");

    }


}
