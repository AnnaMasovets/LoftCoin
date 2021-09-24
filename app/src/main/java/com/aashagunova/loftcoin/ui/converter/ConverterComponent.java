package com.aashagunova.loftcoin.ui.converter;

import androidx.lifecycle.ViewModelProvider;

import com.aashagunova.loftcoin.BaseComponent;
import com.aashagunova.loftcoin.util.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ConverterModule.class,
        ViewModelModule.class
}, dependencies = {
        BaseComponent.class
})
abstract class ConverterComponent {

    abstract ViewModelProvider.Factory viewModelFactory();

    abstract CoinsSheetAdapter coinsSheetAdapter();

}
