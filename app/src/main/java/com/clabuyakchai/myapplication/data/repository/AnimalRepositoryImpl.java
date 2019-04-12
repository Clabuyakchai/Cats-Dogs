package com.clabuyakchai.myapplication.data.repository;

import com.clabuyakchai.myapplication.data.remote.AnimalApi;
import com.clabuyakchai.myapplication.data.remote.dto.Animal;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class AnimalRepositoryImpl implements AnimalRepository {
    private AnimalApi api;

    @Inject
    public AnimalRepositoryImpl(AnimalApi api) {
        this.api = api;
    }

    @Override
    public Single<List<Animal>> getAnimalFromApi(String animal) {
        return api.getAnimalFromApi(animal)
                .flatMap(response -> Single.just(response.getData()));
    }
}
