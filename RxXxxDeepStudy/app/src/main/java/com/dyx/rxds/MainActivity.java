package com.dyx.rxds;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orhanobut.logger.Logger;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRx();
    }

    private void initRx() {
        Observable<String> mObservable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("A");
                subscriber.onNext("B");
                subscriber.onNext("C");
                subscriber.onCompleted();
            }
        });

        Observer<String> mObservers = new Observer<String>() {
            @Override
            public void onCompleted() {
                Logger.d("onCompleted!");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d(e.toString());
            }

            @Override
            public void onNext(String s) {
                Logger.d(s);
            }
        };
        mObservable.subscribe(mObservers);
    }
}
