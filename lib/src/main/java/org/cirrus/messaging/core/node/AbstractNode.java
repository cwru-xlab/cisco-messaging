package org.cirrus.messaging.core.node;

import org.cirrus.messaging.core.pubsub.Publisher;
import org.cirrus.messaging.core.pubsub.Subscriber;

/**
 * A {@link Node} that has an associated {@link Publisher} and {@link Subscriber} to delegate the
 * actions of publishing messages and managing subscriptions.
 *
 * @param <T> The type of message the {@link Node} processes.
 */
public abstract class AbstractNode<T> implements Node<T> {

  private final Publisher<T> publisher;
  private final Subscriber subscriber;

  protected AbstractNode(Publisher<T> publisher, Subscriber subscriber) {
    this.publisher = publisher;
    this.subscriber = subscriber;
  }

  public final Publisher<T> getPublisher() {
    return publisher;
  }

  public final Subscriber getSubscriber() {
    return subscriber;
  }
}
