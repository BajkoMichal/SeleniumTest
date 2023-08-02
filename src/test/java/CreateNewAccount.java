import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateNewAccount {

    private static WebDriver driver;
    String url = "https://skleptest.pl/";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chromedriver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
    @Test
    public void registerNewAccount() {
        driver.get(url);
        WebElement accountButton = driver.findElement(By.cssSelector("a[href='https://skleptest.pl/my-account/']"));
        accountButton.click();
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("test@test.com");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='reg_password']"));
        passwordInput.sendKeys("wsadwsad1234!");
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        registerButton.click();




    }
}
