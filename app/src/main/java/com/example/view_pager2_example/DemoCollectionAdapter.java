package com.example.view_pager2_example;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class DemoCollectionAdapter extends FragmentStateAdapter {
    private static final String TAG = "DemoCollectionAdapter";
    public DemoCollectionAdapter(Fragment fragment) {
        super(fragment);
        Log.i(TAG, "DemoCollectionAdapter: ");
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Log.i(TAG, "createFragment: hihi");
        // Return a NEW fragment instance in createFragment(int)
        Fragment fragment = new DemoObjectFragment();
        Bundle args = new Bundle();
        // Our object is just an integer :-P
        args.putInt(DemoObjectFragment.ARG_OBJECT, position + 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getItemCount() {
        Log.i(TAG, "getItemCount: hihi");
        return 4;
    }
}
