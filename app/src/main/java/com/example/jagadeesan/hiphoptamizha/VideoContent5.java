package com.example.jagadeesan.hiphoptamizha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jagadeesan on 13-09-17.
 */

public class VideoContent5 {
    public static final List<VideoItem> ITEMS = new ArrayList<>();

    static {
        ITEMS.add(new VideoItem(R.drawable.iphone6, "Iphone6", "Death Cab for Cutie", 515));
        ITEMS.add(new VideoItem(R.drawable.kadhalekadhale, "Kadhale Kadhale", "the 1975", 591));
        ITEMS.add(new VideoItem(R.drawable.naanethaanraja, "Naane Thaan Raja", "Pinback", 215));
        ITEMS.add(new VideoItem(R.drawable.indrunetrunaalai, "Indru Netru Nalai", "System of a down", 242));
        ITEMS.add(new VideoItem(R.drawable.conquestoftime, "The Conquest of Time", "Two Door Cinema Club", 164));


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
