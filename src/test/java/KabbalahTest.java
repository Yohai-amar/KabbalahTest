import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class KabbalahTest {


    @BeforeClass
    public static void setupFirst(){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.safaridriver().setup();
    }

    @Test
    public void dailyLesson(){
        WebDriver driver = new ChromeDriver();
        driver.get(Help.KABBALAHMEDIASITE);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement dailyLessonBtn = wait.
                until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Help.DAILYLESSONCSS)));
        dailyLessonBtn.click();
        String newUrl = driver.getCurrentUrl();
        Assert.assertEquals(newUrl,Help.LATESTLESSONPAGE);
        driver.quit();
    }

    @Test
    public void openingWisdomTab(){
        WebDriver driver = new ChromeDriver();
        driver.get(Help.KABBALAHMEDIASITE);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement openingWisdomTab = wait.
                until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(Help.OPENINGWISDOMPICTXTLINK)));
        openingWisdomTab.click();
        String newUrl = driver.getCurrentUrl();
        Assert.assertEquals(newUrl,Help.OPENINGWISDOMPAGE);
        driver.quit();
    }
}
