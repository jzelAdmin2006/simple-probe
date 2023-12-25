package com.jzel.simpleprobe

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@Service
class EndpointCheckerService(private val endpointRepository: EndpointRepository) {
    private val restTemplate = RestTemplate()

    fun checkEndpoints() {
        endpointRepository.findAll().forEach { endpoint ->
            try {
                restTemplate.getForObject<String>(endpoint.url)
            } catch (e: Exception) {
                println("Error when calling URL: ${endpoint.url} - ${e.message}")
            }
        }
    }
}
