package org.cirrus.messaging.core.pubsub;

public interface Subscriber {

  public abstract void subscribe(String endpoint);

  public abstract void unsubscribe(String endpoint);
}
