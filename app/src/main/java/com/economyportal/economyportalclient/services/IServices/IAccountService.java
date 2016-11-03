package com.economyportal.economyportalclient.services.IServices;

import com.economyportal.economyportalclient.model.User;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by pc on 11/03/2016.
 */

public interface IAccountService {
    @POST("/login")
    Call<User> basicLogin();
}
