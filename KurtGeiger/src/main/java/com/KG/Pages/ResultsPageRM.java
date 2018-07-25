package com.KG.Pages;

import com.KG.Support.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static com.KG.Support.BaseClass.driver;


public class ResultsPageRM {

ElementUtils utils=new ElementUtils();

private String TEST_ON_RESULTS_PAGE="//span[text()='Prioritise properties with...']";
private String SORT_TYPE_DROPDOWN="sortType";
private String THE_COMMON_LOCATOR_THAT_CAPTURES_THE_DAY_THE_PROPERTY_HAS_BEEN_ADDED_OR_ALTERED="//div[@id='l-searchResults']//div[@class='l-searchResult is-list']//div[@class='propertyCard-branchSummary']//span[1]";
private String LOCATOR_FOR_THE_FIRST_NON_FEATURED_PROPERTY_ON_THE_RESULTS_PAGE="//div[@id='l-searchResults']//div[2][@class='l-searchResult is-list']//h2";
private String NAVIGATE_BACK_TO_RESULTS_LABEL="backListLink";
private String PROPERTY_MARKETED_BY_TEXTLABEL="//h3[text()[contains(.,'This property is marketed by')]]";

    public String assertResultsPage(){
        utils.waitForElementVisible(By.xpath(TEST_ON_RESULTS_PAGE));
        return driver.findElement(By.xpath(TEST_ON_RESULTS_PAGE)).getText();

    }
    public void sortPropertyByNewestFirst(String sort){
        utils.selectByVisibleText(By.id(SORT_TYPE_DROPDOWN),sort);


    }
    //this method loops throught all the listed results and ignores all the featured property. it asserts that these were either added
    //or reduced today

    public void assertNewestSortedProperty() {
        List<WebElement> all = driver.findElements(By.xpath(THE_COMMON_LOCATOR_THAT_CAPTURES_THE_DAY_THE_PROPERTY_HAS_BEEN_ADDED_OR_ALTERED));
        for (WebElement second : all) {
            if (second.getText().equalsIgnoreCase("today")) {
                Assert.assertTrue(second.getText().contains("today"));
            }
        }
    }
    //this method clicks the 2nd property in the list,which always is the first non- featured property
    public void clickFirstNonFeaturedProperty() throws InterruptedException {
        utils.waitForElementVisible(By.xpath(LOCATOR_FOR_THE_FIRST_NON_FEATURED_PROPERTY_ON_THE_RESULTS_PAGE));
        utils.javaScriptExecutorClick(By.xpath(LOCATOR_FOR_THE_FIRST_NON_FEATURED_PROPERTY_ON_THE_RESULTS_PAGE));

    }
    //this asserts few text labels on the choosen property page
    public void onChosenPropertyPage(){
        utils.waitForElementVisible(By.xpath(PROPERTY_MARKETED_BY_TEXTLABEL));
        utils.waitForElementVisible(By.id(NAVIGATE_BACK_TO_RESULTS_LABEL));
    }



    }
