package com.ab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAccessorAdapter extends FragmentPagerAdapter {

    public CategoryAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {

            case 0:
                return new RequestFragment();

            case 1:
                return new RequestFragment();

            case 2:
                return new RequestFragment();

            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {

            case 0:
                return "Requests";

            case 1:
                return "Offerings";

            case 2:
                return "Recommends";

            default:
                return null;
        }
    }
}
