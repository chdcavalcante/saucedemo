package projeto.saucedemo.core;

import static projeto.saucedemo.core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class DSL {

	public void escrever(String id, String texto) {
		getDriver().findElement(By.id(id)).sendKeys(texto);
	}

	public void clicar(By by) {
		getDriver().findElement(by).click();
		;
	}

	public void clicar(String id) {
		clicar(By.id(id));
	}

	public String capturarUrl() {
		String url = DriverFactory.getDriver().getCurrentUrl();
		return url;
	}
	
	public void screenShot() throws IOException {
			TakesScreenshot ss = (TakesScreenshot) getDriver();
			File arquivo = ss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(arquivo, new File(
					"target" + File.separator + "screenShot" + File.separator + ".jpg"));
		
	}
}
