package com.company.ecommerceapp.DataModel;

public class Tax {

    public Tax(double taxNum, String countryName) {

        this.countryName = countryName;

        if(countryName=="USA")
        {

            this.taxNum = taxNum * 7.5 / 100;
        }
        if(countryName=="UK"){
            this.taxNum = taxNum * 5/ 100;
        }

    }

    public double getTaxNum() {
        return taxNum;
    }

    public String getCountryName() {
        return countryName;
    }

    double taxNum;
    String countryName;


}
