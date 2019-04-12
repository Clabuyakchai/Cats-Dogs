package com.clabuyakchai.myapplication.ui.activity;

import androidx.fragment.app.Fragment;

public interface FragmetStack {
    void add(Fragment fragment, Boolean addToBackStack);
    void pop();
}
