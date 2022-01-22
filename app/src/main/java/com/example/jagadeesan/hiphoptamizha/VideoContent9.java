package com.example.jagadeesan.hiphoptamizha;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by jagadeesan on 13-09-17.
 */

public class VideoContent9 {
    public static final List<VideoItem> ITEMS = new ArrayList<>();

    static {
        ITEMS.add(new VideoItem(R.drawable.hiphoptamizhancover, "Manithan Tamizhan", "Death Cab for Cutie", 515));
        ITEMS.add(new VideoItem(R.drawable.hiphoptamizhancover, "Tamizhanda", "the 1975", 591));
        ITEMS.add(new VideoItem(R.drawable.hiphoptamizhancover, "Tamizh Theriyum", "Pinback", 215));
        ITEMS.add(new VideoItem(R.drawable.clublemuble, "Club le Mub le", "System of a down", 242));
        ITEMS.add(new VideoItem(R.drawable.hiphoptamizhancover, "Sentamizh Penne", "System of a down", 242));
        ITEMS.add(new VideoItem(R.drawable.hiphoptamizhancover, "Ini Illaye Hum", "Death Cab for Cutie", 515));
        ITEMS.add(new VideoItem(R.drawable.hiphoptamizhancover, "Cheap Popularity(skit)", "the 1975", 591));
        ITEMS.add(new VideoItem(R.drawable.iraiva, "Iraiva", "Pinback", 215));
        ITEMS.add(new VideoItem(R.drawable.hiphoptamizhancover, "Karpom Karpipom", "System of a down", 242));
        ITEMS.add(new VideoItem(R.drawable.hiphoptamizhancover, "Hey do what I say", "System of a down", 242));
        ITEMS.add(new VideoItem(R.drawable.hiphoptamizhancover, "Stop piracy (Outro)", "System of a down", 242));


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

