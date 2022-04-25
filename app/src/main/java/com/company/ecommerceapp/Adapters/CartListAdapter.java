package com.company.ecommerceapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.company.ecommerceapp.DataModel.Cart;
import com.company.ecommerceapp.DataModel.Product;
import com.company.ecommerceapp.R;

import java.util.ArrayList;

public class CartListAdapter extends  RecyclerView.Adapter<CartListAdapter.CartViewHolder> {
    ArrayList<Product> cartList = new ArrayList<>();
    Cart currentcart;

    public CartListAdapter(ArrayList<Product> cartList) {
        this.cartList = cartList;
    }

    @NonNull
    @Override
    public CartListAdapter.CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item_layout,parent,false);
     //  CartListAdapter holder = new CartListAdapter.CartViewHolder(v);
       return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CartListAdapter.CartViewHolder holder, int position) {
        holder.CartproductName.setText(cartList.get(position).getName());
        holder.CartproductPrice.setText((int) cartList.get(position).getPrice());
        holder.CartproductQuantity.setText(currentcart.getCartList().toString());
    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public class CartViewHolder  extends RecyclerView.ViewHolder {

        final TextView CartproductName ;
        final  TextView CartproductPrice;
        final TextView CartproductQuantity;
        Button btnIncrement;
        Button btnDecrement;



        public CartViewHolder(@NonNull View itemView) {
            super(itemView);

            CartproductName = itemView.findViewById(R.id.cartProdName);
            CartproductPrice = itemView.findViewById(R.id.cartProductPrice);
            CartproductQuantity = itemView.findViewById(R.id.txtQuantity);
            btnIncrement = itemView.findViewById(R.id.btnIncItem);
            btnDecrement = itemView.findViewById(R.id.btnDecrItem);
        }
    }

}
