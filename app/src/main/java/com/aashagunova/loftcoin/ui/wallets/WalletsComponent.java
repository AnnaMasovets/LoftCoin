package com.aashagunova.loftcoin.ui.wallets;

import androidx.lifecycle.ViewModelProvider;

import com.aashagunova.loftcoin.BaseComponent;
import com.aashagunova.loftcoin.util.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        WalletsModule.class,
        ViewModelModule.class
}, dependencies = {
        BaseComponent.class
})
abstract class WalletsComponent {

    abstract ViewModelProvider.Factory viewModelFactory();

    abstract WalletsAdapter walletsAdapter();

    abstract TransactionsAdapter transactionsAdapter();

}
