package projeto.saucedemo.pages;

import projeto.saucedemo.core.BasePage;

public class menuHambPages extends BasePage {

	public void clickMenuHamb() {
		dsl.clicar("react-burger-menu-btn");
	}

	public void clickAllItems() {
		dsl.clicar("inventory_sidebar_link");
	}

	public void clickAbout() {
		dsl.clicar("about_sidebar_link");
	}

	public void clickLogout() {
		dsl.clicar("logout_sidebar_link");
	}

	public void clickResetAppState() {
		dsl.clicar("reset_sidebar_link");
	}

}
