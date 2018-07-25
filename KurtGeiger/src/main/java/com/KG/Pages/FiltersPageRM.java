package com.KG.Pages;

import com.KG.Support.ElementUtils;
import org.openqa.selenium.By;

import static com.KG.Support.BaseClass.driver;

public class FiltersPageRM {

    ElementUtils utils=new ElementUtils();
    private String TEXT_ON_CHOOSE_LOCATION_FILTER="//label[text()='Choose your location']";
    private String RIGHTMOVE_LABEL="//img[@id='rm-site-logo']";
    private String RADIUS_FILTER_DROPDOWN="radius";
    private String MIN_PRICE_DROP_DOWN="minPrice";
    private String MAX_PRICE_DROPDOWN="maxPrice";
    private String MINIMUM_BEDROOM_DROPDOWN="minBedrooms";
    private String MAX_BEDROOM_DROPDOWN="maxBedrooms";
    private String PROPERTY_TYPE_DROPDOWN="displayPropertyType";
    private String MAX_DAYS_SINCE_ADDED_DROPDOWN="maxDaysSinceAdded";
    private String TOOL_TIP_ON_SSTC_CHECKBOX="//a[@class='priority3 link-furtherinfo touchsearch-helpbutton']";
    private String TEXT_ON_SSTC_TOOLTIP_WINDOW="//h1[text()='Sold STC and Reserved properties']";
    private String CLOSE_TOOL_TIP_WINDOW_BUTTON="//a[text()='close this window']";
    private String SSTC_CHECKBOX="//span[@class='tickbox--indicator']";
    private String SEARCH_PROPERTY_BUTTON="submit";




    public String assertSearchRadiusFilterLabel(String filterName){
        utils.waitForElementVisible(By.xpath("//label[text()='"+filterName+"']"));
        return driver.findElement(By.xpath("//label[text()='"+filterName+"']")).getText();
    }

    public String assertChooseYouLocationFilterLabel(String filterName){
        utils.waitForElementVisible(By.xpath("//label[text()='"+filterName+"']"));
        return driver.findElement(By.xpath("//label[text()='"+filterName+"']")).getText();
    }
    public void assertAbsenceOfChooseLocationFilter(){
        utils.assertElementNotPresent(By.xpath(TEXT_ON_CHOOSE_LOCATION_FILTER));
    }

    public void navigateHome() throws InterruptedException {
        utils.waitForElementVisible(By.xpath(RIGHTMOVE_LABEL));
        utils.clickBtn(By.xpath(RIGHTMOVE_LABEL));
    }
    public void chooseRadius(String radius){
        utils.selectByVisibleText(By.id(RADIUS_FILTER_DROPDOWN),radius);
    }

    public void setPriceRange(String min, String max){
        utils.selectByVisibleText(By.id(MIN_PRICE_DROP_DOWN),min);
        utils.selectByVisibleText(By.id(MAX_PRICE_DROPDOWN),max);
    }
    public void setBedRoomRange(String min, String max){
        utils.selectByVisibleText(By.id(MINIMUM_BEDROOM_DROPDOWN),min);
        utils.selectByVisibleText(By.id(MAX_BEDROOM_DROPDOWN),max);
    }
    public void setPropertyType(String propertyType){
        utils.selectByVisibleText(By.id(PROPERTY_TYPE_DROPDOWN),propertyType);
    }
    public void setMaxDaysSinceAdded(String days){
        utils.selectByVisibleText(By.id(MAX_DAYS_SINCE_ADDED_DROPDOWN),days);
    }
    public void testSSTCtoolTip() throws InterruptedException {
        utils.clickBtn(By.xpath(TOOL_TIP_ON_SSTC_CHECKBOX));
        utils.switchToNewWindow();
        utils.waitForElementVisible(By.xpath(TEXT_ON_SSTC_TOOLTIP_WINDOW));
        utils.scrollToElement(By.xpath(CLOSE_TOOL_TIP_WINDOW_BUTTON));
        utils.clickBtn(By.xpath(CLOSE_TOOL_TIP_WINDOW_BUTTON));
        utils.switchToPreviousWindow(0);
    }
    public void setToIncludeSSTC() throws InterruptedException {
        utils.clickBtn(By.xpath(SSTC_CHECKBOX));
    }
    public void submitSearch() throws InterruptedException {
        utils.clickBtn(By.id(SEARCH_PROPERTY_BUTTON));
    }

}
