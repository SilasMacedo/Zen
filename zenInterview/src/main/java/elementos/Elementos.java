package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By lupa = By.id("search-open");
	private By pesquisa = By.name("s");
	private By btnPesquisar = By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/form/input");
	public By getLupa() {
		return lupa;
	}
	public By getPesquisa() {
		return pesquisa;
	}
	public By getBtnPesquisar() {
		return btnPesquisar;
	}
	
	
	
	
	
}
