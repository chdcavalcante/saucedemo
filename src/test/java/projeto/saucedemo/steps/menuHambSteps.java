package projeto.saucedemo.steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.saucedemo.core.DSL;
import projeto.saucedemo.core.DriverFactory;
import projeto.saucedemo.pages.AdicionarItensAoCarrinhoPages;
import projeto.saucedemo.pages.menuHambPages;

public class menuHambSteps {

	private menuHambPages page;
	private AdicionarItensAoCarrinhoPages addPage;
	private DSL dsl;

	@Before
	public void inicializa() {
		dsl = new DSL();
		page = new menuHambPages();
		addPage = new AdicionarItensAoCarrinhoPages();
	}

	@When("clico carrinho")
	public void clico_carrinho() {
		addPage.clickCarrinho();
	}

	@When("clico no menu hambuguer")
	public void clico_no_menu_hambuguer() throws InterruptedException {
		page.clickMenuHamb();
		Thread.sleep(500);
		
	}

	@When("clico em All items")
	public void clico_em_all_items() {
		page.clickAllItems();
	}

	@Then("retorna a homePage")
	public void retorna_a_home_page() {
		assertEquals("https://www.saucedemo.com/inventory.html", dsl.capturarUrl());
	}

	@When("clico em About")
	public void clico_em_about() {
		page.clickAbout();
	}

	@Then("direciona para saucelabs")
	public void redireciona_para_https_saucelabs_com() {
		assertEquals("https://saucelabs.com/", dsl.capturarUrl());
	}

	@When("clico em logout")
	public void clico_em_logout() {
		page.clickLogout();
	}

	@Then("logout realizado com sucesso")
	public void logout_realizado_com_sucesso() {
		assertEquals("https://www.saucedemo.com/", dsl.capturarUrl());
	}

	@When("clico em reset app state")
	public void clico_em_reset_app_state() {
		page.clickResetAppState();
	}

	@Then("remove todos os itens adicionados")
	public void remove_todos_os_itens_adicionados() {
		assertEquals("", addPage.QuantidadeDeItensNoCarrinho());
	}

}
