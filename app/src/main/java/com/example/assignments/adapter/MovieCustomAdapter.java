package com.example.assignments.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignments.R;
import com.example.assignments.model.MoviesData;

import java.util.ArrayList;

public class MovieCustomAdapter extends BaseAdapter {

    ArrayList<MoviesData> moviesData;
    public MovieCustomAdapter(ArrayList<MoviesData>movieData){
        this.moviesData=movieData;
    }
    @Override
    public int getCount() {
        return moviesData.size();
    }

    @Override
    public MoviesData getItem(int position) {
        return moviesData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null)
        {
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row_layout,null);
            viewHolder=new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder) convertView.getTag();
            MoviesData movies=getItem(position);

        }
        MoviesData moviesData=getItem(position);
        viewHolder.movieTitle.setText(moviesData.getMovieName());
        viewHolder.movieRating.setText(moviesData.getMovieRating());
        viewHolder.movieDescription.setText(moviesData.getMovieDescription());
        viewHolder.movieImage.setImageResource(moviesData.getMovieImage());

        return convertView;

    }
    class ViewHolder{
        TextView movieTitle,movieDescription,movieRating;
        ImageView movieImage;
        ;
        public ViewHolder(View view)
        {
            movieTitle=view.findViewById(R.id.textMovie);
            movieDescription=view.findViewById(R.id.textMovieDescription);
            movieImage=view.findViewById(R.id.imageViewMovie);
            movieRating=view.findViewById(R.id.textRating);
        }
    }
}

