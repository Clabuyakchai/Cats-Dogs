package com.clabuyakchai.myapplication.data.interactor;

import com.clabuyakchai.myapplication.data.remote.dto.Animal;
import com.clabuyakchai.myapplication.data.repository.AnimalRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class AnimalInteractorImpl implements AnimalInteractor {
    private AnimalRepository repository;

    @Inject
    public AnimalInteractorImpl(AnimalRepository repository) {
        this.repository = repository;
    }

    @Override
    public Single<List<Animal>> getAnimalFromApi(String animal) {
        return repository.getAnimalFromApi(animal);
    }
}
