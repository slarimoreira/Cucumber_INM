package br.com.inmetrics.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.inmetrics.core.DriverFactory;
import br.com.inmetrics.page.LoginPage;
import br.com.inmetrics.page.SuccessLogin;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
	
	private LoginPage loginPage;
	private SuccessLogin successLogin;
	
	
	@Given("que eu tenha acesso ao sistema")
	public void queEuTenhaAcessoAoSistema() {
		DriverFactory.getDriver().get(DriverFactory.url);
	}
	@And("informar meu usuario {string}")
	public void informarMeuUsuario(String string) {
		loginPage = new LoginPage();
		loginPage.setUsername(string);
	}
	@And("informar minha senha {string}")
	public void informarMinhaSenha(String string) {
		loginPage.setPassaword(string);
	}
	@And("clicar no botao entre")
	public void clicarNoBotaoEntre() {
		loginPage.setBtnSubmit();
	}
	@Then("deve abrir a pagina de sucesso de login")
	public void deveAbrirAPaginaDeSucessoDeLogin() {
		
		successLogin = new SuccessLogin();
		
		assertEquals("Logged In Successfully", successLogin.getSuccessfully());
	}
	
	@Then("o sistema retonara uma mensagem {string}")
	public void oSistemaRetonaraUmaMensagem(String string) throws InterruptedException {
		Thread.sleep(3000);
		assertEquals(string, loginPage.getMessageError());
	}
	
	@After
	public void encerrar() {
		DriverFactory.quitDriver();
	}
}
