#Author: carloshdias.cavalcante@gmail.com

@positivo
Feature: Realizar compra
Como usuario da aplicação
Gostaria de escolher itens 
Porque quero comprar

	Background: Acessar o site e realizar login com sucesso
	Given Dado que acessei o site
	When realizar login com dados validos

  Scenario: Realizar compra com sucesso
    When seleciono os itens desejados
    And clico no carrinho
    And confere os itens
    And clica checkout
    And informa os dados validos
    And clica em finish
    When compra realizada com sucesso
