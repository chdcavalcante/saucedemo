#Author: carloshdias.cavalcante@gmail.com
@login
Feature: Login
  Como usuario
  Gostaria realizar login
  Porque assim terei acesso a pagina de compras

  Background:
    Given esteja na pagina de login
		
    Scenario: login com sucesso
      When informo dados de login "standard_user" "secret_sauce"
      When clico em login
      Then login realizado com sucesso
	
  Scenario Outline: login com dados invalidos
    When informo login <login>
    When informo senha <senha> 
    And clico em login
    Then obtenho <msg>

    Examples:
  |       login       |     senha    |   msg                                                                         |
  | "locked_out_user" |"secret_sauce"| "Epic sadface: Sorry, this user has been locked out."                         |
  |    "usuario123"   |"secret_sauce"| "Epic sadface: Username and password do not match any user in this service"   |
  |  "standard_user"  |  "senha123"  | "Epic sadface: Username and password do not match any user in this service"   |

