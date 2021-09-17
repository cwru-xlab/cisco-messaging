package org.cirrus.messaging.core.node;

import org.cirrus.messaging.core.message.Message;
import org.cirrus.messaging.core.message.MessageFactory;
import org.cirrus.messaging.core.pubsub.Publisher;
import org.cirrus.messaging.core.pubsub.Subscriber;

public abstract class AbstractMessageNode extends AbstractNode<Message> {

  private final MessageFactory messageFactory;

  protected AbstractMessageNode(Publisher<Message> publisher, Subscriber subscriber,
      MessageFactory messageFactory) {
    super(publisher, subscriber);
    this.messageFactory = messageFactory;
  }

  public MessageFactory getMessageFactory() {
    return messageFactory;
  }
}
