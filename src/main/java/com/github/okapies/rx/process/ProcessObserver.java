package com.github.okapies.rx.process;

import java.nio.ByteBuffer;

import rx.Observable;
import rx.Observer;

public interface ProcessObserver<T> {

    Observer<T> stdout();

    Observer<T> stderr();

    Observable<T> serialize(Observable<ByteBuffer> o);

    ByteBuffer deserialize(T t);

}