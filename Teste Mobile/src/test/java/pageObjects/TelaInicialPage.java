package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import java.util.List;

public class TelaInicialPage {

	public TelaInicialPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private MobileElement botaoPermitir;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/btn_start_skip")
	private MobileElement botaoSkip;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/bottom_fab")
	private MobileElement botaoAddNote;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Text']")
	private MobileElement abaText;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_note")
	private MobileElement escreverNota;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit")
	private MobileElement escreverItem;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
	private MobileElement botaoBack;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Teste']")
	private MobileElement notaTeste;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/bottom_menu_color")
	private MobileElement botaoColor;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/txt1")
	private MobileElement corVermelha;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/main_btn1")
	private MobileElement abaCores;

	@AndroidFindBy(xpath = "//android.widget.GridView//android.widget.LinearLayout")
	private List<MobileElement> filtroCores;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/bottom_menu_reminder")
	private MobileElement botaoReminder;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/quick_setting_15min")
	private MobileElement botaoReminder15mins;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='DONE']")
	private MobileElement botaoDONE;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/bottom_menu_delete")
	private MobileElement botaoDelete;

	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoOK;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/page_more")
	private MobileElement botaoMenu;

	@AndroidFindBy(xpath = "//android.widget.GridView//android.widget.LinearLayout")
	private List<MobileElement> botaoTrashCan;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/main_btn1")
	private MobileElement botaoEsvaziarLixeira;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Checklist']")
	private MobileElement abaChecklist;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/text")
	private MobileElement botao;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Item']")
	private MobileElement botaoAddItem;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_title")
	private MobileElement editarTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CheckTeste']")
	private MobileElement checklistCheckTeste;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Teste1']")
	private MobileElement checklistTeste1;
	
	public void validarCheckDaLista() {
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageButton");
        aguardarElemento(el4);
        assertTrue(el4.isDisplayed());
	}
	public void clicarTeste1Checklist() {
		checklistTeste1.click();
	}

	public void clicarCheckTeste() {
		checklistCheckTeste.click();
	}

	public void cliqueLongoChecklistCheckTeste() {
		Actions acao = new Actions(driver);
		acao.clickAndHold(checklistCheckTeste).perform();
	}

	public void informarItem(String item) {
		escreverItem.sendKeys(item);
	}

	public void informarTitle(String title) {
		editarTitle.sendKeys(title);
	}

	public void clicarBotaoAddItem() {
		botaoAddItem.click();
	}

	public void clicarAbaChecklist() {
		abaChecklist.click();
	}

	public void clicarBotaoEsvaziarLixeira() {
		botaoEsvaziarLixeira.click();
	}

	public void clicarBotaoTrashCan() {
		botaoTrashCan.get(1).click();
	}

	public void clicarBotaoMenu() {
		botaoMenu.click();
	}

	public void clicarBotaoOK() {
		botaoOK.click();
	}

	public void clicarBotaoDelete() {
		botaoDelete.click();
	}

	public void clicarBotaoDONE() {
		botaoDONE.click();
	}

	public void clicarBotaoReminder15mins() {
		botaoReminder15mins.click();
	}

	public void clicarBotaoReminder() {
		botaoReminder.click();
	}

	public void clicarFiltroVermelho() {
		filtroCores.get(1).click();
	}

	public void clicarAbaCores() {
		abaCores.click();
	}

	public void clicarCorVermelha() {
		corVermelha.click();
	}

	public void clicarBotaoColor() {
		botaoColor.click();
	}

	public void cliqueLongoNotaTeste() {
		Actions acao = new Actions(driver);
		acao.clickAndHold(notaTeste).perform();
	}

	public void clicarBotaoBack() {
		botaoBack.click();
	}

	public void informarCampoNota(String teste) {
		escreverNota.sendKeys(teste);
	}

	public void clicarAbaText() {
		abaText.click();
	}

	public void clicarBotaoPermitir() {
		botaoPermitir.click();
	}

	public void clicarBotaoSkip() {
		botaoSkip.click();
	}

	public void clicarBotaoAddNote() {
		botaoAddNote.click();
	}

}