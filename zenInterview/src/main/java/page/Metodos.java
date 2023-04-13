package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
	
	WebDriver drive;
	
	
	public void abrirNavegador (String browser, String site) {
		try {
			if(browser.equalsIgnoreCase("FIREFOX")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				drive = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("CHROME")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				drive = new ChromeDriver();
			}
			drive.get(site);
			drive.manage().window().maximize();
			drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			System.out.println("------------Iniciando teste-------------");
			
		} catch (Exception e) {
			System.out.println("========== Erro ao abrir navegador ===========" + e.getMessage());
			System.out.println("========= Causa do erro =========" + e.getCause());
		}
		
	}
	
	
	public void clicar (By elemento) {
		drive.findElement(elemento).click();
	}
	
	
	public void escrever (By elemento, String texto) {
		drive.findElement(elemento).sendKeys(texto);
	}
	
	
	public void submit (By elemento) {
		drive.findElement(elemento).submit();
	}

	
	public void fechar() {
		drive.quit();
	}
}

