package com.clabuyakchai.myapplication.ui.fragment.dog;

import com.clabuyakchai.myapplication.di.scope.FragmentScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface DogFragmentProvider {
    @FragmentScope
    @ContributesAndroidInjector
    DogFragment provideDogFragment();
}
