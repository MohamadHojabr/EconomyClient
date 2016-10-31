package com.economyportal.economyportalclient.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mohamad on 10/31/2016.
 */

public class QuranList {
    @SerializedName("list")
    private List<Quran> quranList;

    @Override
    public String toString() {
        return("id is  : " + quranList.get(0).Name);
    }
}
