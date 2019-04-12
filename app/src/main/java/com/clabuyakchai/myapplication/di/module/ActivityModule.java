package com.clabuyakchai.myapplication.di.module;

import com.clabuyakchai.myapplication.di.scope.ActivityScope;
import com.clabuyakchai.myapplication.ui.activity.MainActivity;
import com.clabuyakchai.myapplication.ui.fragment.cat.CatFragmentProvider;
import com.clabuyakchai.myapplication.ui.fragment.dog.DogFragmentProvider;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract public class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = {CatFragmentProvider.class, DogFragmentProvider.class})
    abstract MainActivity bindMainActivity();
}
