package com.myselfanuj.isong.views.songdetail;


import com.myselfanuj.isong.api.model.Track;

public class SongDetailContract {

    interface View {
        void displayMessage(String message);

        void displayTrack(Track track);
    }
}
