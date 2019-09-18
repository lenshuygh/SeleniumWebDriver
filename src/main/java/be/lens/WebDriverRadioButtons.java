package be.lens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverRadioButtons {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:63342/WebDriverDemoSolution/src/main/webapp/RadioButtonTest.html?_ijt=bufvv7jvld0jmkueqaj4uedgdt");
        List<WebElement> radioButtons = webDriver.findElements(By.name("color"));
        radioButtons.get(1).click();

        for (WebElement radioButton : radioButtons) {
            if(radioButton.isSelected()){
                System.out.println(radioButton.getAttribute("value"));
            }
        }
    }
}
