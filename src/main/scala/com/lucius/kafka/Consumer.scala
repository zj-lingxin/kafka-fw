package com.lucius.kafka

import java.util
import java.util.Properties
import com.lucius.kafka.props.{ConsumerProps, KafkaProps}
import com.typesafe.scalalogging.slf4j.LazyLogging
import org.apache.kafka.clients.consumer.{ConsumerRecords, KafkaConsumer}

/**
 * Created by lingx on 2015/11/25.
 */
object Consumer extends LazyLogging{
  def main(args: Array[String]) {

    val  consumer = new KafkaConsumer[String, String](ConsumerProps("test1"))
    consumer.subscribe(util.Arrays.asList("lx-topic"))

   while (true) {
      val records :ConsumerRecords[String, String] = consumer.poll(100)

      val it = records.iterator()
      while(it.hasNext){
        logger.info("#############################")
        val record = it.next()
        logger.info(record.offset() + "" +record.key()+ "" +record.value())

      }
    }
  }
}
