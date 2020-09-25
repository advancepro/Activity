package com.example.activity.ui.last;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.activity.R;

public class LastFragment extends Fragment {

    private LastViewModel lastViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        lastViewModel =
                ViewModelProviders.of(this).get(LastViewModel.class);
        View root = inflater.inflate(R.layout.fragment_last, container, false);
        final TextView textView = root.findViewById(R.id.text_last);
        lastViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}