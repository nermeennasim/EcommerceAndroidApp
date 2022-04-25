package com.company.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.company.ecommerceapp.Adapters.ProductAdapter;
import com.company.ecommerceapp.DataModel.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsList extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter ;
    ArrayList<Product> productArrayList;
    Button btnAddToCart;

    List<String> arrayList;

    ArrayAdapter<String> prodAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_list);
//data can later come from database
        //we can simply call operations like add product
        //update product
        //delete product

        btnAddToCart = findViewById(R.id.btnAddToCart);
        recyclerView = findViewById(R.id.recyclerViewItems);

        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProductsList.this,CartActivity.class);
                startActivity(i);
                finish();
            }
        });
    //    arrayList = new ArrayList<String>();
      //  arrayList.add("mouse");

     //   arrayList.add("computer");

//        recyclerView.setLayoutManager(new LinearLayoutManager(ProductsList.this
      //  ));

      //  recyclerView.setAdapter(prodAdapter);



       productArrayList.add(new Product("Mouse","HP Mouse wireless",25.99,"hardware",1));
       // productArrayList.add(new Product("laptop","HP Mouse wireless",100.29,"hardware",2));
     //   productArrayList.add(new Product("Headphone","HP Mouse wireless",20.99,"hardware",3));



       adapter = new ProductAdapter(productArrayList);


     recyclerView.setLayoutManager(new LinearLayoutManager(ProductsList.this));
     recyclerView.setAdapter(adapter);
    }
}