package org.cirrus.messaging.core.message;

public final class DefaultMessageFactory implements MessageFactory {

  private final String sender;
  private final String returnAddress;

  private DefaultMessageFactory(String sender, String returnAddress) {
    this.sender = sender;
    this.returnAddress = returnAddress;
  }

  public static DefaultMessageFactory of(String sender, String returnAddress) {
    return new DefaultMessageFactory(sender, returnAddress);
  }

  public Message create(String body) {
    return DefaultMessage.newBuilder()
        .setSender(sender)
        .setReturnAddress(returnAddress)
        .setBody(body)
        .build();
  }
}
