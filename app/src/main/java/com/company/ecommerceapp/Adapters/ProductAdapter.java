package com.company.ecommerceapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.company.ecommerceapp.DataModel.Product;
import com.company.ecommerceapp.R;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    ArrayList<Product> productArrayList = new ArrayList<>();

    public ProductAdapter(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list_item,parent,false);
       ProductViewHolder holder = new ProductViewHolder(v);
       return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.txtProdName.setText(productArrayList.get(position).getName());
        holder.txtProdDesc.setText(productArrayList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }

    public class ProductViewHolder  extends RecyclerView.ViewHolder {

      final  TextView txtProdName ;
       final  TextView txtProdDesc;
       final Button btnAddtoCart;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            txtProdDesc = itemView.findViewById(R.id.txtProductDesc);
            txtProdName = itemView.findViewById(R.id.txtProuctName);
            btnAddtoCart = itemView.findViewById(R.id.btnAddToCart);
        }
    }
}
