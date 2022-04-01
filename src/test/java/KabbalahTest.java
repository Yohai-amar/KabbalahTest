import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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
//                      טסט שפותח את דף השיעור היומי
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
//                             פתיחה למבוא לחכמת הקבלה דדרך הטאב
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

    //                     טסט לבדיקת העכבר כשהוא מרחף מעל הטאב והאם הוא מתחלף לטקסט

    @Test
    public void hoverMouse() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Help.HALEVROEESITE);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions action = new Actions(driver);
        WebElement masaBeIsrael = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Help.MASAINISRAELWINDOWCSS)));
        WebElement hasadna = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Help.HASADNAWINDOWCSS)));
        WebElement mashuKaze = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Help.MASHUKAZEWINDOWCSS)));
        WebElement integralEdu = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Help.HASADNAWINDOWCSS)));
        WebElement movieTrailer = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Help.MOVIETRAILERCSS)));
        WebElement madeInIsrael = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Help.MADEINISRAELWINDOWCSS)));
        WebElement studyKab = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Help.STUDYKABWINDOWCSS)));
        WebElement onlineVids = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Help.ONLINEVIDSWINDOWCSS)));
        WebElement innerView = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Help.INNERVIEWWINDOWCSS)));
        WebElement music = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Help.MUSICWINDOWCSS)));
        Thread.sleep(3000);
        action.moveToElement(masaBeIsrael).clickAndHold().build().perform();
        Thread.sleep(3000);
        action.moveToElement(hasadna).clickAndHold().build().perform();
        Thread.sleep(3000);
        action.moveToElement(mashuKaze).clickAndHold().build().perform();
        Thread.sleep(3000);
        action.moveToElement(integralEdu).clickAndHold().build().perform();
        Thread.sleep(3000);
        action.moveToElement(movieTrailer).clickAndHold().build().perform();
        Thread.sleep(3000);
        action.moveToElement(madeInIsrael).clickAndHold().build().perform();
        Thread.sleep(3000);
        action.moveToElement(studyKab).clickAndHold().build().perform();
        Thread.sleep(3000);
        action.moveToElement(onlineVids).clickAndHold().build().perform();
        Thread.sleep(3000);
        action.moveToElement(innerView).clickAndHold().build().perform();
        Thread.sleep(3000);
        action.moveToElement(music).clickAndHold().build().perform();
        Thread.sleep(3000);
        driver.quit();



    }



}
