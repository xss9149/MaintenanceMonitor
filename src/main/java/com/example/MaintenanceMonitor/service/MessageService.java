package com.example.MaintenanceMonitor.service;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private static final String DEFAULT_MESSAGE = "Everything works as expected";
    private String currentMessage = DEFAULT_MESSAGE;

    public String getMessage() {
        return currentMessage;
    }

    public void setMessage(String message) {
        currentMessage = message;
}
}
