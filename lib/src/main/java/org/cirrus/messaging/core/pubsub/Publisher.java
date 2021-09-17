package org.cirrus.messaging.core.pubsub;

@FunctionalInterface
public interface Publisher<T> {

  void publish(T message);
}
