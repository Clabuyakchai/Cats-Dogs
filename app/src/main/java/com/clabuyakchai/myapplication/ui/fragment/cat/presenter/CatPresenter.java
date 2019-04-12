package com.clabuyakchai.myapplication.ui.fragment.cat.presenter;

import io.reactivex.disposables.CompositeDisposable;

abstract class CatPresenter {
    protected CompositeDisposable compositeDisposable;

    abstract void getCats();

    void onViewDestroy(){
        compositeDisposable.clear();
    }
}
