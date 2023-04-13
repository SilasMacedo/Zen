#Author: arqvimedes@gmail.com

Feature: Realizar pesquisa
  Eu como usuario quero realizar pesquisa no campo de busca para enconltrar um produto

 Scenario: Buscar produtos no campo de pesquisa
 		Given acessar o "https://blogdoagi.com.br/"
 	  When clicar na lupa
  	And digitar o produto desejado
  	And clicar no botao pesquisar
  	Then aplicacao apresenta resultado da busca
  	 
