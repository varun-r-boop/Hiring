package com.example.noice2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                HireFragment Hire = new HireFragment();
                return Hire;
            case 1:
                WorkFragment Work = new WorkFragment();
                return Work;
            case 2:
                ThirdFragment Third = new ThirdFragment();
                return Third;
            default:
                return null;
        }
    }
}

//    private int tabsNumber;
//
//    public PagerAdapter(@NonNull FragmentManager fm, int behavior,int tabs) {
//        super(fm, behavior);
//        this.tabsNumber = tabs;
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        switch (position){
//            case 0:
//                return new WorkFragment();
//            case 1:
//                return new HireFragment();
//            case 2:
//                return new ThirdFragment();
//            default: return null;
//        }
//
//    }
//
//    @Override
//    public int getCount() {
//        return tabsNumber;
//    }
//}
