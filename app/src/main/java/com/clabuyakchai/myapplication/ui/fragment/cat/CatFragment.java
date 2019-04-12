package com.clabuyakchai.myapplication.ui.fragment.cat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.clabuyakchai.myapplication.R;
import com.clabuyakchai.myapplication.data.remote.dto.Animal;
import com.clabuyakchai.myapplication.ui.base.BaseView;
import com.clabuyakchai.myapplication.ui.fragment.adapter.AnimalAdapter;
import com.clabuyakchai.myapplication.ui.fragment.cat.presenter.CatPresenterImpl;

import java.util.List;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.support.DaggerFragment;

public class CatFragment extends DaggerFragment implements CatView {
    private static final String TAG = "Cat";
    private RecyclerView recyclerView;
    private AnimalAdapter adapter;
    @Inject
    CatPresenterImpl presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.getCats();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new AnimalAdapter();
        recyclerView.setAdapter(adapter);
    }

    public static CatFragment newInstance(){
        return new CatFragment();
    }

    @Override
    public void showData(List<Animal> animals) {
        adapter.setAnimals(animals);
    }


}
