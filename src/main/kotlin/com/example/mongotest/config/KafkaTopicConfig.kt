package com.example.mongotest.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.KafkaAdmin
import java.util.HashMap

@Configuration
class KafkaTopicConfig(
        private val kafkaProperties: KafkaProperties
) {

    @Bean
    fun kafkaAdmin(): KafkaAdmin {
        val props: MutableMap<String, Any> = HashMap(kafkaProperties.buildConsumerProperties())
        return KafkaAdmin(props)
    }

    @Bean
    fun topic1(): NewTopic {
        return NewTopic("test", 1, 1.toShort())
    }
}