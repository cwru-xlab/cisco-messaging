package org.cirrus.messaging.core.node;

import java.util.concurrent.Flow;

/**
 * <p>A computational unit in a network. A {@link Node} receives a stream of messages to process.
 * Typically, these messages are sent from other {@link Node} instances, but may also arrive from
 * other sources. A {@link Node} is intended to be used in the context of "think like a vertex" or
 * actor-based modeling, where each {@link Node} maintains internal state and may run concurrently
 * with other  {@link Node} instances.</p>
 * <p>The semantics of {@link #onNext(T)}, {@link #onError(Throwable)}, and {@link #onComplete()}
 * are similar to {@link Flow.Subscriber}. There are, however, a few semantic differences. First, a
 * {@link Node} may also publish messages, depending on the implementation of {@link #onNext(T)}.
 * Second, the flow of messages may either be push-based or pull-based, depending on whichever is
 * preferred by the implementation. Third, {@link #onComplete()} need not correspond to the end of a
 * {@link Flow.Subscription}. It may also refer to other contexts, such as when the {@link Node}
 * will be removed from the network.</p>
 *
 * @param <T> The type of message the node processes.
 */
public interface Node<T> {

  /**
   * Invoked for each message received.
   *
   * @param message The message to process.
   */
  public abstract void onNext(T message);

  /**
   * Invoked either externally or by {@link #onNext(T)} when an error occurs in the processing of a
   * message.
   *
   * @param throwable The exception corresponding to the error that occurred.
   */
  public abstract void onError(Throwable throwable);

  /**
   * Invoked under "termination" conditions, such as at the end of a subscription or prior to the
   * {@link Node} being deleted.
   */
  public abstract void onComplete();
}
