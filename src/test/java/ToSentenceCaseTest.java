import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToSentenceCaseTest {

    @Test
    public void testCapitalizeMyTitle_toSentenceCase() {
        final String xPath = "//textarea[@id='main_input']";

        final String expectedResult = new ToSentenceCase().toSentenceCase(TestData.TEST_SENTENCE);

        WebDriver driver = new ChromeDriver();

        driver.get(TestData.getURL());
        //textarea[@id='main_input']
        //textarea#main_input
       WebElement textarea = driver.findElement(By.xpath(xPath));
                textarea.sendKeys(TestData.TEST_SENTENCE);
        //button[@id='sentencecase']
        driver.findElement(By.id("sentencecase")).
                click();

        String actualResult =  textarea.getAttribute("value");

        driver.quit();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
