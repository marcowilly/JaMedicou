package com.marcowilly.jamedicou.view.fragment.form;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FormViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Seção formulários em construção!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}