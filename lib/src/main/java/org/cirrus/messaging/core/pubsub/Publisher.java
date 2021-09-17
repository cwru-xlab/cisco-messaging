package org.cirrus.messaging.core.pubsub;

@FunctionalInterface
public interface Publisher<T> {

  public abstract void publish(T message);
}
