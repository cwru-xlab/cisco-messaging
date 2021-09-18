package org.cirrus.messaging.core.message;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


@SuppressWarnings({"ResultOfMethodCallIgnored", "ConstantConditions"})
final class AbstractDefaultMessageTests {

  private static final String NULL = null;
  private static final String EMPTY = "";
  private static final String SENDER = "SENDER";
  private static final String RETURN_ADDRESS = "RETURN_ADDRESS";
  private static final String BODY = "BODY";
  private static final String SUBSCRIPTION = "SUBSCRIPTION";
  private static final DefaultMessage.Builder NULL_SENDER = DefaultMessage.newBuilder()
      .setBody(BODY)
      .setReturnAddress(RETURN_ADDRESS)
      .setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder EMPTY_SENDER = DefaultMessage.newBuilder()
      .setBody(BODY)
      .setReturnAddress(RETURN_ADDRESS)
      .setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder NULL_RETURN_ADDRESS = DefaultMessage.newBuilder()
      .setSender(SENDER)
      .setBody(BODY)
      .setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder EMPTY_RETURN_ADDRESS = DefaultMessage.newBuilder()
      .setSender(SENDER)
      .setBody(BODY)
      .setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder NULL_BODY = DefaultMessage.newBuilder()
      .setSender(SENDER)
      .setReturnAddress(RETURN_ADDRESS)
      .setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder EMPTY_BODY = DefaultMessage.newBuilder()
      .setSender(SENDER)
      .setReturnAddress(RETURN_ADDRESS)
      .setSubscription(SUBSCRIPTION);
  private static final DefaultMessage.Builder NULL_SUBSCRIPTION = DefaultMessage.newBuilder()
      .setSender(SENDER)
      .setReturnAddress(RETURN_ADDRESS)
      .setBody(BODY);
  private static final DefaultMessage.Builder EMPTY_SUBSCRIPTION = DefaultMessage.newBuilder()
      .setSender(SENDER)
      .setReturnAddress(RETURN_ADDRESS)
      .setBody(BODY);
  private static final DefaultMessage.Builder UNSPECIFIED_SUBSCRIPTION = DefaultMessage.newBuilder()
      .setSender(SENDER)
      .setReturnAddress(RETURN_ADDRESS)
      .setBody(BODY);

  @Test
  void throwsNullPointerExceptionWhenSenderIsNull() {
    Executable build = () -> NULL_SENDER.setSender(NULL).build();
    Assertions.assertThrows(NullPointerException.class, build);
  }

  @Test
  void throwsIllegalStateExceptionWhenSenderIsEmpty() {
    Executable build = () -> EMPTY_SENDER.setSender(EMPTY).build();
    Assertions.assertThrows(IllegalStateException.class, build);
  }

  @Test
  void throwsNullPointerExceptionWhenReturnAddressIsNull() {
    Executable build = () -> NULL_RETURN_ADDRESS.setReturnAddress(NULL).build();
    Assertions.assertThrows(NullPointerException.class, build);
  }

  @Test
  void throwsIllegalStateExceptionWhenReturnAddressIsEmpty() {
    Executable build = () -> EMPTY_RETURN_ADDRESS.setReturnAddress(EMPTY).build();
    Assertions.assertThrows(IllegalStateException.class, build);
  }

  @Test
  void throwsNullPointerExceptionWhenBodyIsNull() {
    Executable build = () -> NULL_BODY.setBody(NULL).build();
    Assertions.assertThrows(NullPointerException.class, build);
  }

  @Test
  void throwsIllegalStateExceptionWhenBodyIsEmpty() {
    Executable build = () -> EMPTY_BODY.setBody(EMPTY).build();
    Assertions.assertThrows(IllegalStateException.class, build);
  }

  @Test
  void throwsNullPointerExceptionWhenSubscriptionIsNull() {
    Executable build = () -> NULL_SUBSCRIPTION.setSubscription(NULL).build();
    Assertions.assertThrows(NullPointerException.class, build);
  }

  @Test
  void doesNotThrowExceptionWhenSubscriptionIsEmpty() {
    Executable build = () -> EMPTY_SUBSCRIPTION.setSubscription(EMPTY).build();
    Assertions.assertDoesNotThrow(build);
  }

  @Test
  void doesNotThrowExceptionWhenSubscriptionIsNotSpecified() {
    Executable build = UNSPECIFIED_SUBSCRIPTION::build;
    Assertions.assertDoesNotThrow(build);
  }
}
