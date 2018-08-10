package com.no502zhang.registry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableEurekaServer
class App

fun main(args: Array<String>) {
    runApplication<App>(*args)
}

