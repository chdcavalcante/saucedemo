#Author: carloshdias.cavalcante@gmail.com

@realizarPedido
Feature: Realizar pedido
Como usuario
Gostaria preencher informações
Porque quero realizar pedido

Background:
  	Given Dado que acessei o site
		When realizar login com dados validos

	Scenario: Realizar pedido com sucesso
		When adiciono item desejado
	 	And clico no carrinho
	 	And clico em checkout
	 	And preenche informações com dados validos
	 	And clico em continue
	 	And confirmo itens adicionados
	 	And clico em finish
	 	Then pedido finalizado
	 	
	 	Scenario Outline: validar dados obrigatorios
	 	 	When clico no carrinho
	 		And clico em checkout
	 		And informa firstName <firstName>, <lastName>, <postalcode> 
	 		And clico em continue
	 		Then mensagem <informa>
	 		
	 		Examples:
			| firstName |  lastName   | postalcode | informa													|
			|     ""    |     ""  	  |	  	""     | "Error: First Name is required"  |
			|  "Bruno"  |    ""  	    |	  	""     | "Error: Last Name is required"   |
			|  "Bruno"  | "Fernandes" |      ""	   | "Error: Postal Code is required" |
			|     ""    |     ""  	  | "57060100" | "Error: First Name is required"  |
			|     ""    | "Fernandes" | "57060100" | "Error: First Name is required"  |
			|  "Bruno"  |     ""      | "57060100" | "Error: Last Name is required"   |
	 	
	
		