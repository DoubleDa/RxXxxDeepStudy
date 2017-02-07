package com.dyx.rxds.github;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.dyx.rxds.R;
import com.orhanobut.logger.Logger;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;

/**
 * project name：RxXxxDeepStudy
 * class describe：实现helloworld项目
 * create person：dayongxin
 * create time：2017/2/4 上午11:20
 * alter person：dayongxin
 * alter time：2017/2/4 上午11:20
 * alter remark：
 */
public class HelloRxJavaAct extends Activity {
    @BindView(R.id.btn_hello_world)
    Button btnHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_rxjava);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_hello_world)
    public void onClick() {
        /**
         * 初试RxJava
         */
        //helloWorld("初七", "初八");
        /**
         * 使用RxJava的create操作符
         */
        //useCreateOperator();
        /**
         * 使用RxJava的From操作符
         */
        //useFromOperator();
        /**
         * 使用RxJava的Interval操作符
         */
        //useIntervalOperator();
        /**
         * 使用RxJava的Just操作符：如果你传递null给Just，它会返回一个发射null值的Observable。不要误认为它会返回一个空Observable（完全不发射任何数据的Observable），如果需要空Observable你应该使用Empty操作符
         */
        //useJustOperator();
        /**
         * 使用RxJava的Range操作符
         */
        //useRangeOperator();
        /**
         * 使用RxJava的Repeat操作符
         */
        //useRepeatOperator();
        /**
         * 使用RxJava的Start操作符
         */
        //useStartOperator();
        /**
         * 使用RxJava的Timer操作符
         */
        //useTimerOperator();
        /**
         * 使用RxJava的scan操作符
         */
        //useScanOperator();
        /**
         * 使用RxJava的Distinct操作符
         */
        //useDistinctOperator();
        /**
         * 使用RxJava的ElementAt操作符
         */
        //useElementAtOperator();
        /**
         * 使用RxJava的elementAtOrDefault操作符
         */
        //useelementAtOrDefaultOperator();
        /**
         * 使用RxJava的Filter操作符
         */
        //useFilterOperator();
        /**
         * 使用RxJava的ofType操作符
         */
        //useOfTypeOperator();
        /**
         * 使用RxJava的First操作符
         */
        //useFirstOperator();
        /**
         * 使用RxJava的IgnoreElements操作符
         */
        //useIgnoreElementsOperator();
        /**
         * 使用RxJava的Last操作符
         */
        //useLastOperator();
        /**
         * 使用RxJava的Sample操作符
         */
        //useSampleOperator();
        /**
         * 使用RxJava的Skip操作符
         */
        //useSkipOperator();
        /**
         * 使用RxJava的SkipLast操作符
         */
        //useSkipLastOperator();
        /**
         * 使用RxJava的Take操作符
         */
        //useTakeOperator();
        /**
         * 使用RxJava的TakeLast操作符
         */
        useTakeLastOperator();
    }

    private void useTakeLastOperator() {
        Observable.just(1, 2, 3, 6, 5, 9).takeLast(2).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useTakeOperator() {
        Observable.just(1, 2, 3, 6, 5, 9).take(4).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useSkipLastOperator() {
        Observable.just(1, 2, 3, 6, 5, 9).skipLast(2).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useSkipOperator() {
        Observable.just(1, 2, 3).skip(2).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useSampleOperator() {
        Observable.just(1, 2, 3).sample(2000, TimeUnit.SECONDS).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useLastOperator() {
        Observable.just(1, 2, 3).last().subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useIgnoreElementsOperator() {
        Observable.just(1, 2).ignoreElements().subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useFirstOperator() {
        Observable.just(1, 2, 3, 4, 5).first().subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }


    private void useOfTypeOperator() {
        Observable.just(1, true, 2.3, 4).ofType(Boolean.class).subscribe(new Subscriber<Boolean>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Boolean aBoolean) {
                Logger.d("***onNext***" + aBoolean);
            }
        });
    }

    private void useFilterOperator() {
        Observable.just(1, 2, 3, 4, 5, 6).filter(new Func1<Integer, Boolean>() {
            @Override
            public Boolean call(Integer integer) {
                return (integer > 4);
            }
        }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useelementAtOrDefaultOperator() {
        Observable.just(1, 2, 3, 4, 5, 6).elementAtOrDefault(2, 0).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useElementAtOperator() {
        Observable.just(1, 2, 3, 4, 5, 6).elementAt(2).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useDistinctOperator() {
        Observable.just(1, 2, 3, 1, 3, 2).distinct().subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useScanOperator() {
        Observable.just(1, 2, 3, 4, 5).scan(new Func2<Integer, Integer, Integer>() {
            @Override
            public Integer call(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useTimerOperator() {
        Observable.timer(3000, TimeUnit.SECONDS).subscribe(new Subscriber<Long>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Long aLong) {
                Logger.d("***onNext***" + aLong);
            }
        });
    }

    private void useStartOperator() {

    }

    private void useRepeatOperator() {

    }

    private void useRangeOperator() {
        Observable mObservable = Observable.range(1, 10);
        mObservable.subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useJustOperator() {
        Observable.just(1, 2, 3).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***" + e.getMessage());
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void useIntervalOperator() {
        Observable mObservable = Observable.interval(3000, java.util.concurrent.TimeUnit.SECONDS);
    }

    private void useFromOperator() {
        Integer[] items = {1, 2, 3, 4, 5, 6, 7, 8};
        Observable mObservable = Observable.from(items);

        mObservable.subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                Logger.d(integer);
            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                Logger.d("Error Message:" + throwable.getMessage());
            }
        }, new Action0() {
            @Override
            public void call() {
                Logger.d("onCompleted!");
            }
        });
    }

    private void useCreateOperator() {
        Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                try {
                    //检查观察者状态
                    if (!subscriber.isUnsubscribed()) {
                        for (int i = 0; i < 5; i++) {
                            subscriber.onNext(i);
                        }
                        subscriber.onCompleted();
                    }
                } catch (Exception e) {
                    subscriber.onError(e);
                }
            }
        }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                Logger.d("***onCompleted***");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("***onError***");
            }

            @Override
            public void onNext(Integer integer) {
                Logger.d("***onNext***" + integer);
            }
        });
    }

    private void helloWorld(String... names) {
        Observable.from(names).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                Logger.d("打印结果：" + s);
            }
        });
    }
}
