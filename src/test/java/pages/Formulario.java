package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class Formulario extends Utils {

    WebDriver driver;

    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");

    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");

    private By email_field = By.id("email");
    private By password_field = By.id("passwd");

    private By select_days_field = By.id("days");
    private By select_months_field = By.id("months");
    private By select_years_field = By.id("years");

    private By address_field = By.id("address1");
    private By city_field = By.id("city");
    private By state_field = By.id("id_state");

    private By postcode_field = By.id("postcode");
    private By phone_mobile_field = By.id("phone_mobile");

    private By submit_field = By.id("submitAccount");

    public Formulario(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle (Integer type) {
        esperarElemento(titleM,20);
        if(type == 1){
            driver.findElement(titleM).click();
        }else if(type == 2){
            driver.findElement(titleF).click();
        }
    }

    public void preencheNome(String nome) {
        esperarElemento(first_name_field,5);
        driver.findElement(first_name_field).sendKeys(nome);
    }

    public void preencheSobrenome(String sobrenome) {
        esperarElemento(last_name_field,5);
        driver.findElement(last_name_field).sendKeys(sobrenome);
    }

    public void clickEmail(){
        esperarElemento(email_field,5);
        driver.findElement(email_field).click();
    }

    public void preencheSenha(String senha) {
        esperarElemento(password_field,5);
        driver.findElement(password_field).sendKeys(senha);
    }

    public void selecionaAniversario(Integer days, Integer months, String years) {
        Select select_days = new Select(driver.findElement(select_days_field));
        select_days.selectByIndex(days);

        Select select_months = new Select(driver.findElement(select_months_field));
        select_months.selectByIndex(months);

        Select select_years = new Select(driver.findElement(select_years_field));
        select_years.selectByValue(years);
    }

    public void preencheEndereco(String endereco) {
        esperarElemento(address_field,20);
        driver.findElement(address_field).sendKeys(endereco);
    }

    public void preencheCidade(String cidade) {
        esperarElemento(city_field,20);
        driver.findElement(city_field).sendKeys(cidade);
    }

    public void selecionaEstado(String state) {
        Select select_state = new Select(driver.findElement(state_field));
        select_state.selectByVisibleText(state);
    }

    public void preencheCep(String cep) {
        driver.findElement(postcode_field).sendKeys(cep);
    }

    public void preencheCelular(String celular) {
        driver.findElement(phone_mobile_field).sendKeys(celular);
    }

    public void clickConfirma(){
        driver.findElement(submit_field).click();
        String titulo = driver.findElement(By.cssSelector(".row > div > h1")).getText();
        Assert.assertEquals("O título está certo!", "MY ACCOUNT", titulo);
    }

}
