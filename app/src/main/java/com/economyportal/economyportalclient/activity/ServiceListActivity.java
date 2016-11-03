package com.economyportal.economyportalclient.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.economyportal.economyportalclient.R;
import com.economyportal.economyportalclient.services.IServices.ITagService;
import com.economyportal.economyportalclient.services.ServiceConfig;
import com.economyportal.economyportalclient.adapter.TagAdapter;
import com.economyportal.economyportalclient.model.Tag;
import com.economyportal.economyportalclient.utility.ClickListener;
import com.economyportal.economyportalclient.utility.RecyclerTouchListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ServiceListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TagAdapter mAdapter;
    private ArrayList<Tag> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ///



        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Tag movie = data.get(position);
                Toast.makeText(getApplicationContext(), movie.getName() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {
                Tag movie = data.get(position);
                Toast.makeText(getApplicationContext(), movie.getId() + " در سال!", Toast.LENGTH_SHORT).show();
            }
        }));

        GotoTagService();
    }

    private void GotoTagService(){

        ITagService tag_client = ServiceConfig.createService(ITagService.class);
        final Call<List<Tag>> tag_call = tag_client.tags();

        tag_call.enqueue(new Callback<List<Tag>>() {
            @Override
            public void onResponse(Call<List<Tag>> call, Response<List<Tag>> response) {

                data = (ArrayList<Tag>) response.body();
                mAdapter = new TagAdapter(data);
                recyclerView.setAdapter(mAdapter);
            }
            @Override
            public void onFailure(Call<List<Tag>> call, Throwable t) {
                Log.d("NOOOOOOO" , t.getMessage());
            }
        });
    }
}
