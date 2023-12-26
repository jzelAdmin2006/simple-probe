package com.jzel.simpleprobe

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class ScheduledEndpointCheck(private val endpointCheckerService: EndpointCheckerService) {

    @Scheduled(fixedRate = 300000)
    fun checkEndpointsPeriodically() {
        endpointCheckerService.checkEndpoints()
    }
}
