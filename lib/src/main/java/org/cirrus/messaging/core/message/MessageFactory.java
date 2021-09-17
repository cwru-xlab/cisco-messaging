package org.cirrus.messaging.core.message;

/**
 * A factory that creates {@link Message} instances given only the body of the {@link Message}. This
 * allows for other attributes of a {@link Message} to be specified in externally.
 */
public interface MessageFactory {

  /**
   * @param body The content of the message.
   * @return A message instance.
   */
  public abstract Message create(String body);
}
