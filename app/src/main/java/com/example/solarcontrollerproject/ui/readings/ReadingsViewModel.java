package com.example.solarcontrollerproject.ui.readings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReadingsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReadingsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Readings");
    }

    public LiveData<String> getText() {
        return mText;
    }
}