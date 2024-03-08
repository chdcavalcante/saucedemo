package projeto.saucedemo.pages;

import projeto.saucedemo.core.BasePage;

public class LoginPages extends BasePage {

    public void setUsername(String texto){
        dsl.escrever("user-name", texto);
    }

    public void setPassword(String texto){
        dsl.escrever("password", texto);
    }

    public void clickLogin(){
        dsl.clicar("login-button");
    }

}
