#Author: carloshdias.cavalcante@gmail.com
@tag
Feature: Menu hamburguer
  
Background:
  	Given Dado que acessei o site
		When realizar login com dados validos
		
  Scenario: All Items
  	When clico carrinho
  	When clico no menu hambuguer
  	And clico em All items
  	Then retorna a homePage
  
  Scenario: About
 	 	When clico no menu hambuguer
  	And clico em About
  	Then direciona para saucelabs
  
  Scenario: Logout
 	 	When clico no menu hambuguer
 	 	And clico em logout
  	Then logout realizado com sucesso
  	
  Scenario: Reset app state
  	When adiciono item desejado
 		When clico no menu hambuguer
  	And clico em reset app state
  	Then remove todos os itens adicionados
	
	