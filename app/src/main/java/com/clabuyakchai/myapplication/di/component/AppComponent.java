package com.clabuyakchai.myapplication.di.component;

import com.clabuyakchai.myapplication.App;
import com.clabuyakchai.myapplication.di.module.ActivityModule;
import com.clabuyakchai.myapplication.di.module.InteractorModule;
import com.clabuyakchai.myapplication.di.module.PresenterModule;
import com.clabuyakchai.myapplication.di.module.RemoteModule;
import com.clabuyakchai.myapplication.di.module.RepositoryModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityModule.class,
        RemoteModule.class,
        PresenterModule.class,
        RepositoryModule.class,
        InteractorModule.class
})
public interface AppComponent extends AndroidInjector<App> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {}
}
