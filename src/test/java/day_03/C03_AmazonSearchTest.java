package day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C03_AmazonSearchTest {

    public static void main(String[] args) {
        /*
       1. Bir class oluşturun : AmazonSearchTest
       2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
       a. web sayfasına gidin. https://www. amazon.com/
       b. Search(ara) “city bike”
       c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
       e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        */

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //web sayfasına gidin. https://www. amazon.com/
        driver.get("https://amazon.com");


        //Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("city bike", Keys.ENTER);


        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));

        String sonucYazisi = aramaSonucu.get(0).getText();
        System.out.println(sonucYazisi);


        //Sadece sonuc yazisini yazdirin
        String[] sonucYazisiE = sonucYazisi.split(" ");
        System.out.println("City bike arama sonucu: " + sonucYazisiE[2]);


        //Sonuc yazisini Lambda ile yapin
        Arrays.stream(sonucYazisi.split(" ")).limit(3).skip(2).forEach(System.out::println);


        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> ilkResim = driver.findElements(By.className("s-image"));
        WebElement ilkResimWE = ilkResim.get(0);
        ilkResimWE.click();



        driver.close();

    }
}
