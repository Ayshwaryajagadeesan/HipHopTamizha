package com.example.jagadeesan.hiphoptamizha;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.etiya.etiyabadgetablib.EtiyaBadgeTab;
import com.squareup.picasso.Picasso;
import java.util.List;
import technolifestyle.com.imageslider.FlipperLayout;


public class ProductDetailsActivity extends AppCompatActivity {
    ImageView  qImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final FlipperLayout flipperLayout;
        setContentView(R.layout.activity_product_details);
        qImageView = (ImageView) findViewById(R.id.ImageViewProduct);
        List<Shoe> catalog = ShoppingCartHelper.getCatalog(getResources());
        int productIndex = getIntent().getExtras().getInt(
                ShoppingCartHelper.PRODUCT_INDEX);
        final Shoe selectedProduct = catalog.get(productIndex);
        TextView productDetailsTextView = (TextView) findViewById(R.id.TextViewProductDetails);
        productDetailsTextView.setText(selectedProduct.getTitle());
        Picasso.with(getApplicationContext()).load(selectedProduct.getImageUrl()).into(qImageView);
        TextView productPriceTextView = (TextView) findViewById(R.id.TextViewProductPrice);
        productPriceTextView.setText("Rs" + selectedProduct.getprice());
        TextView textViewCurrentQuantity = (TextView) findViewById(R.id.textViewCurrentlyInCart);
              textViewCurrentQuantity.setText("Currently in Cart: "
                                           + ShoppingCartHelper.getProductQuantity(selectedProduct));
        final EditText editTextQuantity = (EditText) findViewById(R.id.editTextQuantity);
        final EtiyaBadgeTab etiyaBadgeTab = (EtiyaBadgeTab)findViewById(R.id.etiyaBadgeTabs);
                                    Button addToCartButton = (Button) findViewById(R.id.ButtonAddToCart);
                                    addToCartButton.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {
                                            int quantity = 0;
                                            try {
                                                quantity = Integer.parseInt(editTextQuantity.getText()
                                                        .toString());

                                                if (quantity < 0) {
                                                    Toast.makeText(getBaseContext(),
                                                            "Please enter a quantity of 0 or higher",
                                                            Toast.LENGTH_SHORT).show();
                                                    return;
                                                }

                                            } catch (Exception e) {
                                                Toast.makeText(getBaseContext(),
                                                        "Please enter a numeric quantity",
                                                        Toast.LENGTH_SHORT).show();

                                                return;
                                            }
                                            int prevquantity1 = ShoppingCartHelper.getProductQuantity(selectedProduct);

                                            Home.finalquantity=Home.finalquantity+quantity;
                                            ShoppingCartHelper.setQuantity(selectedProduct, quantity);
                                             ShopNow.allowRefresh=true;
                                            finish();
                                        }
                                    });

                                }
                               }
