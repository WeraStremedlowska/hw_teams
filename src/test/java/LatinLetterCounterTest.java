import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LatinLetterCounterTest {

    private static final String url = "https://involta.ru/tools/length-chars/";
    public static final String data = "Это мой Текст из русских слов и слова dot";

    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setUp() {

        driver.get(url);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testLatinLetterCounter() {
        driver.get(url);
        driver.manage().window().maximize();

        String expectedCount = String.valueOf(new LatinLetterCounter().countLatinLetters(data));

        sendText(data, TestData.INPUT_XPATH);
        clickButton(TestData.BUTTON_SUBMIT);

        String actualCount = getText(TestData.CSS_SELECTOR);

        Assert.assertEquals(actualCount, expectedCount);
    }

    private String getText(String locator) {
        By selector = By.cssSelector(locator);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        return element.getText();
    }

    private void clickButton(String locator) {
        By submit = By.xpath(locator);
        WebElement button = driver.findElement(submit);
        button.click();
    }

    private void sendText(String data, String locator) {
        By input = By.xpath(locator);
        WebElement textarea = driver.findElement(input);
        textarea.sendKeys(data);
    }
}
