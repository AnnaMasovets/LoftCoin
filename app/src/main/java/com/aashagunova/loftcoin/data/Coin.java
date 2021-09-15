package com.aashagunova.loftcoin.data;

import com.google.auto.value.AutoValue;
import com.google.auto.value.extension.memoized.Memoized;
import com.squareup.moshi.Json;

import java.util.Iterator;
import java.util.Map;



public interface Coin {

    int id();

    String name();

    String symbol();

    int rank();

    double price();

    double change24h();

    String currencyCode();

}
