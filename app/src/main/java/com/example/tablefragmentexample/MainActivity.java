package com.example.tablefragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager= findViewById(R.id.viewPager);
        ViewPagerAdapter adapter= new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        tabLayout= findViewById(R.id.tabLayout);

        new TabLayoutMediator(tabLayout,viewPager,(tab, position) -> {
            switch (position){
                case 0:
                    tab.setText("Fragment A");
                    break;
                case 1:
                    tab.setText("Fragment B");
                    break;
                case 2:
                    tab.setText("Fragment C");
                    break;
            }
        }).attach();


    }
}