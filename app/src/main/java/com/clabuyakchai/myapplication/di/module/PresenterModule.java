package com.clabuyakchai.myapplication.di.module;

import com.clabuyakchai.myapplication.data.interactor.AnimalInteractor;
import com.clabuyakchai.myapplication.di.scope.PresenterScope;
import com.clabuyakchai.myapplication.ui.fragment.cat.CatView;
import com.clabuyakchai.myapplication.ui.fragment.cat.presenter.CatPresenterImpl;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    @PresenterScope
    @Provides
    CatPresenterImpl bindCatPresenterImpl(AnimalInteractor animalInteractor, CatView catView){
        return new CatPresenterImpl(animalInteractor, catView);
    }
}
