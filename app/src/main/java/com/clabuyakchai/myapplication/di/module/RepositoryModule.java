package com.clabuyakchai.myapplication.di.module;

import com.clabuyakchai.myapplication.data.repository.AnimalRepository;
import com.clabuyakchai.myapplication.data.repository.AnimalRepositoryImpl;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public interface RepositoryModule {
    @Singleton
    @Binds
    AnimalRepository bindAnimalRepository(AnimalRepositoryImpl animalRepository);
}
