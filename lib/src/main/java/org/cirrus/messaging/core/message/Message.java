package org.cirrus.messaging.core.message;

public interface Message {

  String getSender();

  String getReturnAddress();

  String getSubscription();

  String getBody();

}
