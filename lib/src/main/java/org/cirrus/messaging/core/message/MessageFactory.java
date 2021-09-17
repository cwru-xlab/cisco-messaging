package org.cirrus.messaging.core.message;

public interface MessageFactory {

  public abstract Message create(String body);
}
