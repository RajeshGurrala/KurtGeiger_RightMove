package com.KG.Pages;

import com.KG.Support.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.KG.Support.BaseClass.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;


public class DashBoardPageRM {
    ElementUtils utils = new ElementUtils();
    private String SEARCHBOX="searchLocation";
    private String BUY_BUTTON="buy";
    private String COMMON_LOCATOR_FOR_INCREMENTAL_SEARCH_RESULTS="//li[@class='typeAheadLocation']";

    public void assertWebsiteURL(String url) {
        utils.assertURL(url);

    }

    public void keyInLocation(String location) {
        utils.sendText(By.id(SEARCHBOX), location);
    }
    public void searchViaNotSelectingIncrementalSearchResults(String location) throws InterruptedException {
        utils.sendText(By.id(SEARCHBOX), location);
        utils.clickBtn(By.id(BUY_BUTTON));
    }

    public void searchViaSelectingIncrementalSearchResults(String location) throws InterruptedException {
        utils.sendText(By.id(SEARCHBOX), location);
        utils.clickBtn(By.xpath("//ul[@id='typeaheadList']//li[1]//span[text()='"+location+"']"));
        utils.clickBtn(By.id(BUY_BUTTON));

    }


    public void assertIncrementalSearchResultsOfSearchBox(String locationText) {
        List<WebElement> keydResult = driver.findElements(By.xpath(COMMON_LOCATOR_FOR_INCREMENTAL_SEARCH_RESULTS));
        for (WebElement text : keydResult) {
            assertThat(text.getText(),is(locationText));

        }

    }
}