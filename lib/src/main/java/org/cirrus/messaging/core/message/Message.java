package org.cirrus.messaging.core.message;

public interface Message {

  /**
   * The sender is the endpoint from which the message originated. The sender may differ from the
   * return address.
   */
  public abstract String getSender();

  /**
   * The return address is an endpoint to which messages can be sent in response to this message.
   * This allows for request-reply messaging where the message sender enables the receiver to send a
   * response.
   */
  public abstract String getReturnAddress();

  /**
   * In pub/sub contexts, the subscription is the contract between the publisher and the subscriber
   * that allows the subscriber to receive messages from the publisher and for the publisher to send
   * messages to the subscriber. The subscription identifier is typically created when a subscriber
   * initially subscribes to the publisher. This identifier can then be used to cancel the
   * subscription.
   */
  public abstract String getSubscription();

  /**
   * The body is the content or data contained in the message. The syntax and semantics of the body
   * will vary based on the implementation. All non-{@link String} bodies should be serializable.
   */
  public abstract String getBody();

}
