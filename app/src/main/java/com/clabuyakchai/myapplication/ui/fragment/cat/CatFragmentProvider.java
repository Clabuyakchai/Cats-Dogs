package com.clabuyakchai.myapplication.ui.fragment.cat;

import com.clabuyakchai.myapplication.di.scope.FragmentScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface CatFragmentProvider {
    @FragmentScope
    @ContributesAndroidInjector(modules = CatFragmentModule.class)
    CatView provideCatFragment();
}
