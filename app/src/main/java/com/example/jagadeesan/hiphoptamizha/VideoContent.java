package com.example.jagadeesan.hiphoptamizha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jagadeesan on 10-09-17.
 */

public class VideoContent {
    public static final List<VideoItem> ITEMS = new ArrayList<>();

    static {
        ITEMS.add(new VideoItem(R.drawable.meesayamurukuson, "Meesaya Murukku", "Kareshma Ravichandran, Hiphop Tamizha", 231));
        ITEMS.add(new VideoItem(R.drawable.ennanadanthalum, "Enna Nadanthalum", "Kaushik Krish, Hip Hop Tamizha", 251));
        ITEMS.add(new VideoItem(R.drawable.sakarakatti, "Sakarakatti", "Pinback", 215));
        ITEMS.add(new VideoItem(R.drawable.machiengaluku, "Machi Enagaluku", "Hiphop Tamizha", 146));
        ITEMS.add(new VideoItem(R.drawable.vadineevadi, "Vaadi Nee Vaadi", "Rajan Chelliah, Hi Hop Tamizha", 192));
        ITEMS.add(new VideoItem(R.drawable.mati, "Maatikichu", "Mahalingam, Hip Hop Tamizha", 207));
        ITEMS.add(new VideoItem(R.drawable.saitji, "GreatJi", "Hip Hop Tamizha", 272));
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

