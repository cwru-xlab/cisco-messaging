package org.cirrus.messaging.core.pubsub;

/**
 * A producer of messages that are consumed by {@link Subscriber} instances.
 *
 * @param <T> The type of message published.
 */
@FunctionalInterface
public interface Publisher<T> {

  /**
   * Send a message to one or more endpoints for consumption by {@link Subscriber} instances.
   *
   * @param message The message to publish.
   */
  public abstract void publish(T message);
}
