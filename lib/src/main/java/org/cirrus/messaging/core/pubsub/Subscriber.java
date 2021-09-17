package org.cirrus.messaging.core.pubsub;

public interface Subscriber {

  void subscribe(String endpoint);

  void unsubscribe(String endpoint);
}
