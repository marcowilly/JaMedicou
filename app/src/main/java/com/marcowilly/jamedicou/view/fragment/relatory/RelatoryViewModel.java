package com.marcowilly.jamedicou.view.fragment.relatory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RelatoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RelatoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Seção relatorios em construção!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}