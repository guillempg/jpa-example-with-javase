package com.guillempg.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    @Test
    public void setStreet() {
        Address a = new Address();
        Object output = a.setStreet("test street");
        assertTrue(output instanceof Address);
        assertTrue(a.getStreet().equals("test street"));
    }
}