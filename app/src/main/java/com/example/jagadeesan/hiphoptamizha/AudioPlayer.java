package com.example.jagadeesan.hiphoptamizha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jagadeesan.hiphoptamizha.R;
import com.example.jagadeesan.hiphoptamizha.MusicContent;
import com.example.jagadeesan.hiphoptamizha.RecyclerViewAdapter;

public class AudioPlayer extends PlayerActivity {
//    public static final String AUDIO_REQUEST="yes";
    private View mCoverView;
    private View mTitleView;
    private View mTimeView;
    private View mDurationView;
    private View mProgressView;
    private View mFabView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list);
        Bundle bundle = getIntent().getExtras();
        String titleresult = bundle.getString("TitleKey");
        String titleresult1=dataholder.getData();
        TextView name=(TextView)findViewById(R.id.name);
        name.setText(titleresult);
       Toast.makeText(AudioPlayer.this, titleresult1, Toast.LENGTH_LONG).show();

        mCoverView = findViewById(R.id.cover);
        mTitleView = findViewById(R.id.title);
        mTimeView = findViewById(R.id.time);
        mDurationView = findViewById(R.id.duration);
        mProgressView = findViewById(R.id.progress);
        mFabView = findViewById(R.id.fab);

        // Set the recycler adapter
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tracks);
        assert recyclerView != null;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        if (titleresult.equals("Meesaya Murukku") || titleresult.equals("Enna Nadanthalum") || titleresult.equals("Sakarakatti") || titleresult.equals("Machi Enagaluku") || titleresult.equals("Vaadi Pulla Vaadi") || titleresult.equals("GreatJi") || titleresult.equals("Maatikichu"))
            recyclerView.setAdapter(new RecyclerViewAdapter13(VideoContent.ITEMS));
        if (titleresult.equals("Thani Oruvan") || titleresult.equals("Kannala kannala") || titleresult.equals("Kadhal Cricket") || titleresult.equals("Theemai Dhan Vellum") || titleresult.equals("Aasai Peraasai"))
            recyclerView.setAdapter(new RecyclerViewAdapter14(VideoContent1.ITEMS));
        if (titleresult.equals("Kavan") || titleresult.equals("Theeratha Villayatu Pillai") || titleresult.equals("Boomerang") || titleresult.equals("Oxygen") || titleresult.equals("Mathuraangalam") || titleresult.equals("Happy New Year"))
            recyclerView.setAdapter(new RecyclerViewAdapter15(VideoContent2.ITEMS));
        if (titleresult.equals("Aambala") || titleresult.equals("Madras To Madurai") || titleresult.equals("Pazhagikalam") || titleresult.equals("VaaVaaVaa Vennila") || titleresult.equals("Aye Aye Aye") || titleresult.equals("Yaar Enna Sonnalum") || titleresult.equals("Inbam Pongum Vennila"))
            recyclerView.setAdapter(new RecyclerViewAdapter16(VideoContent3.ITEMS));
        if (titleresult.equals("Aranmanai 2") || titleresult.equals("Party WIth Pei") || titleresult.equals("Maaya maaya") || titleresult.equals("Poraada Poraada") || titleresult.equals("Kuchi Mittai") || titleresult.equals("Amma") || titleresult.equals("Aranmanai Theme"))
            recyclerView.setAdapter(new RecyclerViewAdapter17(VideoContent4.ITEMS));
        if (titleresult.equals("Indru Netru Nalai") || titleresult.equals("Iphone6") || titleresult.equals("Kadhale Kadhale") || titleresult.equals("Naane Thaan Raja") || titleresult.equals("Kuchi Mittai") || titleresult.equals("The Conquest of Time"))
            recyclerView.setAdapter(new RecyclerViewAdapter18(VideoContent5.ITEMS));
        if (titleresult.equals("kathakali") || titleresult.equals("Azhagae") || titleresult.equals("Erangi Vanthu") || titleresult.equals("whistle theme"))
            recyclerView.setAdapter(new RecyclerViewAdapter19(VideoContent6.ITEMS));
        if (titleresult.equals("Dhruva") || titleresult.equals("Choosa Choosa") || titleresult.equals("Pareshanuraaa") || titleresult.equals("Neethoney Dance") || titleresult.equals("Manishi Musugulo Mrugam"))
            recyclerView.setAdapter(new RecyclerViewAdapter20(VideoContent7.ITEMS));
        if (titleresult.equals("Kathi Sandai") || titleresult.equals("Naan Konjum Karupu") || titleresult.equals("Idhayam") || titleresult.equals("Ellame Kaasu") || titleresult.equals("Kathi Sandai Theme"))
            recyclerView.setAdapter(new RecyclerViewAdapter21(VideoContent8.ITEMS));
        if (titleresult.equals("Hip Hop Tamizhan") || titleresult.equals("Manithan Tamizhan") || titleresult.equals("Tamizhanda") || titleresult.equals("Tamizh Theriyum") || titleresult.equals("Club le Mub le") || titleresult.equals("Sentamizh Penne") || titleresult.equals("Ini Illaye Hum") || titleresult.equals("Cheap Popularity(skit)") || titleresult.equals("Iraiva") || titleresult.equals("Karpom Karpipom") || titleresult.equals("Hey do what I say") || titleresult.equals("Stop piracy (Outro)"))
            recyclerView.setAdapter(new RecyclerViewAdapter22(VideoContent9.ITEMS));
        if (titleresult.equals("takaru takaru") || titleresult.equals("Non Album Singles") || titleresult.equals("excuse me kathali") || titleresult.equals("adichu norukuda") || titleresult.equals("chennai city gangsta") || titleresult.equals("ethir neechal") || titleresult.equals("Thapellam thappe illa") || titleresult.equals("pakkam vanthu") || titleresult.equals("ezhuvomva") || titleresult.equals("nice vs naughty"))
            recyclerView.setAdapter(new RecyclerViewAdapter23(VideoContent10.ITEMS));
        if (titleresult.equals("International Tamizhan") || titleresult.equals("Vaadi Pulla Vaadi"))
            recyclerView.setAdapter(new RecyclerViewAdapter24(VideoContent11.ITEMS));
    }

    public void onFabClick(View view) {
        //noinspection unchecked
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                new Pair<>(mCoverView, ViewCompat.getTransitionName(mCoverView)),
                new Pair<>(mTitleView, ViewCompat.getTransitionName(mTitleView)),
                new Pair<>(mTimeView, ViewCompat.getTransitionName(mTimeView)),
                new Pair<>(mDurationView, ViewCompat.getTransitionName(mDurationView)),
                new Pair<>(mProgressView, ViewCompat.getTransitionName(mProgressView)),
                new Pair<>(mFabView, ViewCompat.getTransitionName(mFabView)));
        ActivityCompat.startActivity(AudioPlayer.this, new Intent(AudioPlayer.this, DetailActivity.class), options.toBundle());
    }

}

