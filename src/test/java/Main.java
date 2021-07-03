import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Acceder a las propiedades por medio de la ruta del .exe
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        //Iniciar e instanciar el webdriver
        WebDriver driver = new ChromeDriver();
        //abrir el driver y la pagina que le solicitamos
        driver.get("https://www.amazon.com");
        //identificar y escribir en la barra de busqueda
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("google home mini");
        //Le daremos enviar o submit, que replica un click y el cual es usado en formularios
        driver.findElement(By.id("nav-search-submit-button")).submit();
        //Esperamos 2 seg
        Thread.sleep(2000);
        //Filtrar por mas barato
        driver.findElement(By.id("a-autoid-0-announce")).click();

        //Esperamos 1 seg
        Thread.sleep(1000);

        driver.findElement(By.id("s-result-sort-select_1")).click();
        //Esperamos 1 seg
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71YL4zkpNVL._AC_UY218_.jpg']")).click();
        //Esperamos 1 seg
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-button")).click();
        //Esperamos 1 seg
        Thread.sleep(2000);
        //Ir al carrito
        driver.findElement(By.id("hlb-view-cart-announce")).click();
        //Esperamos 1 seg
        Thread.sleep(2000);
        //Eliminar articulo
        driver.findElement(By.id("a-autoid-0-announce")).click();
        //Esperamos 1 seg
        Thread.sleep(1000);
        driver.findElement(By.id("dropdown1_0")).click();
        Thread.sleep(2000);
        //registrarse
        driver.findElement(By.xpath("//*[@class='a-button a-button-primary']/span/a")).click();
        Thread.sleep(2000);
        //ingresar correo
        driver.findElement(By.name("email")).sendKeys("Estonoesuncorreo@Gmail.com");
        //Esperamos 1 seg
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='continue' and @class='a-button-input']")).click();
        driver.close();
    }
}