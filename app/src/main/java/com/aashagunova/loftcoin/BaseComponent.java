package com.aashagunova.loftcoin;

import android.content.Context;

import com.aashagunova.loftcoin.data.CoinsRepo;
import com.aashagunova.loftcoin.data.CurrencyRepo;
import com.aashagunova.loftcoin.util.ImageLoader;

public interface BaseComponent {
    Context context();
    CoinsRepo coinsRepo();
    CurrencyRepo currencyRepo();
    ImageLoader imageLoader();
}
