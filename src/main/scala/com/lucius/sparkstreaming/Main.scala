package com.lucius.sparkstreaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

object Main {
  def main(args: Array[String]) {
    val conf = new SparkConf().setMaster("local[3]").setAppName("NetWorkWordCount")
    val ssc = new StreamingContext(conf, Seconds(5))
  }
}
