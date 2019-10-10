package com.example.solarcontrollerproject.ui.control;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ControlViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ControlViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}