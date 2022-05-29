package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import pages.Autenticacao;
import runner.RunCucumberTest;

public class Login extends RunCucumberTest {

    Autenticacao autenticacao = new Autenticacao(driver);
    @Dado("^que acessei a página de autenticacao$")
    public void acessaPagina() {
        autenticacao.acessarTela();
    }

    @Quando("^informar o e-mail$")
    public void informaeMail() {
        autenticacao.acessarCampo();
    }

    @E("^clicar em registrar$")
    public void clickRegistrar() {
        autenticacao.clickBotao();
    }
}
