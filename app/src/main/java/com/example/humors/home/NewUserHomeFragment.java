package com.example.humors.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.humors.R;
public class NewUserHomeFragment extends Fragment {

    CardView learnAboutHumors;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        init();
    }

    private void init() {
        initialiseVariables();
        fetchData();
        setViews();
        setListeners();
        setObservers();
    }

    private void initialiseVariables() {

        learnAboutHumors = requireView().findViewById(R.id.learn_about_card_view);

    }

    private void fetchData() {

    }

    private void setViews() {
//        learnAboutHumors.setLayoutParams(new LinearLayout.LayoutParams(
//                learnAboutHumors.getWidth(), learnAboutHumors.getWidth()
//        ));

    }

    private void setListeners() {

    }

    private void setObservers() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_user_home, container, false);
    }
}