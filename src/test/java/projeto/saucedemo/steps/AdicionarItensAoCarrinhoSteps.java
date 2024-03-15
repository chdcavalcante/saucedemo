package projeto.saucedemo.steps;

import static org.junit.Assert.assertEquals;
import static projeto.saucedemo.core.DriverFactory.getDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.saucedemo.pages.AdicionarItensAoCarrinhoPages;
import projeto.saucedemo.pages.LoginPages;

public class AdicionarItensAoCarrinhoSteps {

	private LoginPages loginPage;
	private AdicionarItensAoCarrinhoPages addPage;

	@Before
	public void inicia() {
		loginPage = new LoginPages();
		addPage = new AdicionarItensAoCarrinhoPages();

	}

	@Given("Dado que acessei o site")
	public void dado_que_acessei_o_site() {
		getDriver().get("https://www.saucedemo.com/");

	}

	@When("realizar login com dados validos")
	public void realizar_login_com_dados_validos() {
		loginPage.setLogin("standard_user");
		loginPage.setPassword("secret_sauce");
		loginPage.clicarLogin();
	}

	@When("clico em Add to card no item desejado")
	public void clico_em_add_to_card_no_item_desejado() {
		addPage.clickAddItem("add-to-cart-sauce-labs-backpack");

	}

	@Then("item deve ser adicionado ao carrinho")
	public void item_deve_ser_adicionado_ao_carrinho() {
		assertEquals("1", addPage.QuantidadeDeItensNoCarrinho());
	}

	@When("clico no carrinho")
	public void clico_no_carrinho() {
		addPage.clickCarrinho();
	}

	@When("adiciono itens desejados")
	public void adiciono_itens_desejados() {
		addPage.clickAddItem("add-to-cart-sauce-labs-backpack");
		addPage.clickAddItem("add-to-cart-sauce-labs-bolt-t-shirt");
	}

	@Then("carrinho deve mostrar a quantidade de itens adicionados")
	public void carrinho_deve_mostrar_a_quantidade_de_itens_adicionados() {
		assertEquals("2", addPage.QuantidadeDeItensNoCarrinho());
	}

	@Given("tenha adicionado item ao carrinho")
	public void tenha_adicionado_item_ao_carrinho() {
		addPage.clickAddItem("add-to-cart-sauce-labs-backpack");

	}

	@When("clico em remove no item não desejado")
	public void clico_em_remove_no_item_não_desejado() {
		addPage.clickRemoveItem("//button[contains(.,'Remove')]");
	}

	@Then("Item removido com sucesso")
	public void item_removido_com_sucesso() {
		assertEquals("", addPage.QuantidadeDeItensNoCarrinho());
	}
}
