package org.cirrus.messaging.core.node;

public interface Node<T> {

  public abstract void onNext(T message);

  public abstract void onError(Throwable throwable);

  public abstract void onComplete();
}
