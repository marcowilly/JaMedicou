package com.marcowilly.jamedicou.view.fragment.emergency;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EmergencyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EmergencyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Seção contatos de emergencia em construção!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
