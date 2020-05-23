package com.dynamicviewpager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CustomPagerAdapter customPagerAdapter;
    private ArrayList<ImageModel> imageModelsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.pager);

        imageModelsArray = new ArrayList<>();
        ImageModel imageModel = new ImageModel();
        imageModel.setId(0);
        imageModel.setImageUrl("https://robohash.org/dilip");
        imageModelsArray.add(imageModel);

        ImageModel imageModel1 = new ImageModel();
        imageModel1.setId(1);
        imageModel1.setImageUrl("https://robohash.org/dilip3");
        imageModelsArray.add(imageModel1);

        ImageModel imageModel2 = new ImageModel();
        imageModel2.setId(2);
        imageModel2.setImageUrl("https://robohash.org/dilip2");
        imageModelsArray.add(imageModel2);

        ImageModel imageModel3 = new ImageModel();
        imageModel3.setId(3);
        imageModel3.setImageUrl("https://robohash.org/dilip1");
        imageModelsArray.add(imageModel3);

        customPagerAdapter = new CustomPagerAdapter(this, imageModelsArray);
        viewPager.setAdapter(customPagerAdapter);

    }
}