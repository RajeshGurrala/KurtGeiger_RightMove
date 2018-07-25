package com.KG.Support;
import com.KG.Pages.*;

public class WebModel {

    public ElementUtils utils;

    private DashBoardPageKG dashBoardPageKG;
    private BrandPageKG brandPageKG;
    private Mens_ShoePageKG mensShoePageKG;
    private CheckOutPageKG checkOutPageKG;
    private DashBoardPageRM dashBoardPageRM;
    private FiltersPageRM filtersPageRM;
    private ResultsPageRM resultsPageRM;


    public WebModel() {
        utils = new ElementUtils();
        dashBoardPageRM=new DashBoardPageRM();
        dashBoardPageKG = new DashBoardPageKG();
        brandPageKG = new BrandPageKG();
        mensShoePageKG = new Mens_ShoePageKG();
        checkOutPageKG = new CheckOutPageKG();
        filtersPageRM=new FiltersPageRM();
        resultsPageRM=new ResultsPageRM();


    }

    public ElementUtils getUtils() {
        return utils;
    }

    public DashBoardPageKG getDashBoardPageKG() {
        return dashBoardPageKG;
    }

    public BrandPageKG getBrandPageKG() {
        return brandPageKG;
    }

    public Mens_ShoePageKG getMensShoePageKG() {
        return mensShoePageKG;
    }

    public CheckOutPageKG getCheckOutPageKG() {
        return checkOutPageKG;
    }

    public DashBoardPageRM getDashBoardPageRM(){
        return dashBoardPageRM;
    }

    public FiltersPageRM getFiltersPageRM() {
        return filtersPageRM;
    }

    public ResultsPageRM getResultsPageRM() {
        return resultsPageRM;
    }
}



