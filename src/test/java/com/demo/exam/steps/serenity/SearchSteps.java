package com.demo.exam.steps.serenity;

import com.demo.exam.pages.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchSteps {
    SearchPage searchPage;
    @Step
    public void is_the_login_page() {
    	searchPage.open();
    }

    @Step
    public void enter_keywords(String keyword) {
    	searchPage.input_keyword(keyword);
    }
    
    @Step
    public void check_result_search_display(String strResult) {
    	searchPage.check_result_search(strResult);
    }
    
}