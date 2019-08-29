package com.example.mvvmdemo;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int clickCount = 0;
    MutableLiveData<Integer> liveCount = new MutableLiveData<>();


    public MutableLiveData<Integer> getInitialCount() {
        // setValue--> Main thread
        // postValue--> background thread
        liveCount.setValue(clickCount);
        return liveCount;
    }

    public void getCurrentCount() {
        clickCount += 1;
        liveCount.setValue(clickCount);


    }
}
