package com.example.jagadeesan.hiphoptamizha;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

/**
 * Created by jagadeesan on 14-09-17.
 */

public class RecyclerViewAdapter20 extends RecyclerView.Adapter<RecyclerViewAdapter20.ViewHolder> {
    private final List<VideoContent7.VideoItem> mValues;
    private Context context;

    public RecyclerViewAdapter20(List<VideoContent7.VideoItem> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_list_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mCoverView.setImageResource(holder.mItem.getCover());
        holder.mTitleView.setText(holder.mItem.getTitle());
        holder.mArtistView.setText(holder.mItem.getArtist());
        holder.mDurationView.setText(DateUtils.formatElapsedTime(holder.mItem.getDuration()));

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //((Activity)context).finish();
                dataholder.setData(holder.mItem.getTitle().toString());
                Intent intent = new Intent(v.getContext(), AudioPlayer.class);

                intent.putExtra("TitleKey",holder.mItem.getTitle().toString());
                intent.addFlags(FLAG_ACTIVITY_NEW_TASK);
                //mContext.getApplicationContext().startActivity(intent);
                v.getContext().startActivity(intent);




            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final ImageView mCoverView;
        public final TextView mTitleView;
        public final TextView mArtistView;
        public final TextView mDurationView;
        public VideoContent7.VideoItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mCoverView = (ImageView) view.findViewById(R.id.cover);
            mTitleView = (TextView) view.findViewById(R.id.title);
            mArtistView = (TextView) view.findViewById(R.id.artist);
            mDurationView = (TextView) view.findViewById(R.id.duration);
        }
    }
}