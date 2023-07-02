package com.example.MaintenanceMonitor.service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageServiceTest {
    @Test
    void testGetMessage() {
        MessageService ms = new MessageService();
        assertEquals("Everything works as expected",ms.getMessage());
    }
}
