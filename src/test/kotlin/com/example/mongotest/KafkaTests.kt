package com.example.mongotest

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.kafka.core.KafkaTemplate
import java.time.LocalDateTime

@SpringBootTest
class KafkaTests {

    @Autowired
    private lateinit var kafkaTemplate: KafkaTemplate<String, Any>

    @Test
    internal fun kafkaTest() {
        kafkaTemplate.send("test", "Message at ${LocalDateTime.now()}")
    }
}
