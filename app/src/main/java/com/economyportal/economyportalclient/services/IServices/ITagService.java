package com.economyportal.economyportalclient.services.IServices;

import com.economyportal.economyportalclient.model.Tag;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mohamad on 10/31/2016.
 */

public interface ITagService {
    @GET("Tags/GetAllTags")
    Call<List<Tag>> tags(
    );
}
