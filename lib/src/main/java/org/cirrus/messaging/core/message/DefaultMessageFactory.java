package org.cirrus.messaging.core.message;

/**
 * A {@link MessageFactory} that creates {@link DefaultMessage} instances.
 */
public final class DefaultMessageFactory implements MessageFactory {

  private final String sender;
  private final String returnAddress;

  private DefaultMessageFactory(String sender, String returnAddress) {
    this.sender = sender;
    this.returnAddress = returnAddress;
  }

  /**
   * Creates an instance of {@link DefaultMessageFactory} that creates {@link DefaultMessage}
   * instances with a given {@link #sender} and {@link #returnAddress}
   *
   * @param sender        The endpoint from which messages are sent.
   * @param returnAddress The endpoint to which replies to the sender can be sent.
   * @return An instance of {@link DefaultMessageFactory}.
   */
  public static DefaultMessageFactory of(String sender, String returnAddress) {
    return new DefaultMessageFactory(sender, returnAddress);
  }

  @Override
  public Message create(String body) {
    return DefaultMessage.newBuilder()
        .setSender(sender)
        .setReturnAddress(returnAddress)
        .setBody(body)
        .build();
  }
}
