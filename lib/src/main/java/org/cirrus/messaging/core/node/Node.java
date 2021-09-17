package org.cirrus.messaging.core.node;

public interface Node<T> {

  void onNext(T message);

  void onError(Throwable throwable);

  void onComplete();
}
