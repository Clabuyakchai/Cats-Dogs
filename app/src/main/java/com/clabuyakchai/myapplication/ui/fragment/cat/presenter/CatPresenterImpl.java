package com.clabuyakchai.myapplication.ui.fragment.cat.presenter;

import com.clabuyakchai.myapplication.data.interactor.AnimalInteractor;
import com.clabuyakchai.myapplication.ui.fragment.cat.CatView;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class CatPresenterImpl extends CatPresenter {
    private AnimalInteractor interactor;
    private CatView catView;

    @Inject
    public CatPresenterImpl(AnimalInteractor interactor, CatView catView) {
        this.interactor = interactor;
        this.catView = catView;
    }

    @Override
    public void getCats() {
        Disposable disposable = interactor.getAnimalFromApi("cat")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(list -> catView.showData(list), Throwable::printStackTrace);
        compositeDisposable.add(disposable);
    }

    @Override
    void onViewDestroy() {
        super.onViewDestroy();
    }
}
