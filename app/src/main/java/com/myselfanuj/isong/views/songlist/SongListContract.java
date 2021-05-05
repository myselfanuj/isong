package com.myselfanuj.isong.views.songlist;




import com.myselfanuj.isong.api.model.Track;

import java.util.List;



class SongListContract {

    interface View {
        void displayMessage(String message);

        void setLoadingIndicator(boolean isLoading);

        void displayTracks(List<Track> dataTracks);
    }

    interface Presenter {
        void getTracks(String term);
    }
}