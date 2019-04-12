package com.clabuyakchai.myapplication.di.module;

import com.clabuyakchai.myapplication.data.interactor.AnimalInteractor;
import com.clabuyakchai.myapplication.data.interactor.AnimalInteractorImpl;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public interface InteractorModule {
    @Singleton
    @Binds
    AnimalInteractor bindAnimalInteractor(AnimalInteractorImpl animalInteractor);
}
