package com.example.jagadeesan.hiphoptamizha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.pierfrancescosoffritti.youtubeplayer.AbstractYouTubeListener;
import com.pierfrancescosoffritti.youtubeplayer.YouTubePlayerView;

public class Video extends AppCompatActivity {
    private View mCoverView;
    private View mTitleView;
    private View mTimeView;
    private View mDurationView;
    private View mProgressView;
    private View mFabView;
    public String video_string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Bundle bundle = getIntent().getExtras();
        String titleresult = bundle.getString("TitleKey");
        TextView name=(TextView)findViewById(R.id.name);
        name.setText(titleresult);
        //Toast.makeText(getApplication(), titleresult, Toast.LENGTH_SHORT).show();
        if (titleresult.equals("International Tamizhan") || titleresult.equals("Vaadi Pulla Vaadi")) {
            video_string = "X0JXXLdDnp4";
        }
        if (titleresult.equals("Meesaya Murukku")) {
            video_string = "IShvgCm8JdM";
        }
        if (titleresult.equals("Enna Nadanthalum")) {
            video_string = "iG7wrYO0IX0";
        }
        if (titleresult.equals("Sakarakatti")) {
            video_string = "8YJdRIf9sd0";
        }
        if (titleresult.equals("Machi Enagaluku")) {
            video_string = "W9ZABxh9uuc";
        }
        if (titleresult.equals("Vaadi Nee Vaadi")) {
            video_string = "7Izv9MeGaHY";
        }
        if (titleresult.equals("Maatikichu")) {
            video_string = "tT1RNYIdPwA";
        }
        if (titleresult.equals("GreatJi")) {
            video_string = "FBxZ44qyPwg";
        }
        if (titleresult.equals("Thani Oruvan")) {

            video_string = "FBxZ44qyPwg";
        }
        if (titleresult.equals("Kannala kannala")) {

            video_string = "iHagLitT-nl";
        }
        if (titleresult.equals("Kadhal Cricket")) {

            video_string = "xzxr6fxdI_E";
        }
        if (titleresult.equals("Theemai Dhan Vellum")) {

            video_string = "yLFm1i6YVdI";
        }
        if (titleresult.equals("Aasai Peraasai")) {

            video_string = "TFfnpqow0_ky";
        }
        if (titleresult.equals("Kavan") || titleresult.equals("Theeratha Villayatu Pillai")) {

            video_string = "yDKTZemqVZo";
        }
        if (titleresult.equals("oxygen")) {

            video_string = "7M9hc_PC_Vg";
        }
        if (titleresult.equals("Boomerang")) {

            video_string = "GjCW9POJ7i8";
        }
        if (titleresult.equals("Mathuraangalam")) {

            video_string = "K6vtt3DXEnw";
        }
        if (titleresult.equals("Happy New Year")) {

            video_string = "mnBUaFo9VQA";
        }
        if (titleresult.equals("Aambala") || titleresult.equals("Madras To Madurai")) {

            video_string = "6oBvMxax93A";
        }
        if (titleresult.equals("Pazhagikalam")) {

            video_string = "GVRZd2RclkQ";
        }
        if (titleresult.equals("VaaVaaVaa Vennila")) {

            video_string = "J28_McaEl50";
        }
        if (titleresult.equals("Aye Aye Aye")) {

            video_string = "WxtCoyRsN4k";
        }
        if (titleresult.equals("Yaar Enna Sonnalum")) {

            video_string = "M1isvrDYyRg";
        }
        if (titleresult.equals("Inbam Pongum Vennila")) {

            video_string = "xivDjc7nA5g";
        }
        if (titleresult.equals("Aranmanai 2") || titleresult.equals("Party WIth Pei")) {
            Toast.makeText(getApplication(), titleresult, Toast.LENGTH_SHORT).show();

            video_string = "mLaVG3hf5Wg";
        }
        if (titleresult.equals("Maaya maaya")) {

            video_string = "gSqRPPpdNPY";
        }
        if (titleresult.equals("Poraada Poraada")) {

            video_string = "e7nCGoPQW-E";
        }
        if (titleresult.equals("Kuchi Mittai")) {

            video_string = "2gTEZLdIWAg";
        }
        if (titleresult.equals("Amma")) {

            video_string = "niNeTo0q7AY";
        }
        if (titleresult.equals("Aranmanai Theme")) {

            video_string = "Ip1D5sdyNls";
        }
        if (titleresult.equals("Indru Netru Nalai")) {

            video_string = "mFcnI52vTAQ";
        }
        if (titleresult.equals("Iphone6")) {

            video_string = "bVu3V8dRjV4";
        }
        if (titleresult.equals("Kadhale Kadhale")) {

            video_string = "L8V3ylj4NUA";
        }
        if (titleresult.equals("Naane Thaan Raja")) {

            video_string = "EKNibTXceGg";
        }
        if (titleresult.equals("The Conquest of Time")) {

            video_string = "iimuZz9vXho";
        }
        if (titleresult.equals("kathakali")) {

            video_string = "gWNSqHctq48";
        }
        if (titleresult.equals("Azhagae")) {

            video_string = "nbobHjLZeTM";
        }
        if (titleresult.equals("Erangi Vanthu")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("whistle theme")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Dhruva")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Choosa Choosa")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Pareshanuraaa")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Neethoney Dance")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Manishi Musugulo Mrugam")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Kathi Sandai")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Naan Konjum Karupu")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Idhayam")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Ellame Kaasu")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Kathi Sandai Theme")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Hip Hop Tamizhan") || titleresult.equals("Manithan Tamizhan")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Tamizhanda")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Tamizh Theriyum")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Club le Mub le")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Sentamizh Penne")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Ini Illaye Hum")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Cheap Popularity(skit)")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Iraiva")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Karpom Karpipom")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Hey do what I say")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Stop piracy (Outro)")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("takaru takaru") || titleresult.equals("Non Album Singles")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("excuse me kathali")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("adichu norukuda")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("chennai city gangsta")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("ethir neechal")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("Thapellam thappe illa")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("pakkam vanthu")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("ezhuvomva")) {

            video_string = "CHnPPPUgwWU";
        }
        if (titleresult.equals("nice vs naughty")) {

            video_string = "CHnPPPUgwWU";
        }
        final YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player_view);
        youTubePlayerView.initialize(new AbstractYouTubeListener() {
            @Override
            public void onReady() {
                youTubePlayerView.loadVideo(video_string, 0);
            }
        }, true);
        //
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
            recyclerView.setAdapter(new RecyclerViewAdapter1(VideoContent.ITEMS));
        if (titleresult.equals("Thani Oruvan") || titleresult.equals("Kannala kannala") || titleresult.equals("Kadhal Cricket") || titleresult.equals("Theemai Dhan Vellum") || titleresult.equals("Aasai Peraasai"))
            recyclerView.setAdapter(new RecyclerViewAdapter2(VideoContent1.ITEMS));
        if (titleresult.equals("Kavan") || titleresult.equals("Theeratha Villayatu Pillai") || titleresult.equals("Boomerang") || titleresult.equals("Oxygen") || titleresult.equals("Mathuraangalam") || titleresult.equals("Happy New Year"))
            recyclerView.setAdapter(new RecyclerViewAdapter3(VideoContent2.ITEMS));
        if (titleresult.equals("Aambala") || titleresult.equals("Madras To Madurai") || titleresult.equals("Pazhagikalam") || titleresult.equals("VaaVaaVaa Vennila") || titleresult.equals("Aye Aye Aye") || titleresult.equals("Yaar Enna Sonnalum") || titleresult.equals("Inbam Pongum Vennila"))
            recyclerView.setAdapter(new RecyclerViewAdapter4(VideoContent3.ITEMS));
        if (titleresult.equals("Aranmanai 2") || titleresult.equals("Party WIth Pei") || titleresult.equals("Maaya maaya") || titleresult.equals("Poraada Poraada") || titleresult.equals("Kuchi Mittai") || titleresult.equals("Amma") || titleresult.equals("Aranmanai Theme"))
            recyclerView.setAdapter(new RecyclerViewAdapter5(VideoContent4.ITEMS));
        if (titleresult.equals("Indru Netru Nalai") || titleresult.equals("Iphone6") || titleresult.equals("Kadhale Kadhale") || titleresult.equals("Naane Thaan Raja") || titleresult.equals("Kuchi Mittai") || titleresult.equals("The Conquest of Time"))
            recyclerView.setAdapter(new RecyclerViewAdapter6(VideoContent5.ITEMS));
        if (titleresult.equals("kathakali") || titleresult.equals("Azhagae") || titleresult.equals("Erangi Vanthu") || titleresult.equals("whistle theme"))
            recyclerView.setAdapter(new RecyclerViewAdapter7(VideoContent6.ITEMS));
        if (titleresult.equals("Dhruva") || titleresult.equals("Choosa Choosa") || titleresult.equals("Pareshanuraaa") || titleresult.equals("Neethoney Dance") || titleresult.equals("Manishi Musugulo Mrugam"))
            recyclerView.setAdapter(new RecyclerViewAdapter8(VideoContent7.ITEMS));
        if (titleresult.equals("Kathi Sandai") || titleresult.equals("Naan Konjum Karupu") || titleresult.equals("Idhayam") || titleresult.equals("Ellame Kaasu") || titleresult.equals("Kathi Sandai Theme"))
            recyclerView.setAdapter(new RecyclerViewAdapter9(VideoContent8.ITEMS));
        if (titleresult.equals("Hip Hop Tamizhan") || titleresult.equals("Manithan Tamizhan") || titleresult.equals("Tamizhanda") || titleresult.equals("Tamizh Theriyum") || titleresult.equals("Club le Mub le") || titleresult.equals("Sentamizh Penne") || titleresult.equals("Ini Illaye Hum") || titleresult.equals("Cheap Popularity(skit)") || titleresult.equals("Iraiva") || titleresult.equals("Karpom Karpipom") || titleresult.equals("Hey do what I say") || titleresult.equals("Stop piracy (Outro)"))
            recyclerView.setAdapter(new RecyclerViewAdapter10(VideoContent9.ITEMS));
        if (titleresult.equals("takaru takaru") || titleresult.equals("Non Album Singles") || titleresult.equals("excuse me kathali") || titleresult.equals("adichu norukuda") || titleresult.equals("chennai city gangsta") || titleresult.equals("ethir neechal") || titleresult.equals("Thapellam thappe illa") || titleresult.equals("pakkam vanthu") || titleresult.equals("ezhuvomva") || titleresult.equals("nice vs naughty"))
            recyclerView.setAdapter(new RecyclerViewAdapter11(VideoContent10.ITEMS));
        if (titleresult.equals("International Tamizhan") || titleresult.equals("Vaadi Pulla Vaadi"))
            recyclerView.setAdapter(new RecyclerViewAdapter12(VideoContent11.ITEMS));
    }}
