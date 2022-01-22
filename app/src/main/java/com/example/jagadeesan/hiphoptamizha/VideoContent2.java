package com.example.jagadeesan.hiphoptamizha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jagadeesan on 12-09-17.
 */

public class VideoContent2 {
    public static final List<VideoItem> ITEMS = new ArrayList<>();

    static {
        ITEMS.add(new VideoItem(R.drawable.theeratha, "Theeratha Villayatu Pillai", "Death Cab for Cutie", 515));
        ITEMS.add(new VideoItem(R.drawable.boomerang, "Boomerang", "the 1975", 591));
        ITEMS.add(new VideoItem(R.drawable.oxygen, "Oxygen", "Pinback", 215));
        ITEMS.add(new VideoItem(R.drawable.mathuraangalam, "Mathuraangalam", "System of a down", 242));
        ITEMS.add(new VideoItem(R.drawable.happynewyear, "Happy New Year", "Two Door Cinema Club", 164));

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

