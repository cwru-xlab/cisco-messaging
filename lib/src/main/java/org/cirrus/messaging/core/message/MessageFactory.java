package org.cirrus.messaging.core.message;

/**
 * A factory that creates {@link Message} instances given only the body of the {@link Message}. This
 * allows for other attributes of a {@link Message} to be specified in externally.
 */
public interface MessageFactory {

  /**
   * Creates a {@link Message} instance with a given {@code body}.
   *
   * @param body The content of the message.
   * @return A {@link Message} instance.
   */
  public abstract Message create(String body);
}
