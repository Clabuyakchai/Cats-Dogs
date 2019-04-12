package com.clabuyakchai.myapplication.data.repository;

import com.clabuyakchai.myapplication.data.remote.dto.Animal;

import java.util.List;

import io.reactivex.Single;

public interface AnimalRepository {
    Single<List<Animal>> getAnimalFromApi(String animal);
}
