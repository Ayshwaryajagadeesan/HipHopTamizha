package com.example.jagadeesan.hiphoptamizha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jagadeesan on 10-09-17.
 */

public class VideoContent1 {
    public static final List<VideoItem> ITEMS = new ArrayList<>();

    static {
        ITEMS.add(new VideoItem(R.drawable.thanoruvansong, "Thani Oruvan", "Death Cab for Cutie", 515));
        ITEMS.add(new VideoItem(R.drawable.kannalakannala, "Kannala kannala", "the 1975", 591));
        ITEMS.add(new VideoItem(R.drawable.kadhalcricket, "Kadhal Cricket", "Pinback", 215));
        ITEMS.add(new VideoItem(R.drawable.theemai, "Theemai Dhan Vellum", "System of a down", 242));
        ITEMS.add(new VideoItem(R.drawable.aasaiperaasai, "Aasai Peraasai", "Two Door Cinema Club", 164));

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

