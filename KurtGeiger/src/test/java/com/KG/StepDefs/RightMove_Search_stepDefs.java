package com.KG.StepDefs;
import com.KG.Support.WebModel;

import static org.junit.Assert.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;


public class RightMove_Search_stepDefs {
    WebModel webModel=new WebModel();


    @Given("^I am on the dashboard page$")
    public void iAmOnTheDashboardPage()  {
        webModel.getDashBoardPageRM().assertWebsiteURL(webModel.getUtils().getProperty("urlForRightMove"));


    }

    @When("^I enter \"([^\"]*)\" into the search location box$")
    public void iEnterIntoTheSearchLocationBox(String location)  {
        webModel.getDashBoardPageRM().keyInLocation(location);

    }

@Then("^all the incremental search results should start with the word \"([^\"]*)\"$")
public void allTheIncrementalSearchResultsShouldStartWithTheWord(String location) {
        webModel.getDashBoardPageRM().assertIncrementalSearchResultsOfSearchBox(location);

    }


    @Given("^I have searched for properties in \"([^\"]*)\" area and I have been navigated to the filters page$")
    public void iHaveSearchedForPropertiesInAreaAndIHaveBeenNavigatedToTheFiltersPage(String location) throws InterruptedException {
        webModel.getDashBoardPageRM().searchViaSelectingIncrementalSearchResults(location);
        assertEquals(webModel.getFiltersPageRM().assertSearchRadiusFilterLabel("Search radius"),"Search radius");



    }

 @When("^I enter \"([^\"]*)\" into the search box location and click search with out choosing any of the incremental search result$")
public void iEnterIntoTheSearchBoxLocationAndClickSearchWithOutChoosingAnyOfTheIncrementalSearchResult(String location) throws InterruptedException {
        webModel.getDashBoardPageRM().searchViaNotSelectingIncrementalSearchResults(location);

    }


@Then("^I should be able to find the \"([^\"]*)\" filter$")
public void iShouldBeAbleToFindTheFilter(String locationFilter)  {
    assertEquals(webModel.getFiltersPageRM().assertChooseYouLocationFilterLabel(locationFilter),locationFilter);


}


    @And("^If I were to perform the same action by clicking the incremental search result for \"([^\"]*)\"$")
    public void ifIWereToPerformTheSameActionByClickingTheIncrementalSearchResultFor(String location) throws InterruptedException {
        webModel.getFiltersPageRM().navigateHome();
        webModel.getDashBoardPageRM().searchViaSelectingIncrementalSearchResults(location);
    }


    @Then("^I should be shown \"([^\"]*)\" filter only$")
    public void iShouldBeShownFilterOnly(String radiusFilter) {
        assertEquals(webModel.getFiltersPageRM().assertSearchRadiusFilterLabel(radiusFilter),radiusFilter);
        webModel.getFiltersPageRM().assertAbsenceOfChooseLocationFilter();

    }


    @When("^I apply filters and proceed on with clicking find properties$")
    public void iApplyFiltersAndProceedOnWithClickingFindProperties() throws InterruptedException {
        webModel.getFiltersPageRM().chooseRadius("Within 10 miles");
        webModel.getFiltersPageRM().setPriceRange("900,000","2,000,000");
        webModel.getFiltersPageRM().setBedRoomRange("1","3");
        webModel.getFiltersPageRM().setPropertyType("Flats / Apartments");
        webModel.getFiltersPageRM().setMaxDaysSinceAdded("Last 7 days");
        webModel.getFiltersPageRM().testSSTCtoolTip();
        webModel.getFiltersPageRM().setToIncludeSSTC();
        webModel.getFiltersPageRM().submitSearch();
    }

    @Then("^I should be provided with the result list$")
    public void iShouldBeProvidedWithTheResultList()  {
        assertEquals(webModel.getResultsPageRM().assertResultsPage(),"Prioritise properties with...");



    }

    @And("^I should be able to sort the property by \"([^\"]*)\"$")
    public void iShouldBeAbleToSortThePropertyBy(String sort)  {
        webModel.getResultsPageRM().sortPropertyByNewestFirst(sort);

    }

    @And("^choose the first non featured property from the displayed result$")
    public void chooseTheFirstNonFeaturedPropertyFromTheDisplayedResult() throws InterruptedException {
        webModel.getResultsPageRM().assertNewestSortedProperty();
        webModel.getResultsPageRM().clickFirstNonFeaturedProperty();
        webModel.getResultsPageRM().onChosenPropertyPage();

    }
}
