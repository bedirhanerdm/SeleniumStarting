package day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_CssSelector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        Thread.sleep(1000);



        // b. Locate email textbox
        WebElement emailTextBox = driver.findElement(By.cssSelector("#session_email"));



        // c. Locate password textbox ve
        WebElement passwordTextBox = driver.findElement(By.cssSelector("#session_password"));



        // d. Locate signin button
        WebElement signInButton = driver.findElement(By.cssSelector("input[name='commit']"));



        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // Username : testtechproed@gmail.com          Password : Test1234!
        // NOT: cssSelector kullanarak elementleri locate ediniz.
        emailTextBox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(1000);

        passwordTextBox.sendKeys("Test1234!");
        Thread.sleep(1000);

        signInButton.click();



        Thread.sleep(2000);
        driver.close();

    }
}
