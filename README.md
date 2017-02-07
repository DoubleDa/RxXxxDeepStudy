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

## 2HelloWorld

- 2.1Transforming Observables with Operators

![](https://github.com/Netflix/RxJava/wiki/images/rx-operators/Composition.1.png)

- 2.2how that code produces that response

![](https://github.com/Netflix/RxJava/wiki/images/rx-operators/Composition.2.png)

- 2.3how that code uses the reduce operator to bring the results from multiple Observables together

![](https://github.com/Netflix/RxJava/wiki/images/rx-operators/Composition.3.png)

## 3操作符

### 3.1Create操作符

![](https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/legend.png)

## 参考文献

- [Android研发工程师高级进阶](https://asce1885.gitbooks.io/android-rd-senior-advanced/content/)
- [ReactiveX/RxJava文档中文版](https://mcxiaoke.gitbooks.io/rxdocs/content/)
- [ReactiveX额外阅读](http://reactivex.io/tutorials.html)
- [给Android开发者的RxJava详解](https://gank.io/post/560e15be2dca930e00da1083)