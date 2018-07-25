$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com.KG.Features/KG_SearchAndAssertABrand_And_AddItemToCart.feature");
formatter.feature({
  "line": 2,
  "name": "Search And Assert A Brand and add an item to the cart",
  "description": "",
  "id": "search-and-assert-a-brand-and-add-an-item-to-the-cart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@KG"
    }
  ]
});
formatter.before({
  "duration": 5870788290,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "search for a brand and assert results",
  "description": "",
  "id": "search-and-assert-a-brand-and-add-an-item-to-the-cart;search-for-a-brand-and-assert-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select brand category from the header",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see the list of brands",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I select \"DOLCE \u0026 GABBANA\" brand from the list",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see the list of products from \"DOLCE \u0026 GABBANA\"",
  "keyword": "Then "
});
formatter.match({
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 137599473,
  "error_message": "org.junit.ComparisonFailure: expected:\u003chttps://www.[kurtgeiger.es]/\u003e but was:\u003chttps://www.[rightmove.co.uk]/\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat com.KG.Support.ElementUtils.assertURL(ElementUtils.java:55)\n\tat com.KG.Pages.DashBoardPageKG.assetDashBoardPage(DashBoardPageKG.java:10)\n\tat com.KG.StepDefs.KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iAmOnTheHomepage(KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.java:10)\n\tat ✽.Given I am on the homepage(com.KG.Features/KG_SearchAndAssertABrand_And_AddItemToCart.feature:4)\n",
  "status": "failed"
});
formatter.match({
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iSelectBrandCategoryFromTheHeader()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iShouldSeeTheListOfBrands()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "DOLCE \u0026 GABBANA",
      "offset": 10
    }
  ],
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iSelectBrandFromTheList(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "DOLCE \u0026 GABBANA",
      "offset": 40
    }
  ],
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iShouldSeeTheListOfProductsFrom(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1433743375,
  "status": "passed"
});
formatter.before({
  "duration": 3634177180,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "add an item to the check out and assert",
  "description": "",
  "id": "search-and-assert-a-brand-and-add-an-item-to-the-cart;add-an-item-to-the-check-out-and-assert",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I select men category from the header",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I am on PDP",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select any colour and size for the chosen men category",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I add the product to the bag",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I can see the bag with single item",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I click \u0027Proceed to Checkout\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should be on checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iSelectMenCategoryFromTheHeader()"
});
formatter.result({
  "duration": 7309402,
  "error_message": "org.junit.ComparisonFailure: expected:\u003chttps://www.[kurtgeiger.es]/\u003e but was:\u003chttps://www.[rightmove.co.uk]/\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat com.KG.Support.ElementUtils.assertURL(ElementUtils.java:55)\n\tat com.KG.Pages.DashBoardPageKG.assetDashBoardPage(DashBoardPageKG.java:10)\n\tat com.KG.StepDefs.KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iSelectMenCategoryFromTheHeader(KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.java:40)\n\tat ✽.Given I select men category from the header(com.KG.Features/KG_SearchAndAssertABrand_And_AddItemToCart.feature:11)\n",
  "status": "failed"
});
formatter.match({
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iAmOnPDP()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iSelectAnyColourAndSizeForTheChosenMenCategory()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iAddTheProductToTheBag()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iCanSeeTheBagWithSingleItem()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iClickProceedToCheckout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KG_SearchAndAssertABrand_And_AddItemToCart_stepDef.iShouldBeOnCheckoutPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1326598184,
  "status": "passed"
});
});