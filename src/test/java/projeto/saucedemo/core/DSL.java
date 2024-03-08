package projeto.saucedemo.core;

import static projeto.saucedemo.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class DSL {

	public void escrever(String id, String texto) {
		getDriver().findElement(By.id(id)).sendKeys(texto);
	}

	public void clicar(String id) {
		getDriver().findElement(By.id(id)).click();
	}
}
