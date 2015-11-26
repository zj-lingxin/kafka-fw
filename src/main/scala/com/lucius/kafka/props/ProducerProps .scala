package com.lucius.kafka.props

import com.lucius.kafka.utils.Props

object ProducerProps {
  def apply() = {
    new ProducerProps().get
  }
}

class ProducerProps extends KafkaProps {
  props.put("acks", Props.get("producer.acks"))
  props.put("retries", Props.get("producer.retries"))
  props.put("batch.size", Props.get("producer.batch.size"))
  props.put("linger.ms", Props.get("producer.linger.ms"))
  props.put("buffer.memory", Props.get("producer.buffer.memory"))
  props.put("key.serializer", Props.get("producer.key.serializer"))
  props.put("value.serializer", Props.get("producer.value.serializer"))

  def setAcks(value: String): this.type = {
    props.put("acks", value)
    this
  }

  def setRetries(value: String): this.type = {
    props.put("retries", value)
    this
  }

  def setBatchSize(value: String): this.type = {
    props.put("batch.size", value)
    this
  }

  def setLingerMs(value: String): this.type = {
    props.put("linger.ms", value)
    this
  }

  def setBufferMemory(value: String): this.type = {
    props.put("buffer.memory", value)
    this
  }

  def setKeySerializer(value: String): this.type = {
    props.put("key.serializer", value)
    this
  }

  def setValueSerializer(value: String): this.type = {
    props.put("value.serializer", value)
    this
  }
}
