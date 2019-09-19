package be.lens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckBoxes {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:63342/WebDriverDemoSolution/src/main/webapp/CheckBoxesTest.html?_ijt=3g0jb5pskhgukh2f84c4e30voa");
        WebElement checkboxWebElement = webDriver.findElement(By.id("lettuceCheckbox"));
        checkboxWebElement.click();
        checkboxWebElement.click();
    }
}
