package testes;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Metodos;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elem = new Elementos();
	
	
	@Given("acessar o {string}")
	public void acessar_o(String site) {
		metodo.abrirNavegador("CHROME", site);
	}
	
	
	@When("clicar na lupa")
	public void clicar_na_lupa() {
	  metodo.clicar(elem.getLupa());
	}

	@When("digitar o produto desejado")
	public void digitar_o_produto_desejado() {
	  metodo.escrever(elem.getPesquisa(), "credito");
	}

	@When("clicar no botao pesquisar")
	public void clicar_no_botao_pesquisar() {
	  metodo.clicar(elem.getBtnPesquisar());
	}

	@Then("aplicacao apresenta resultado da busca")
	public void aplicacao_apresenta_resultado_da_busca() {
	  metodo.fechar();
	}
	
	

}
