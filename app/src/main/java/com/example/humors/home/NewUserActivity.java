package com.example.humors.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.humors.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.MaterialShapeDrawable;

public class NewUserActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        init();
    }

    private void init() {
        initialiseVariables();
        fetchData();
        setViews();
        setListeners();
        setObservers();
        setCurrentFragment(new NewUserHomeFragment());
    }

    private void setCurrentFragment(Fragment fragment) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.new_user_fragment_container, fragment)
                    .disallowAddToBackStack().commit();
        }

    private void initialiseVariables() {

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

    }

    private void fetchData() {

    }

    private void setViews() {
        bottomNavigationView.getMenu().findItem(R.id.home_item).setChecked(true);

        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) bottomNavigationView.getBackground();
        materialShapeDrawable.setShapeAppearanceModel(
                materialShapeDrawable
                .getShapeAppearanceModel().toBuilder()
                .setTopLeftCorner(CornerFamily.ROUNDED, 40)
                .setTopRightCorner(CornerFamily.ROUNDED, 40).build()
        );
    }

    private void setListeners() {

    }

    private void setObservers() {

    }

    public static Intent newInstance(Context context) {
        final Intent intent = new Intent(context, NewUserActivity.class);
        return intent;
    }
}