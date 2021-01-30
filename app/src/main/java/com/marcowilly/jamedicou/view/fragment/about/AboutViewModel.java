package com.marcowilly.jamedicou.view.fragment.about;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AboutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Seção sobre em construção!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}