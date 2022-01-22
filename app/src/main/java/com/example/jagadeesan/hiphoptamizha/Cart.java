package com.example.jagadeesan.hiphoptamizha;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.etiya.etiyabadgetablib.EtiyaBadgeTab;


public class Cart extends Fragment {
    private List<Shoe> mCartList;
    private ProductAdapter mProductAdapter;
    public Cart() {
       }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        //final EtiyaBadgeTab etiyaBadgeTab = (EtiyaBadgeTab) getActivity().findViewById(R.id.etiyaBadgeTabs);
        mCartList = ShoppingCartHelper.getCartList();

        // Make sure to clear the selections
        for(int i=0; i<mCartList.size(); i++) {
            mCartList.get(i).selected = false;
        }
        // Create the list
        final ListView listViewCatalog = (ListView) view.findViewById(R.id.ListViewCatalog);
        mProductAdapter = new ProductAdapter(mCartList,getActivity().getLayoutInflater(), true);
        listViewCatalog.setAdapter(mProductAdapter);

        listViewCatalog.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Toast toast = Toast.makeText(view.getContext(),
                        "Item " + (position + 1) + ": " + mCartList.get(position).getTitle(),
                        Toast.LENGTH_SHORT);
                toast.show();
                Intent productDetailsIntent = new Intent(view.getContext(),ProductDetailsActivity.class);
                productDetailsIntent.putExtra(ShoppingCartHelper.PRODUCT_INDEX, position);
                startActivity(productDetailsIntent);
            }
        });


        Button viewShoppingCart = (Button) view.findViewById(R.id.Button02);
        viewShoppingCart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent viewShoppingCartIntent = new Intent(v.getContext(),finalcard.class);
                startActivity(viewShoppingCartIntent);
            }
        });
        double subTotal = 0;
        for(Shoe p : mCartList) {
            int quantity = ShoppingCartHelper.getProductQuantity(p);
            subTotal += p.getprice() * quantity;
        }
        TextView productPriceTextView = (TextView) view.findViewById(R.id.TextViewSubtotal);
        productPriceTextView.setText("Subtotal: Rs." + subTotal);

        return view;
    }

}
