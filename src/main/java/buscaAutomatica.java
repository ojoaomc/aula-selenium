import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buscaAutomatica {
    public static void main(String[] args) {
        // Caminho automático para o driver do Chrome (requer ChromeDriver instalado e no PATH)
        WebDriver driver = new ChromeDriver();

        try {
            // Abre o Bing
            driver.get("https://www.bing.com/?cc=br");

            // Encontra o campo de busca
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Hello World");
            searchBox.submit();

            // Aguarda 10 segundos
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}