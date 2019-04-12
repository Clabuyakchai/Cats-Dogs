package com.clabuyakchai.myapplication.ui.fragment.cat;

import com.clabuyakchai.myapplication.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

@Module
public class CatFragmentModule {
    @FragmentScope
    @Provides
    CatView provideCatView(){
        return new CatFragment();
    }
}
