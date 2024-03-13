package projeto.saucedemo.pages;

import projeto.saucedemo.core.BasePage;

public class LoginPages extends BasePage {
    
    public void setLogin(String login) {
    	dsl.escrever("user-name", login);
    }
    
    public void setPassword(String password) {
    	dsl.escrever("password", password);
    }
    
    
    public void clicarLogin() {
    	dsl.clicar("login-button");
    }
}
