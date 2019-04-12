package com.clabuyakchai.myapplication.ui.activity;

import android.os.Bundle;

import com.clabuyakchai.myapplication.R;
import com.clabuyakchai.myapplication.ui.fragment.cat.CatFragment;
import com.clabuyakchai.myapplication.ui.fragment.dog.DogFragment;
import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity implements FragmetStack {

    private FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            fm.beginTransaction()
                    .replace(R.id.fragment_container, CatFragment.newInstance())
                    .commit();
        }

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        add(CatFragment.newInstance(), false);
                        break;
                    case 1:
                        add(DogFragment.newInstance(), false);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void add(Fragment fragment, Boolean addToBackStack) {
        FragmentTransaction ft = fm.beginTransaction()
                .replace(R.id.fragment_container, fragment);

        if (addToBackStack)
            ft.addToBackStack(fragment.getClass().getName());

        ft.commit();
    }

    @Override
    public void pop() {
        fm.popBackStack();
    }
}
