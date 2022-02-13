package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

	
	@Before
	public void setUp() throws Exception {
		acessarColorNote();
	}
	
	@After()
	public void fecharColorNote(Scenario scenario) throws Exception {
		capturarScreenshot(scenario);
		driver.quit();
	}

}
