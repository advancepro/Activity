package com.example.activity.ui.last;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LastViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LastViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Winx Club");
    }

    public LiveData<String> getText() {
        return mText;
    }
}