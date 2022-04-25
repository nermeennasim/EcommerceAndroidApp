package com.company.ecommerceapp.DataModel;

import java.util.List;

public class Cart {


    List<Product> prodListInCart;
    Tax infoTax;
    double TotalAmountForCheckout;
    Tax taxOfSelectedCountry;
    String selectedCountry;

    public Cart(List<Product> cartList,
                double totalAmountForCheckout, Tax taxOfSelectedCountry, String selectedCountry) {
        this.prodListInCart = cartList;

        this.infoTax = infoTax;
        TotalAmountForCheckout = totalAmountForCheckout;
        this.taxOfSelectedCountry = taxOfSelectedCountry;
        this.selectedCountry = selectedCountry;
    }

    public List<Product> getCartList() {
        return prodListInCart;
    }

    public void setCartList(List<Product> cartList) {
        this.prodListInCart = cartList;
    }

    public List<Order> getOrders() {
      return null;
    }



    public Tax getInfoTax() {
        return infoTax;
    }

    public void setInfoTax(Tax infoTax) {
        this.infoTax = infoTax;
    }

    public double getTotalAmountForCheckout() {
        return TotalAmountForCheckout;
    }

    public void setTotalAmountForCheckout(double totalAmountForCheckout) {
        TotalAmountForCheckout = totalAmountForCheckout;
    }

    public Tax getTaxOfSelectedCountry() {
        return taxOfSelectedCountry;
    }

    public void setTaxOfSelectedCountry(Tax taxOfSelectedCountry) {
        this.taxOfSelectedCountry = taxOfSelectedCountry;
    }

    public String getSelectedCountry() {
        return selectedCountry;
    }

    public void setSelectedCountry(String selectedCountry) {
        this.selectedCountry = selectedCountry;
    }


}
