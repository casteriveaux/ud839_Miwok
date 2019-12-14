package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class MiwokFragmentPagerAdapter extends FragmentStatePagerAdapter {


    public MiwokFragmentPagerAdapter(FragmentManager fragmentManager) {

        super(fragmentManager);

    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return 4;
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + (position + 1);
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new ColorsFragment();
        } else if (position == 2) {
            return new FamilyFragment();
        } else {
            return new PhrasesFragment();
        }
    }


}
