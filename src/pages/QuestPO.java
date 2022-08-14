package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QuestPO {
    By questList = By.cssSelector(".infinite-scroll-component__outerdiv");
    By header = By.xpath("//p[text()='Looking for']");

    public WebElement questList(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(header));
        return driver.findElement(questList);

    }

}
