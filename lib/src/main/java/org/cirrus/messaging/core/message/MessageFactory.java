package org.cirrus.messaging.core.message;

public interface MessageFactory {

  Message create(String body);
}
