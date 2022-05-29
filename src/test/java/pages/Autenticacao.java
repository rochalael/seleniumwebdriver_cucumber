package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class Autenticacao extends Utils {

    WebDriver driver;
    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");

    public Autenticacao(WebDriver driver) {
            this.driver = driver;
    }

    public void acessarTela() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        esperarElemento(create_email_field, 5);
    }

    public void acessarCampo() {
        driver.findElement(create_email_field).sendKeys(getRandomEmail());
    }

    public void clickBotao() {
        driver.findElement(create_email_button).click();
    }
}
