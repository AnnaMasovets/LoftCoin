package com.aashagunova.loftcoin.data;

import com.google.auto.value.AutoValue;

import java.util.List;

@AutoValue
abstract class Listings {

    abstract List<AutoValue_CmcCoin> data();

}