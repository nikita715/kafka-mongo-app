package com.example.mongotest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka
import org.springframework.kafka.annotation.KafkaListener

@EnableKafka
@SpringBootApplication
class MongotestApplication {

    @KafkaListener(topics = ["test"])
    fun msgListener(msg: String?) {
        println(msg)
    }

}

fun main(args: Array<String>) {
    runApplication<MongotestApplication>(*args)
}
