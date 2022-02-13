package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import io.appium.java_client.MobileElement;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class CriarCheckListSteps {
	TelaInicialPage telainicial = new TelaInicialPage(driver);

	

	@E("^clicar no botao Checklist$")
	public void clicarNoBotaoChecklist() throws Throwable {
		telainicial.clicarAbaChecklist();
	}

	@E("^clicar no botao Add Item$")
	public void clicarNoBotaoAddItem() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Add Item']")));
		telainicial.clicarBotaoAddItem();
	}


	@Entao("^o checklist sera salvo no aplicativo$")
	public void oChecklistSeraSalvoNoAplicativo() throws Throwable {
			assertEquals("CheckTeste", driver.findElement(By.xpath("//android.widget.TextView[@text='CheckTeste']")).getText());

		}
	

	@E("^digitar o titulo \"([^\"]*)\"$")
	public void digitarOTitulo(String title) throws Throwable {
		telainicial.informarTitle(title);
	}

	@E("^informar \"([^\"]*)\"$")
	public void informar(String item) throws Throwable {
		telainicial.informarItem(item);
	}

	@Quando("^eu clicar e segurar no checklist$")
	public void euClicarESegurarNoChecklist() throws Throwable {
		telainicial.cliqueLongoChecklistCheckTeste();
	}

	@Entao("^a cor do checklist fica vermelha$")
	public void aCorDoChecklistFicaVermelha() throws Throwable {
		assertEquals("CheckTeste", driver.findElement(By.xpath("//android.widget.TextView[@text='CheckTeste']")).getText());

	}

	@Quando("^eu clicar no checklist$")
	public void euClicarNoChecklist() throws Throwable {
		telainicial.clicarCheckTeste();
	}


	@Entao("^o item fica marcado como checked$")
	public void oItemFicaMarcadoComoChecked() throws Throwable {
		telainicial.validarCheckDaLista();

	}
	

	@E("^clicar no \"([^\"]*)\"$")
	public void clicarNo(String arg1) throws Throwable {
		telainicial.clicarTeste1Checklist();
	}

	@Entao("^o alarme tocara em quinze minutos$")
	public void oAlarmeTocaraEmQuinzeMinutos() throws Throwable {
		telainicial.cliqueLongoChecklistCheckTeste();
		telainicial.clicarBotaoReminder();
		assertEquals("IN 15 MINUTES", driver.findElement(By.xpath("//android.widget.Button[@text='IN 15 MINUTES']")).getText());
	}

	@Entao("^o checklist foi excluido permanentemente$")
	public void oChecklistFoiExcluidoPermanentemente() throws Throwable {
		assertEquals(0, driver.findElements(By.xpath("//android.widget.TextView[@text='CheckTeste']")).size());
	}

	@Entao("^sera criado um checklist com os itens \"([^\"]*)\" \"([^\"]*)\" e \"([^\"]*)\"$")
	public void seraCriadoUmChecklistComOsItensE(String item1, String item2, String item3) throws Throwable {
		assertEquals("CheckTeste", driver.findElement(By.xpath("//android.widget.TextView[@text='CheckTeste']")).getText());
		telainicial.clicarCheckTeste();
		assertEquals(item1, driver.findElement(By.xpath("//android.widget.TextView[@text='Teste1']")).getText());
		assertEquals(item2, driver.findElement(By.xpath("//android.widget.TextView[@text='Teste2']")).getText());
		assertEquals(item3, driver.findElement(By.xpath("//android.widget.TextView[@text='Teste3']")).getText());
		telainicial.clicarBotaoBack();
	}


}
