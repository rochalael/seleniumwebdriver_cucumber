package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import pages.Formulario;
import runner.RunCucumberTest;

public class Cadastro extends RunCucumberTest {

    Formulario formulario = new Formulario(driver);

    @E("^preencher todos os campos obrigatórios$")
    public void preencheCampos() {
        formulario.selectTitle(1);
        formulario.preencheNome("Automation");
        formulario.preencheSobrenome("Selenium");
        formulario.clickEmail();
        formulario.preencheSenha("Automation6363");
        formulario.selecionaAniversario(15,3,"1985");
        formulario.preencheEndereco("Rua do Alaska");
        formulario.preencheCidade("Juneau");
        formulario.preencheCep("99802");
        formulario.preencheCelular("14083219987");
        formulario.selecionaEstado("Alaska");
    }

    @Então("^ao confirmar o cadastro serei direcionado para o menu do usuário$")
    public void confirmaCadastro() {
        formulario.clickConfirma();
    }

}
