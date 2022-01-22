package com.example.jagadeesan.hiphoptamizha;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jagadeesan on 13-09-17.
 */

public class VideoContent11 {
    public static final List<VideoItem> ITEMS = new ArrayList<>();

    static {
        ITEMS.add(new VideoItem(R.drawable.vaadipullavaadi, "Vaadi Pulla Vaadi", "Hip Hop Tamizha", 246));

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


