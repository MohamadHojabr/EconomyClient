package com.economyportal.economyportalclient.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.economyportal.economyportalclient.R;
import com.economyportal.economyportalclient.model.Movie;
import com.economyportal.economyportalclient.model.QuranList;

import java.util.List;

/**
 * Created by mohamad on 10/31/2016.
 */

public class QuranListAdapter extends RecyclerView.Adapter<QuranListAdapter.QuranListViewHolder> {

    private List<QuranList> quranLists;

    public class QuranListViewHolder extends RecyclerView.ViewHolder {
        public TextView title, type, describtion;

        public QuranListViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.quran_title);
            type = (TextView) view.findViewById(R.id.quran_type);
            describtion = (TextView) view.findViewById(R.id.quran_describtion);
        }
    }

    @Override
    public QuranListAdapter.QuranListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_item_quran, parent, false);

        return new QuranListAdapter.QuranListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(QuranListAdapter.QuranListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
