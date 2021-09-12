package com.aashagunova.loftcoin.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {
        RoomCoin.class
}, version = 1,
        exportSchema = false)
abstract class LoftDatabase extends RoomDatabase {
    abstract CoinsDao coins();
}
