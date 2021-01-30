package com.marcowilly.jamedicou.view.fragment.form;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.marcowilly.jamedicou.R;


public class FormFragment extends Fragment {

    private FormViewModel formViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        formViewModel = new ViewModelProvider(this).get(FormViewModel.class);
        View root = inflater.inflate(R.layout.fragment_form, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        formViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}