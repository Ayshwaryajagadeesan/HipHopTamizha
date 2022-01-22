package com.example.jagadeesan.hiphoptamizha;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.google.firebase.messaging.FirebaseMessaging;


public class Settings extends Fragment implements android.widget.CompoundButton.OnCheckedChangeListener {
    Switch mySwitch = null;


    public Settings() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        mySwitch = (Switch) view.findViewById(R.id.switch1);
        mySwitch = (Switch) view.findViewById(R.id.switch2);
        mySwitch.setOnCheckedChangeListener(Settings.this);
        return view;
}


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            FirebaseMessaging.getInstance().subscribeToTopic("sale");
        } else {
            FirebaseMessaging.getInstance().unsubscribeFromTopic("sale");
        }
    }



}
