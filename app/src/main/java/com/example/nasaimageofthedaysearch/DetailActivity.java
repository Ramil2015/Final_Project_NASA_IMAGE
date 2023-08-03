package com.example.nasaimageofthedaysearch;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import static com.example.nasaimageofthedaysearch.ExampleRecyclerViewActivity.EXTRA_TITLE;
import static com.example.nasaimageofthedaysearch.ExampleRecyclerViewActivity.EXTRA_DATE;
import static com.example.nasaimageofthedaysearch.ExampleRecyclerViewActivity.EXTRA_URL;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String title = intent.getStringExtra(EXTRA_TITLE);
        String dateTaken = intent.getStringExtra(EXTRA_DATE);

        ImageView imageView = findViewById(R.id.imageViewDetail);
        TextView textViewTitle = findViewById(R.id.textViewTitleDetail);
        TextView textViewDateTaken = findViewById(R.id.textViewDateTakenDetail);

        Picasso.get().load(imageUrl).into(imageView);
        textViewTitle.setText(title);
        textViewDateTaken.setText(dateTaken);
    }
}