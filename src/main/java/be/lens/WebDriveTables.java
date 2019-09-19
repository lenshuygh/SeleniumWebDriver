package be.lens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriveTables {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:63342/WebDriverDemoSolution/src/main/webapp/TableTest.html?_ijt=ldq5tnhehflfrfi1l8ou0cj829");

        /*WebElement outerTableWebElement = webDriver.findElement(By.tagName("table"));
        WebElement innerTableWebElement = outerTableWebElement.findElement(By.tagName("table"));
        WebElement rowWebElement = innerTableWebElement.findElements(By.tagName("td")).get(1);
        System.out.println(rowWebElement.getText());*/

        //      /html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td

        WebElement rowWebElement = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
        System.out.println(rowWebElement.getText());
    }
}
