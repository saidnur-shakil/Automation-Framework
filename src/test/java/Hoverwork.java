import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.HashMap;
import java.util.Map;

public class Hoverwork {
    public static WebDriver driver;
    @Test
    public void browser() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        Map<String, Object> profile = new HashMap<String, Object>();
        Map<String, Integer> contentSettings = new HashMap<String, Integer>();
        //0 - Default, 1 - Allow, 2 - Block
        contentSettings.put("notifications", 2);
        contentSettings.put("geolocation", 2);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
//
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);


        WebElement menuoption = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/ul/li[2]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuoption).perform();
        WebElement submenuoption = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/ul/li[2]/ul/li[4]/a"));
        actions.moveToElement(submenuoption).perform();
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/ul/li[2]/ul/li[4]/ul/li[1]/a")).click();
        Thread.sleep(2000);

        /*driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys("Saidnur");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name=\"name\"])[2]")).sendKeys("Shakil");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("saidnurshakil98@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("ssshakil98");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("ssshakil98");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
        //Thread.sleep(2000);*/


    }
}
