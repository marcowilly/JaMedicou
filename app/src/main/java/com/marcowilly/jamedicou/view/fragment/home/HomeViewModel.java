package com.marcowilly.jamedicou.view.fragment.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(String.format("Sem medicação cadastrada para o dia %s.\n\nContinue se cuidando!!!", "18/12/2020"));
    }

    public LiveData<String> getText() {
        return mText;
    }
}