package com.economyportal.economyportalclient.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.economyportal.economyportalclient.R;
import com.economyportal.economyportalclient.model.QuranList;

import com.economyportal.economyportalclient.services.IServices.IQuranService;

import com.economyportal.economyportalclient.services.ServiceConfig;



import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SupplyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supply);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        IQuranService quran_client = ServiceConfig.createService(IQuranService.class);


        final Call<QuranList> quran_call =
                quran_client.getQuranList();

        quran_call.enqueue(new Callback<QuranList>() {
            @Override
            public void onResponse(Call<QuranList> call, Response<QuranList> response) {

                Log.d("OKKKKKK" , response.body().toString());
            }
            @Override
            public void onFailure(Call<QuranList> call, Throwable t) {

                Log.d("NOOOOOOO" , t.getMessage());
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
