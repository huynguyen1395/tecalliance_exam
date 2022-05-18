package com.demo.exam.steps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

import com.demo.exam.steps.serenity.SearchSteps;

import com.demo.exam.common.*;

public class DefinationSearchSteps {
	Configs configs;
	
	@Steps
	SearchSteps searchSteps;

	@BeforeScenario
	public void userLoginToApplication() {
		searchSteps.is_the_login_page();
	}
	
	@Given("the user input keyword '$keyword'")
	public void userInputKeyword(String keyword) {
		searchSteps.enter_keywords(keyword);
	}
	
	@Then("the user should see result correctly")
	public void userShouldSeeCorrectResult() {
		searchSteps.check_result_search_display(Configs.RESULT_SEARCH);
	}
}
