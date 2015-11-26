package com.lucius.kafka.props

import com.lucius.kafka.utils.Props

object ConsumerProps {
  def apply(groupId: String) = {
    new ConsumerProps(groupId).get
  }
}

class ConsumerProps extends KafkaProps {
  def this(groupId: String) = {
    this()
    props.put("group.id", groupId)
    props.put("enable.auto.commit", Props.get("consumer.enable.auto.commit"))
    props.put("auto.commit.interval.ms", Props.get("consumer.auto.commit.interval.ms"))
    props.put("session.timeout.ms", Props.get("consumer.session.timeout.ms"))
    props.put("key.deserializer", Props.get("consumer.key.deserializer"))
    props.put("value.deserializer", Props.get("consumer.value.deserializer"))
  }

  def setGroupId(value: String): this.type = {
    props.put("group.id", value)
    this
  }

  def setEnableAutoCommit(value: Boolean): this.type = {
    props.put("enable.auto.commit", value.toString)
    this
  }

  def setAutoCommitIntervalMs(value: Long): this.type = {
    props.put("auto.commit.interval.ms", value.toString)
    this
  }

  def setSessionTimeOutMs(value: Long): this.type = {
    props.put("session.timeout.ms", value.toString)
    this
  }

  def setKeyDeserializer(value: String): this.type = {
    props.put("key.deserializer", value)
    this
  }

  def setValueDeserializer(value: String): this.type = {
    props.put("value.deserializer", value)
    this
  }

}
