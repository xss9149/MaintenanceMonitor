package com.example.MaintenanceMonitor.controller;

import com.example.MaintenanceMonitor.service.MessageService;
import org.springframework.web.bind.annotation.*;
@RestController
public class MessageController {
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;

    }

    @GetMapping("/api/message")
    public String getMessage() {
        return messageService.getMessage();
    }

}
