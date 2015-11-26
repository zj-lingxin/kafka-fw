package com.lucius.kafka.props

import java.util.Properties

import com.lucius.kafka.utils.Props

abstract class KafkaProps {
  protected val props = new Properties()
  props.put("bootstrap.servers", Props.get("bootstrap.servers"))

  def setBootstrapServers(servers: String) = {
    props.put("bootstrap.servers", servers)
  }

  def set(key:String, value:String): Unit = {
    props.put(key, value)
  }

  def get = props
}
