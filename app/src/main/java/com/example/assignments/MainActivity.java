package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.assignments.adapter.MovieCustomAdapter;
import com.example.assignments.model.MoviesData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<MoviesData> moviesData;
    public  ArrayList<MoviesData> generateMovies(){
        ArrayList<MoviesData> moviesData=new ArrayList<>();
        moviesData.add(new MoviesData("3 Idiots","5","3 Idiots is a 2009 Indian Hindi-language coming-of-age comedy-drama film directed by Rajkumar Hirani, and also co-written by him with Abhijat Joshi. ",R.drawable.idiots));
        moviesData.add(new MoviesData("Baahubali","4","Baahubali: The Beginning is a 2015 Indian epic action film directed by S.S Rajamouli and produced by Shobu Yarlagadda and Prasad Devineni, and shot simultaneously in Telugu and Tamil.",R.drawable.bahubhalli));
        moviesData.add(new MoviesData("Fanaa","4.5","Fanaa was one of the most expensive Bollywood films during its time of release. The film's title is derived from the Islamic Sufi term \"fanaa\", meaning \"destroyed\" in Arabic, Persian, Urdu, and Hindi.",R.drawable.fanaa));
        moviesData.add(new MoviesData("Rab Ne Bana Di Jodi","3","Rab Ne Bana Di Jodi ( transl. A Match Made By God), also known as RNBDJ, is a 2008 Indian Hindi-language romantic comedy film written and directed by Aditya Chopra and produced by Yash Chopra and Aditya Chopra under the banner Yash Raj Films.",R.drawable.jodi));
        moviesData.add(new MoviesData("Jab Tak Hai Jaan","3.5","Jab Tak Hai Jaan (transl. As long as I live) is a 2012 Indian Hindi-language romantic drama film directed by Yash Chopra; written and produced by Aditya Chopra under their production banner, Yash Raj Films.",R.drawable.jabtakhaijaan));
        return moviesData;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        moviesData=generateMovies();
        MovieCustomAdapter adapter=new MovieCustomAdapter(moviesData);
        listView.setAdapter(adapter);
    }


}
