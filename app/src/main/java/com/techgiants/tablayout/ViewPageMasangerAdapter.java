package com.techgiants.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPageMasangerAdapter extends FragmentPagerAdapter {
    public ViewPageMasangerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) {
            return new BlankFragment1();
        }
        else if(position==1) {
            return new BlankFragment2();
        }
        else {
            return new BlankFragment3();
        }
    }

    @Override
    public int getCount() {
        return 3; //no. of tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0) {
            return "Chats";
        }
          else if(position==1) {
            return "Status";
        }
          else {
            return "Calls";
        }
    }
}
