package be.lens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriveDemo {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver",System.getenv("WEBDRIVER_PATH")+"\\chromedriver_win32\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("http://www.google.com");

        //inputTextField -> <input class="gLFyf gsfi" ...
        WebElement searchFieldWebElement = webDriver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        searchFieldWebElement.sendKeys("Spotted Hyena");
        searchFieldWebElement.submit();

        //WebElement imagesLinkWebElement = webDriver.findElements(By.linkText("Afbeeldingen")).get(0);
        WebElement imagesLinkWebElement = webDriver.findElement(By.linkText("Afbeeldingen"));
        imagesLinkWebElement.click();

        WebElement imageWebElement = webDriver.findElements(By.cssSelector("a[class=rg_l]")).get(0);
        WebElement imageLinkWebElement = imageWebElement.findElements(By.tagName("img")).get(0);
        imageLinkWebElement.click();
    }
}
