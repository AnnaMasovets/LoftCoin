package com.aashagunova.loftcoin;

import android.content.Context;

import com.aashagunova.loftcoin.data.CoinsRepo;
import com.aashagunova.loftcoin.data.CurrencyRepo;
import com.aashagunova.loftcoin.data.WalletsRepo;
import com.aashagunova.loftcoin.util.ImageLoader;
import com.aashagunova.loftcoin.util.RxSchedulers;
import com.google.android.gms.common.api.internal.ListenerHolder;

public interface BaseComponent {
    Context context();

    CoinsRepo coinsRepo();

    CurrencyRepo currencyRepo();

    WalletsRepo walletsRepo();

    ImageLoader imageLoader();

    RxSchedulers schedulers();

    ListenerHolder.Notifier notifier();
}