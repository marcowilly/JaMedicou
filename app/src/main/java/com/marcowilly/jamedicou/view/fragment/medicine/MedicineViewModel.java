package com.marcowilly.jamedicou.view.fragment.medicine;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MedicineViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MedicineViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Seção medicamentos em construção!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}