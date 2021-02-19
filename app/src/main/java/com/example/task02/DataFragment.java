package com.example.task02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class DataFragment extends Fragment {
    private static final String ARG_TEXT = "argText";
    private static final String ARG_DATE = "argDate";
    private String text;
    private String date;
    public static DataFragment newInstance(String text, String date) {
        DataFragment fragment = new DataFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT, text);
        args.putString(ARG_DATE, date);
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.data_fragment, container, false);
        TextView textView = v.findViewById(R.id.text_view_fragment);
        if (getArguments() != null) {
            text = getArguments().getString(ARG_TEXT);
            date = getArguments().getString(ARG_DATE);
        }
        textView.setText(text + date);
        return v;
    }
}
