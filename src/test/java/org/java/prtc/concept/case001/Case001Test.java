package org.java.prtc.concept.case001;

import org.junit.jupiter.api.Test;

import java.util.ConcurrentModificationException;

import static org.junit.jupiter.api.Assertions.*;

class Case001Test {
    @Test
    void fastFail() {
        Case001 fastFail = new Case001();
        assertThrows(ConcurrentModificationException.class, fastFail::fastFail);
    }
}
