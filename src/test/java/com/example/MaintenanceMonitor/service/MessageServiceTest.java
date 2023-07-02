package com.example.MaintenanceMonitor.service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageServiceTest {
    @Test
    void testGetMessage() {
        MessageService ms = new MessageService();
        assertEquals("Everything works as expected",ms.getMessage());
    }
    @Test
    void testSetMessage(){
        MessageService ms = new MessageService();
        ms.setMessage("this is a test");
        assertEquals("this is a test", ms.getMessage());
    }
    @Test
    void testResetMessage() {
        MessageService ms = new MessageService();
        ms.setMessage("this is a test");
        assertEquals("this is a test",ms.getMessage());
        ms.resetMessage();
        assertEquals("Everything works as expected",ms.getMessage());
    }
}
