package com.example.zll_gallery.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.zll_gallery.R;

public class imgFull extends AppCompatActivity {

    ImageView imageView;
    GalleryImgAdapter galleryImgAdapter;
    Button btnL, btnR;
    int currentPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_img_full);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView = findViewById(R.id.img_full);
        btnL = findViewById(R.id.buttonLeft);
        btnR = findViewById(R.id.buttonRight);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Get chair'd");

        Intent intent = getIntent();
        int posicio = intent.getExtras().getInt("idImatge");

        galleryImgAdapter = new GalleryImgAdapter(this);
        imageView.setImageResource(galleryImgAdapter.imgArray[posicio]);

        btnL.setOnClickListener(v -> {
            if (currentPosition > 0) {
                currentPosition--;  // Move to the previous image
                updateImage();
            }
        });

        btnR.setOnClickListener(v -> {
            if (currentPosition < galleryImgAdapter.imgArray.length - 1) {
                currentPosition++;  // Move to the next image
                updateImage();
            }
        });
    }
    private void updateImage() {
        imageView.setImageResource(galleryImgAdapter.imgArray[currentPosition]);
    }
}