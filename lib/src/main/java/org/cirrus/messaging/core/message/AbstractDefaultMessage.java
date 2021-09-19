package org.cirrus.messaging.core.message;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import org.immutables.value.Value;

/**
 * A {@link Message} that requires the sender, return address, and body to be non-null and
 * non-empty.
 */
@Value.Immutable
abstract class AbstractDefaultMessage implements Message {

  private static final String NO_SUBSCRIPTION = "";
  private static final String INVALID_BODY = "'body' must not be empty or null";
  private static final String INVALID_SENDER = "'sender' must not be empty or null";
  private static final String INVALID_ADDRESS = "'returnAddress' must not be empty or null";

  protected AbstractDefaultMessage() {
    // Fix "At Least One Constructor" Checkstyle violation
  }

  @Override
  public abstract String getSender();

  @Override
  public abstract String getReturnAddress();

  @Override
  @Value.Default
  public String getSubscription() {
    return NO_SUBSCRIPTION;
  }

  @Override
  public abstract String getBody();

  @Value.Check
  protected final void checkBody() {
    Preconditions.checkState(!Strings.isNullOrEmpty(getBody()), INVALID_BODY);
  }

  @Value.Check
  protected final void checkSender() {
    Preconditions.checkState(!Strings.isNullOrEmpty(getSender()), INVALID_SENDER);
  }

  @Value.Check
  protected final void checkReturnAddress() {
    Preconditions.checkState(!Strings.isNullOrEmpty(getReturnAddress()), INVALID_ADDRESS);
  }
}
