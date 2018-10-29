package com.example.vmfld.moneyshare;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;






public class tabpagerAdapter extends FragmentStatePagerAdapter {

    String [] tabarray  = new String[] {"공금", "개인"};
    Integer tabnumber = 2;

    public tabpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                publicMoney publicMoney1 = new publicMoney();
                return  publicMoney1;
            case 1:
                individualMoney individualMoney2 = new individualMoney();
                return  individualMoney2;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
