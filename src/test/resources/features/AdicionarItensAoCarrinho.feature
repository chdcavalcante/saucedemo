#Author: carloshdias.cavalcante@gmail.com
@carrinho
Feature: Adicionar itens ao carrinho
Como usuario da aplicação
Gostaria de selecionar itens 
Porque quero comprar

Background:
  	Given Dado que acessei o site
		When realizar login com dados validos

	Scenario: Adicionar item ao carrinho
 		When clico em Add to card no item desejado
 		Then item deve ser adicionado ao carrinho
  
  Scenario: Remover item do carrinho
  	Given tenha adicionado item ao carrinho
  	And clico no carrinho
  	And clico em remove no item não desejado
  	Then Item removido com sucesso

 	Scenario: Adicionar mais de um item ao carrinho
 		When adiciono itens desejados
 		Then carrinho deve mostrar a quantidade de itens adicionados
  