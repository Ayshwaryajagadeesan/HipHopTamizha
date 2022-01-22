package com.example.jagadeesan.hiphoptamizha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jagadeesan on 13-09-17.
 */

public class VideoContent7 {
    public static final List<VideoItem> ITEMS = new ArrayList<>();

static {
        ITEMS.add(new VideoItem(R.drawable.dhruvadhruva, "Dhruva", "Death Cab for Cutie", 515));
        ITEMS.add(new VideoItem(R.drawable.choosachoosa, "Choosa Choosa", "the 1975", 591));
        ITEMS.add(new VideoItem(R.drawable.parshanura, "Pareshanuraaa", "Pinback", 215));
        ITEMS.add(new VideoItem(R.drawable.neethoneydance, "Neethoney Dance", "System of a down", 242));
        ITEMS.add(new VideoItem(R.drawable.manishimusugulomrugam, "Manishi Musugulo Mrugam", "System of a down", 242));


        }

public static class VideoItem {

    private final int mCover;
    private final String mTitle;
    private final String mArtist;
    private final long mDuration;

    public VideoItem(int cover, String title, String artist, long duration) {
        mCover = cover;
        mTitle = title;
        mArtist = artist;
        mDuration = duration;
    }

    public int getCover() {
        return mCover;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public long getDuration() {
        return mDuration;
    }
}
}
