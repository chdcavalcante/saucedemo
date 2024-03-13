package projeto.saucedemo.pages;

import static projeto.saucedemo.core.DriverFactory.getDriver;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import projeto.saucedemo.core.BasePage;

public class AdicionarItensAoCarrinhoPages extends BasePage {

	public void clickAddItem(String id) {
		dsl.clicar(id);
	}

	public void clickRemoveItem(String element) {
		dsl.clicar(By.xpath(element));

	}

	public void clickCarrinho() {
		dsl.clicar(By.xpath("//a[contains(@class,'shopping_cart_link')]"));
	}

	public void mudarQuantidadeDeItem(String quantidade) {
		getDriver().findElement(By.xpath("//div[@class='cart_quantity']")).sendKeys(quantidade);
	}

	public String QuantidadeDeItensNoCarrinho() {
		String itensNoCarrinho = getDriver().findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
		return itensNoCarrinho;
	}
}
