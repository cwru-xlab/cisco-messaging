package org.cirrus.messaging.core.message;

public interface Message {

  public abstract String getSender();

  public abstract String getReturnAddress();

  public abstract String getSubscription();

  public abstract String getBody();

}
