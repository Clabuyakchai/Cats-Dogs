package com.clabuyakchai.myapplication.data.interactor;

import com.clabuyakchai.myapplication.data.remote.dto.Animal;

import java.util.List;

import io.reactivex.Single;

public interface AnimalInteractor {
    Single<List<Animal>> getAnimalFromApi(String animal);
}
