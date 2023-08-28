package com.example.tablefragmentexample;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(FragmentActivity fragment){
        super(fragment);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        //Crear un fragmento de acuerdo a la posición dentro del ViewPager
        switch (position){
            case 0:
                return new FragmentA();
            case 1:
                return new FragmentB();
            case 2:
                return new FragmentC();
            default:
                return null;
        }

    }

    @Override
    public int getItemCount() {
        return 3; //3 viewPager
    }
}
