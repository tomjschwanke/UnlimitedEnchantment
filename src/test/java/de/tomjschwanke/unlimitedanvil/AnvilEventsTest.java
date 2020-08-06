package de.tomjschwanke.unlimitedanvil;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class AnvilEventsTest {

    @DisplayName("Convert number to upside down string")
    @org.junit.jupiter.api.Test
    void upsideDownNumber() {
        AnvilEvents anvilEvents = new AnvilEvents();
        String result = anvilEvents.upsideDownNumber(1337);
        System.out.println(result);
        assertEquals("ㄥƐƐƖ", result);
    }
}