package com.apps.semfourproject.timekeeper.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.apps.semfourproject.timekeeper.Fragments.TaskListFragment;
import com.apps.semfourproject.timekeeper.Fragments.TimerFragment;

public class SwipeAdapter extends FragmentPagerAdapter {
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TaskListFragment();
            case 1:
                return new TimerFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
