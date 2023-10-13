package com.multipolar.bootcamp.loggingexercise.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection = "access_log_exercise")
public class AccessLog {
    @Id
    private String id;
    private String requestMethod;
    private String requestUri;
    private Integer responseStatusCode;
    private LocalDateTime timeStamp;
    private String content;
}
