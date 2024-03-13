package projeto.saucedemo.pages;

import static org.junit.Assert.assertEquals;
import static projeto.saucedemo.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import projeto.saucedemo.core.BasePage;

public class realizarPedidoPages extends BasePage {

	public void clickCheckout() {
		dsl.clicar("checkout");

	}

	public void clickContinue() {
		dsl.clicar("continue");
	}
	
	public void clickFinish() {
		dsl.clicar("finish");
	}

	public void setDadosObrigatorios(String firstName, String lastName, String postalCode) {
		dsl.escrever("first-name", firstName);
		dsl.escrever("last-name", lastName);
		dsl.escrever("postal-code", postalCode);
	}

	public String itemNoCarrinho(String item) {
		WebElement element = getDriver()
				.findElement(By.xpath("//div[@class='inventory_item_name'][contains(.,'" + item + "')]"));
		String texto = element.getText();
		return texto;
	}
	
	public String confirmacaoPedido() {
		String texto = getDriver().findElement(By.xpath("//h2[@class='complete-header']")).getText();
		return texto;
	}
	
	public String msgErroDadosObrigatorios() {
		String erro = getDriver().findElement(By.xpath("//h3[@data-test='error']")).getText();
		return erro;
	}

}
