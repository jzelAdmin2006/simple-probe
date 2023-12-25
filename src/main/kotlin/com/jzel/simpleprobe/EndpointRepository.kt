package com.jzel.simpleprobe

import org.springframework.data.mongodb.repository.MongoRepository

interface EndpointRepository : MongoRepository<Endpoint, String>
