package be.lens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriveDemo {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver",System.getenv("WEBDRIVER_PATH")+"\\chromedriver_win32\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://www.pluralsight.com");
    }
}
