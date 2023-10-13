package com.multipolar.bootcamp.loggingexercise.repository;

import com.multipolar.bootcamp.loggingexercise.domain.AccessLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccessLogRepository extends MongoRepository<AccessLog, String> { }
