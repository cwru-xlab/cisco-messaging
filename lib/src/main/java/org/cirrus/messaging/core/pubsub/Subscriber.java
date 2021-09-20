package org.cirrus.messaging.core.pubsub;

/** A consumer of messages that are produced by {@link Publisher} instances. */
public interface Subscriber {

  /**
   * Establish a subscription with {@link Publisher} instances that publish to this endpoint.
   *
   * @param endpoint The location from which messages can be retrieved from {@link Publisher}
   *     instances.
   */
  public abstract void subscribe(String endpoint);

  /**
   * Cancel a subscription with {@link Publisher} instances that publish messages to this endpoint.
   *
   * @param endpoint The location from which a subscription with {@link Publisher} instances can be
   *     cancelled.
   */
  public abstract void unsubscribe(String endpoint);
}
