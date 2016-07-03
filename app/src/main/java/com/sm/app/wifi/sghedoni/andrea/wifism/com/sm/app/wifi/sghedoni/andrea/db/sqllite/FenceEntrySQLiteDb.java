package com.sm.app.wifi.sghedoni.andrea.wifism.com.sm.app.wifi.sghedoni.andrea.db.sqllite;

import android.provider.BaseColumns;

/**
 * Created by andrea on 02/07/16.
 */
public abstract class FenceEntrySQLiteDb implements BaseColumns {
    public static final String TABLE_NAME           = "fence";
    public static final String COLUMN_FENCE_NAME    = "name";
    public static final String COLUMN_FENCE_LAT     = "lat";
    public static final String COLUMN_FENCE_LNG     = "lng";
    public static final String COLUMN_FENCE_RANGE   = "range";
}

