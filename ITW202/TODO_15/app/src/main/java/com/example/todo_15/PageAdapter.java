package com.example.todo_15;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PageAdapter(FragmentManager fm, int behavior){
        super(fm, behavior);
        this.mNumOfTabs=behavior;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new fragment1();
            case 1: return new fragment2();
            case 2: return new fragment3();
            default: return null;
        }
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}