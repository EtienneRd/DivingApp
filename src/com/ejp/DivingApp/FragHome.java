package com.ejp.DivingApp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by etienne on 06/01/14.
 */
public class FragHome extends Fragment {
    private static FragHome ourInstance = new FragHome();

    public static FragHome getInstance() {
        return ourInstance;
    }

    private FragHome() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
