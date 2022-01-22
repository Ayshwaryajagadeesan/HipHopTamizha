package com.example.jagadeesan.hiphoptamizha;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by jagadeesan on 13-09-17.
 */

public class VideoContent10 {
   public static final List<VideoItem> ITEMS = new ArrayList<>();

    static {
        ITEMS.add(new VideoItem(R.drawable.takarutakaru, "takaru takaru", "System of a down", 242));
        ITEMS.add(new VideoItem(R.drawable.excusemekathali, "excuse me kathali", "Death Cab for Cutie", 515));
        ITEMS.add(new VideoItem(R.drawable.adichunorukuda, "adichu norukuda", "the 1975", 591));
        ITEMS.add(new VideoItem(R.drawable.chennaicitygangsta, "chennai city gangsta", "Pinback", 215));
        ITEMS.add(new VideoItem(R.drawable.ethirneechal, "ethir neechal", "System of a down", 242));
        ITEMS.add(new VideoItem(R.drawable.thapellamthappeilla, "Thapellam thappe illa", "System of a down", 242));
        ITEMS.add(new VideoItem(R.drawable.pakkamvanthu, "pakkam vanthu", "Death Cab for Cutie", 515));
        ITEMS.add(new VideoItem(R.drawable.ezhuvomva, "ezhuvomva", "the 1975", 591));
        ITEMS.add(new VideoItem(R.drawable.nicevsnaugty, "nice vs naughty", "Pinback", 215));
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
