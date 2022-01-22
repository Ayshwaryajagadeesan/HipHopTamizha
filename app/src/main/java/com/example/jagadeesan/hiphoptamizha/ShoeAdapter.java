package com.example.jagadeesan.hiphoptamizha;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.mostafaaryan.transitionalimageview.TransitionalImageView;
import com.mostafaaryan.transitionalimageview.model.TransitionalImage;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.util.List;

/**
 * Created by jagadeesan on 31-08-17.
 */

public class ShoeAdapter extends RecyclerView.Adapter<ShoeAdapter.ViewHolder> {

    Context mContext;
    List<Shoe> shoes ;
    private List<Shoe> mProductList;
    private LayoutInflater mInflater;
    private boolean mShowQuantity;


    public ShoeAdapter(Context context, List<Shoe> shoes) {
        mContext = context;
        this.shoes = shoes;
    }

    public ShoeAdapter(List<Shoe> list, LayoutInflater inflater, boolean showQuantity) {
        mProductList = list;
        mInflater = inflater;
        mShowQuantity = showQuantity;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_shoe, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        final Shoe shoe = shoes.get(position);

        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                try{

                    final Bitmap bitmap = Picasso.with(mContext).load(shoe.getImageUrl()).get();
                    ((Activity) mContext).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            TransitionalImage transitionalImage = new TransitionalImage.Builder()
                                    .duration(500)
                            /*.backgroundColor(ContextCompat.getColor(, R.color.colorAccent))*/
                                    /*.image(R.drawable.sample_image)*/
                                    .image(bitmap)
                                    .create();
                            holder.image.setTransitionalImage(transitionalImage);
                            //bitmap.recycle();
                        }
                    });
                } catch (IOException e){e.printStackTrace();}
            }
        });
        holder.title.setText(shoe.getTitle());
        holder.sizes.setText("Rs."+shoe.getprice());
    }

    @Override
    public int getItemCount() {
        return shoes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView title;
        public TextView sizes;
        public TransitionalImageView image;
        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = (TextView) itemView.findViewById(R.id.shoe_title);
            sizes = (TextView) itemView.findViewById(R.id.shoe_sizes);
            image = (TransitionalImageView) itemView.findViewById(R.id.shoe_image);

        }
        @Override
        public void onClick(View view) {
            int position=getPosition();
            //Toast.makeText(view.getContext(), "position = " + getPosition(), Toast.LENGTH_SHORT).show();
            Intent productDetailsIntent = new Intent(view.getContext(),ProductDetailsActivity.class);
            productDetailsIntent.putExtra(ShoppingCartHelper.PRODUCT_INDEX,position );
           view.getContext().startActivity(productDetailsIntent);
        }
    }


}



