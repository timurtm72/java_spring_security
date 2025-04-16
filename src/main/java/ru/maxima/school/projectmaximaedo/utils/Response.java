package ru.maxima.school.projectmaximaedo.utils;

import java.time.LocalDateTime;
import java.util.Date;

public class Response {
    private String message;
    private LocalDateTime timestamp;

    public Response(String message,LocalDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
