package test.sampleCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.QuestPO;

import java.time.Duration;

public class TestValidationQuest {
    WebDriver driver;
    QuestPO questPOPage;

    @BeforeClass
    public void setup(){
        //use FF Driver
        questPOPage = new QuestPO();;
        System.setProperty("webdriver.chrome.driver", "/Users/lbhatt/Desktop/nbyula/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://nbl.one");
    }

    @Test
    public void validationQuestList() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertNotNull(questPOPage.questList(driver).getSize(),"there is at least 1 quest.");
    }

    @AfterClass
    public void cleanup(){
        driver.quit();
    }
}
