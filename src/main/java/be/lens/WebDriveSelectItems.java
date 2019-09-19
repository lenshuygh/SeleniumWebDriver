package be.lens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriveSelectItems {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:63342/WebDriverDemoSolution/src/main/webapp/SelectItemsTest.html?_ijt=97q8ompck4rvu7vudmrokm40hq");
        WebElement selectWebElement = webDriver.findElement(By.id("select1"));
        //wrapperClass
        Select select = new Select(selectWebElement);
        select.selectByVisibleText("Maybe");
    }
}
