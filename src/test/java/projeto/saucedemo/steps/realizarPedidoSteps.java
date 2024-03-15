package projeto.saucedemo.steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.saucedemo.pages.AdicionarItensAoCarrinhoPages;
import projeto.saucedemo.pages.realizarPedidoPages;

public class realizarPedidoSteps  {

	private realizarPedidoPages page;
	private AdicionarItensAoCarrinhoPages addPage;

	@Before
	public void inicializa() {

		page = new realizarPedidoPages();
		addPage = new AdicionarItensAoCarrinhoPages();

	}

	@When("adiciono item desejado")
	public void adiciono_item_desejado() {
		addPage.clickAddItem("add-to-cart-sauce-labs-backpack");
		addPage.clickAddItem("add-to-cart-sauce-labs-bolt-t-shirt");
	}

	@When("clico em checkout")
	public void clico_em_checkout() {
		page.clickCheckout();
	}

	@When("preenche informações com dados validos")
	public void preenche_informações_com_dados_validos() {
		page.setDadosObrigatorios("Bruno", "Fernandes", "57036460");
	}

	@When("clico em continue")
	public void clico_em_continue() {
		page.clickContinue();
	}

	@When("confirmo itens adicionados")
	public void confirmo_itens_adicionados() {
		assertEquals("Sauce Labs Backpack", page.itemNoCarrinho("Sauce Labs Backpack"));
		assertEquals("Sauce Labs Bolt T-Shirt", page.itemNoCarrinho("Sauce Labs Bolt T-Shirt"));

	}

	@When("clico em finish")
	public void clico_em_finish() {
		page.clickFinish();
	}

	@Then("pedido finalizado")
	public void pedido_finalizado() {
		assertEquals("Thank you for your order!", page.confirmacaoPedido());
	}

	@When("informa firstName {string}, {string}, {string}")
	public void informa_first_name(String firstName, String lastName, String cep) {
		page.setDadosObrigatorios(firstName, lastName, cep);
	}

	@Then("mensagem {string}")
	public void mensagem_informa(String string) {
		assertEquals(string, page.msgErroDadosObrigatorios());
	}

}
