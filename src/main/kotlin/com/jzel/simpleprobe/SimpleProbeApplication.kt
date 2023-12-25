package com.jzel.simpleprobe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class SimpleProbeApplication

fun main(args: Array<String>) {
    runApplication<SimpleProbeApplication>(*args)
}
