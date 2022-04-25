package com.company.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.company.ecommerceapp.Adapters.CartListAdapter;
import com.company.ecommerceapp.DataModel.Cart;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
RecyclerView listOfCartItems;
ArrayList<Cart>  cartList;
CartListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_layout);

        listOfCartItems = findViewById(R.id.recyclerViewCartItems);
        listOfCartItems.setLayoutManager(new LinearLayoutManager(CartActivity.this));
       // adapter = new CartListAdapter(new ArrayList<Product>(new Product(1,"p 1",45.99,"electronics"),new Product(2,"p 2",99.9,"Hardware")));
      //  listOfCartItems.setAdapter(adapter);
    }
}