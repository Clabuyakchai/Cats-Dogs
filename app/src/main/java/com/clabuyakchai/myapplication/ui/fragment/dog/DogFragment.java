package com.clabuyakchai.myapplication.ui.fragment.dog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.clabuyakchai.myapplication.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dagger.android.support.DaggerFragment;

public class DogFragment extends DaggerFragment {
    private static final String TAG = "Dog";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

    }

    public static DogFragment newInstance(){
        return new DogFragment();
    }
}
