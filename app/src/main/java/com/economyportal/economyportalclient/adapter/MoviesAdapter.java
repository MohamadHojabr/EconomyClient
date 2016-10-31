package com.economyportal.economyportalclient.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.economyportal.economyportalclient.R;
import com.economyportal.economyportalclient.model.Movie;
import com.economyportal.economyportalclient.model.Tag;

import java.util.List;

/**
 * Created by mohamad on 10/30/2016.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Tag> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public MoviesAdapter(List<Tag> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Tag movie = moviesList.get(position);
        holder.title.setText(movie.getName());
        holder.genre.setText(movie.getId().toString());
        holder.year.setText("2015");
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}