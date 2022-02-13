package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;

public class CriarNotaSteps {
	TelaInicialPage telainicial = new TelaInicialPage(driver);

	@Quando("eu clicar no botao permitir")
	public void euClicarNoBotaoPermitir() {
		telainicial.clicarBotaoPermitir();
	}

	@Quando("clicar no botao skip")
	public void clicarNoBotaoSkip() {
		telainicial.clicarBotaoSkip();
	}

	@Quando("eu clicar no botao add note")
	public void euClicarNoBotaoAddNote() {
		telainicial.clicarBotaoAddNote();
	}

	@Quando("clicar na aba Text")
	public void clicarNaAbaText() {
		telainicial.clicarAbaText();

	}

	@Quando("digitar {string}")
	public void digitar(String nota) {
		telainicial.informarCampoNota(nota);

	}

	@Quando("clicar no botao back")
	public void clicarNoBotaoBack() {
		telainicial.clicarBotaoBack();
	}


	@Quando("^eu clicar e segurar na nota$")
	public void euClicarESegurarNaNota() throws Throwable {
		telainicial.cliqueLongoNotaTeste();
	}

	@E("^clicar no botao color$")
	public void clicarNoBotaoColor() throws Throwable {
		telainicial.clicarBotaoColor();
	}

	@E("^clicar na cor vermelha$")
	public void clicarNaCorVermelha() throws Throwable {
		telainicial.clicarCorVermelha();
	}

	@Entao("^a cor da nota fica vermelha$")
	public void aCorDaNotaFicaVermelha() throws Throwable {
		assertEquals("Teste", driver.findElement(By.xpath("//android.widget.TextView[@text='Teste']")).getText());

	}

	@E("^clica na aba de filtro por cores$")
	public void clicaNaAbaDeFiltroPorCores() throws Throwable {
		telainicial.clicarAbaCores();
	}

	@E("^seleciono a cor vermelha$")
	public void selecionoACorVermelha() throws Throwable {
		telainicial.clicarFiltroVermelho();
	}

	@E("^clicar no botao lembrete$")
	public void clicarNoBotaoLembrete() throws Throwable {
		telainicial.clicarBotaoReminder();
	}

	@E("^clicar no botao remind me in fifteen minutes$")
	public void clicarNoBotaoRemindMeInFifteenMinutes() throws Throwable {
		telainicial.clicarBotaoReminder15mins();
	}

	@E("^clicar no botao done$")
	public void clicarNoBotaoDone() throws Throwable {
		telainicial.clicarBotaoDONE();
	}

	@Entao("^o alarme sera programado para tocar em quinze minutos$")
	public void oAlarmeSeraProgramadoParaTocarEmQuinzeMinutos() throws Throwable {
		telainicial.cliqueLongoNotaTeste();
		telainicial.clicarBotaoReminder();
		assertEquals("IN 15 MINUTES",
				driver.findElement(By.xpath("//android.widget.Button[@text='IN 15 MINUTES']")).getText());
	}

	@E("^clicar no botao delete$")
	public void clicarNoBotaoDelete() throws Throwable {
		telainicial.clicarBotaoDelete();
	}

	@E("^clicar no botao OK$")
	public void clicarNoBotaoOK() throws Throwable {
		telainicial.clicarBotaoOK();
	}

	@E("^clicar no botao menu$")
	public void clicarNoBotaoMenu() throws Throwable {
		telainicial.clicarBotaoMenu();
	}

	@E("^clicar no botao trash can$")
	public void clicarNoBotaoTrashCan() throws Throwable {
		telainicial.clicarBotaoTrashCan();
	}

	@E("^clicar no botao esvaziar lixeira$")
	public void clicarNoBotaoEsvaziarLixeira() throws Throwable {
		telainicial.clicarBotaoEsvaziarLixeira();
	}

	@Entao("^a nota foi excluida permanentemente$")
	public void aNotaFoiExcluidaPermanentemente() throws Throwable {
		assertEquals(0, driver.findElements(By.xpath("//android.widget.TextView[@text='Teste']")).size());	
	}


	@Entao("^a nota \"([^\"]*)\" sera salva no aplicativo$")
	public void aNotaSeraSalvaNoAplicativo(String nota) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Teste']")));
		assertEquals(nota, driver.findElement(By.xpath("//android.widget.TextView[@text='Teste']")).getText());
		
	}


}
