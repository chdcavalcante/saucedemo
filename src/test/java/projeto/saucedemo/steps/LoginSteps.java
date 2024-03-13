package projeto.saucedemo.steps;

import static org.junit.Assert.assertEquals;
import static projeto.saucedemo.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.saucedemo.core.DriverFactory;
import projeto.saucedemo.pages.LoginPages;

public class LoginSteps {

	private LoginPages page;

	@Given("esteja na pagina de login")
	public void esteja_na_pagina_de_login() {
		getDriver().get("https://www.saucedemo.com/");
		page = new LoginPages();
	}

	@When("informo dados de login {string} {string}")
	public void informo_dados_de_login(String string, String string2) {
		page.setLogin(string);
		page.setPassword(string2);
	}

	@When("informo login {string}")
	public void informo_login(String string) {
		page.setLogin(string);
	}

	@When("informo senha {string}")
	public void informo_senha(String string) {
		page.setPassword(string);
	}

	@When("clico em login")
	public void clico_em_login() {
		page.clicarLogin();
	}

	@Then("login realizado com sucesso")
	public void login_realizado_com_sucesso() {
		assertEquals("https://www.saucedemo.com/inventory.html", getDriver().getCurrentUrl());
	}

	@Then("obtenho {string}")
	public void obtenho(String string) {
		String msgRetorno = DriverFactory.getDriver().findElement(By.xpath("//h3[contains(@data-test,'error')]"))
				.getText();

		assertEquals(string, msgRetorno);
	}

}
