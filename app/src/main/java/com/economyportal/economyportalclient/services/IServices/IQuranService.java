package com.economyportal.economyportalclient.services.IServices;

import com.economyportal.economyportalclient.model.QuranList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mohamad on 10/31/2016.
 */

public interface IQuranService {
    @GET("quran/GetRootOfTheQuran")
    Call<QuranList> getQuranList(
    );
}
