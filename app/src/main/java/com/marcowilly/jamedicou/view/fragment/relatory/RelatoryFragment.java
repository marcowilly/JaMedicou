package com.marcowilly.jamedicou.view.fragment.relatory;

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

public class RelatoryFragment extends Fragment {

    private RelatoryViewModel relatoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        relatoryViewModel = new ViewModelProvider(this).get(RelatoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_relatory, container, false);
        final TextView textView = root.findViewById(R.id.tv_medicine);
        relatoryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
