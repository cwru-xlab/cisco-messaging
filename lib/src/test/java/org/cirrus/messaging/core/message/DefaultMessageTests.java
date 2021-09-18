package org.cirrus.messaging.core.message;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

@SuppressWarnings({"ResultOfMethodCallIgnored", "ConstantConditions"})
final class DefaultMessageTests {

  private static final String NULL = null;
  private static final String EMPTY = "";
  private static final String SENDER = "SENDER";
  private static final String RETURN_ADDRESS = "RETURN_ADDRESS";
  private static final String BODY = "BODY";
  private static final String SUBSCRIPTION = "SUBSCRIPTION";
  private static final DefaultMessage.Builder NULL_SENDER =
      DefaultMessage.newBuilder()
          .setBody(BODY)
          .setReturnAddress(RETURN_ADDRESS)
          .setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder EMPTY_SENDER =
      DefaultMessage.newBuilder()
          .setBody(BODY)
          .setReturnAddress(RETURN_ADDRESS)
          .setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder NULL_ADDRESS =
      DefaultMessage.newBuilder().setSender(SENDER).setBody(BODY).setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder EMPTY_ADDRESS =
      DefaultMessage.newBuilder().setSender(SENDER).setBody(BODY).setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder NULL_BODY =
      DefaultMessage.newBuilder()
          .setSender(SENDER)
          .setReturnAddress(RETURN_ADDRESS)
          .setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder EMPTY_BODY =
      DefaultMessage.newBuilder()
          .setSender(SENDER)
          .setReturnAddress(RETURN_ADDRESS)
          .setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder NULL_SUBSCRIPTION =
      DefaultMessage.newBuilder().setSender(SENDER).setReturnAddress(RETURN_ADDRESS).setBody(BODY);
  private static final DefaultMessage.Builder EMPTY_SUBSCRIPTION =
      DefaultMessage.newBuilder().setSender(SENDER).setReturnAddress(RETURN_ADDRESS).setBody(BODY);
  private static final DefaultMessage.Builder NO_SUBSCRIPTION =
      DefaultMessage.newBuilder().setSender(SENDER).setReturnAddress(RETURN_ADDRESS).setBody(BODY);

  public DefaultMessageTests() {}

  @Test
  public void throwsNullPointerExceptionWhenSenderIsNull() {
    final Executable build = () -> NULL_SENDER.setSender(NULL).build();
    Assertions.assertThrows(NullPointerException.class, build);
  }

  @Test
  public void throwsIllegalStateExceptionWhenSenderIsEmpty() {
    final Executable build = () -> EMPTY_SENDER.setSender(EMPTY).build();
    Assertions.assertThrows(IllegalStateException.class, build);
  }

  @Test
  public void throwsNullPointerExceptionWhenReturnAddressIsNull() {
    final Executable build = () -> NULL_ADDRESS.setReturnAddress(NULL).build();
    Assertions.assertThrows(NullPointerException.class, build);
  }

  @Test
  public void throwsIllegalStateExceptionWhenReturnAddressIsEmpty() {
    final Executable build = () -> EMPTY_ADDRESS.setReturnAddress(EMPTY).build();
    Assertions.assertThrows(IllegalStateException.class, build);
  }

  @Test
  public void throwsNullPointerExceptionWhenBodyIsNull() {
    final Executable build = () -> NULL_BODY.setBody(NULL).build();
    Assertions.assertThrows(NullPointerException.class, build);
  }

  @Test
  public void throwsIllegalStateExceptionWhenBodyIsEmpty() {
    final Executable build = () -> EMPTY_BODY.setBody(EMPTY).build();
    Assertions.assertThrows(IllegalStateException.class, build);
  }

  @Test
  public void throwsNullPointerExceptionWhenSubscriptionIsNull() {
    final Executable build = () -> NULL_SUBSCRIPTION.setSubscription(NULL).build();
    Assertions.assertThrows(NullPointerException.class, build);
  }

  @Test
  public void doesNotThrowExceptionWhenSubscriptionIsEmpty() {
    final Executable build = () -> EMPTY_SUBSCRIPTION.setSubscription(EMPTY).build();
    Assertions.assertDoesNotThrow(build);
  }

  @Test
  public void doesNotThrowExceptionWhenSubscriptionIsNotSpecified() {
    final Executable build = NO_SUBSCRIPTION::build;
    Assertions.assertDoesNotThrow(build);
  }
}
