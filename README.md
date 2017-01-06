# RxXxxDeepStudy

## 1简单使用RxJava

- 1.1引入RxJava依赖包

```java
compile 'io.reactivex:rxandroid:1.2.0'
compile 'io.reactivex:rxjava:1.1.4'
```

- 1.2定义Observables

```java
Observable<String> mObservable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("A");
                subscriber.onNext("B");
                subscriber.onNext("C");
                subscriber.onCompleted();
            }
        });
```

- 1.3定义Observers

```java
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
```

- 1.4绑定subscriber到Observable

```java
mObservable.subscribe(mObservers);
```