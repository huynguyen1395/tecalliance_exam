package com.demo.exam.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import static com.demo.exam.common.Configs.BASE_URL;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;

@DefaultUrl(BASE_URL)
public class SearchPage extends PageObject {

	@FindBy(xpath = "//input[@type='text']")
    private WebElementFacade searchText;

    @FindBy(xpath = "//h3")
    private WebElementFacade resultText;
    
    public void input_keyword(String keyword) {
    	searchText.type(keyword);
    	searchText.sendKeys(Keys.ENTER);
    }
    
    public void check_result_search(String expectedResult) {
    	String  actualResult = resultText.getText();
    	assertEquals(expectedResult, actualResult);
    }
    
}