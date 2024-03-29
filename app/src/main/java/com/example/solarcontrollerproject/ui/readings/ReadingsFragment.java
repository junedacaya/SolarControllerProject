package com.example.solarcontrollerproject.ui.readings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.solarcontrollerproject.R;

public class ReadingsFragment extends Fragment {

    private ReadingsViewModel readingsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        readingsViewModel =
                ViewModelProviders.of(this).get(ReadingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_readings, container, false);
        final TextView textView = root.findViewById(R.id.text_readings);
        readingsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}