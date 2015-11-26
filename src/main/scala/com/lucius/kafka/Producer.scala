package com.lucius.kafka

import java.util.Properties

import com.lucius.kafka.props.ProducerProps
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

/**
 * Created by lingx on 2015/11/25.
 */
object Producer {
  def main(args: Array[String]) {

    val producer = new KafkaProducer[String, String](ProducerProps())

    producer.send(new ProducerRecord("lx-topic", "this a message", "this a message111111111"))
    producer.close()
  }

}
