package agh.ii.prinjava.lab01.lst01_09;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testGetI1() {
        HelloImmutable hi = new HelloImmutable(32, "hello");
        assertEquals(32, hi.getI1());
    }
}